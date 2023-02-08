package Ejercicio5;

//Escribe un programa que pida al usuario
// una cadena de caracteres y la guarde al
// revés en un archivo de texto cuyo nombre
// se pasará como segundo argumento.

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una cadena de caracteres: ");
        String original = sc.nextLine();
        String reversed = new StringBuilder(original).reverse().toString();

        System.out.print("Ingresa el nombre del archivo: ");
        String fileName = sc.nextLine();
        sc.close();

        try (FileWriter writer = new FileWriter(fileName + ".txt")) {
            writer.write(reversed);
            System.out.println("El archivo ha sido guardado con éxito.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: ");
        }
    }

}

