package Ejercicio3;

//Escribe programa que contenga un método que reciba
// por parámetro el nombre de un fichero de texto
// (que habrás creado con anterioridad)
// y cuente el número de palabras que contiene.


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("/home/estudiante/IdeaProjects/Unidad6/hola.txt")) {
            int leido;
            int contador = 0;

            do {
                leido = fr.read();

                if (leido == 32)
                    contador ++;
                if (leido == 46)
                    contador++;
            } while (leido != -1);

            System.out.println(contador);


        } catch (FileNotFoundException e) {
            System.out.println("no se encuentra el archivo");
        } catch (IOException e) {
            System.out.println("IOException");
        }

    }
}
