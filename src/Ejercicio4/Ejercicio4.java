package Ejercicio4;


//Escribe un programa que
// contenga un método que reciba por parámetro el nombre
// de un fichero de texto (que habrás creado con anterioridad)
// y lo muestre por pantalla sin espacios en blanco.


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio4 {

    public static void main(String[] args) {
        blanco = args[0];
    }

    public void sinEspacios(){
        try (FileReader fr = new FileReader("/home/estudiante/IdeaProjects/Unidad6./hola.txt")) {
            int leido;

            do {
                leido = fr.read();


            } while (leido != -1);




        } catch (FileNotFoundException e) {
            System.out.println("no se encuentra el archivo");
        } catch (IOException e) {
            System.out.println("IOException");
        }

    }
}
