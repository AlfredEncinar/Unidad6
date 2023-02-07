package Ejercicio2;

//Escribe un programa que contenga un método que reciba
// por parámetro el nombre de un fichero de texto que
// contiene varias líneas con una cantidad real en cada una de ellas
// (que habŕas creado con anterioridad con un editor de texto plano),
// y calcula su suma y su media. Incluye el tratamiento de excepciones.


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        mediaTexto();


    }

    public static void mediaTexto() {
        Scanner sc;

        try (FileInputStream fis = new FileInputStream("/home/estudiante/IdeaProjects/Unidad6/hola.txt")) {

            sc = new Scanner(fis);

            while (sc.hasNextDouble()) {
                double media = sc.nextDouble()+ sc.nextDouble()+ sc.nextDouble()+ sc.nextDouble();
                System.out.println(media/4);


            }

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }

    }
}
