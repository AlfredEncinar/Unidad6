package Ejercicio7;

//A partir de los datos de temperaturas por cada
// hora del día 1 de enero de 2023 en Huesca,
// escribe un método que cree un archivo de almacenamiento de datos (no de caracteres)
// con la siguiente estructura:
//- El primer registro es la cadena "1 de enero de 2023"
//- El resto de registros lo componen los 24 pares hora-temperatura.
//
//La hora será un entero de 0 a 23 y la temperatura
// un número con un decimal
// (las temperaturas puedes simularlas con un Math.random())


import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio7 {
    public static void main(String[] args) {
        temeratura("temperatura.txt");

    }
    public static void temeratura(String fileName) {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("temperatura.txt"))) {
            out.writeUTF("1 de enero de 2023");
            for (int i = 0; i < 24; i++) {
                out.writeInt(i);
                out.writeDouble(Math.random() * 30);
            }
            System.out.println("Los datos de temperatura han sido guardados con éxito.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: ");
        }
    }
}
