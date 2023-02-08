package Ejercicio8;

//Utiliza el fichero del ejercicio anterior
// y crea un método que permita visualizar los
// datos que contiene de manera clara por pantalla.
// Además deberá mostrar la media, la máxima y
// la mínima de las temperaturas de ese día.

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ejercicio8 {
    public static void main(String[] args) {

    }

    public static void displayTemperatureData(String fileName) {
        try (DataInputStream din = new DataInputStream(new FileInputStream("temperatura.txt"))) {
            String date = din.readUTF();
            System.out.println("Fecha: " + date);
            int hora;
            double temepratura;
            double sum = 0;
            double max = Integer.MIN_VALUE;
            double min = Integer.MAX_VALUE;
            for (int i = 0; i < 24; i++) {
                hora = din.readInt();
                temepratura = din.readDouble();
                System.out.println("Hora: " + hora + " Temperatura: " + temepratura);
                sum += temepratura;
                max = Math.max(max, temepratura);
                min = Math.min(min, temepratura);
            }
            double media = sum / 24;
            System.out.println("Media: " + media);
            System.out.println("Máxima: " + max);
            System.out.println("Mínima: " + min);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }


}
