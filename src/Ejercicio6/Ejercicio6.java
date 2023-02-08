package Ejercicio6;

//Escribe un método que reciba como argumento el nombre
// de un fichero de texto (que habrás creado con anterioridad)
// y convierta a mayúsculas sus caracteres y los vuelque
// en otro fichero que se pasará como segundo argumento.
// Utiliza buffering.


import java.io.*;

public class Ejercicio6 {
    public static void main(String[] args) {

        converitMayuscula("hola.txt","adios.txt");

    }
        public static void converitMayuscula(String inputFileName, String outputFileName) {
            try (BufferedReader reader = new BufferedReader(new FileReader("hola.txt"));
                 BufferedWriter writer = new BufferedWriter(new FileWriter("adios.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    writer.write(line.toUpperCase());
                    writer.newLine();
                }
                System.out.println("El archivo ha sido convertido y guardado con éxito.");
            } catch (IOException e) {
                System.out.println("Error al leer o escribir el archivo: " + e.getMessage());
            }
        }
}
