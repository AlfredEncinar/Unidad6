package Ejercicio1;

//Escribe un programa que contenga un método
// que reciba por parámetro el nombre de un fichero
// de texto (que habrás creado con anterioridad)
// y cuente las vocales
// (tanto mayúsculas como minúsculas) que aparecen en él.

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("/home/estudiante/IdeaProjects/Unidad6./hola.txt")){
            int vocales = 0;
            int leido;
            do {
                leido =fr.read();
                if (leido ==65|| leido==69||leido==73||leido==79||leido==19||leido==85||leido==97||leido==101||leido==105||leido==111)
                    vocales++;
            }while(leido!=-1);
            System.out.println("hay "+ vocales + " vocales en el documento.");

        }catch (FileNotFoundException e){
            System.out.println("Excepcion FileNotException");
        }catch (IOException e ){
            System.out.println("excepcion IO");
        }



    }
}
