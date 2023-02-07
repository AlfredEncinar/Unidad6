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
        String[] array = new String[1];




        System.out.println("Introduce un String o  cadedna de caracteres");

        llenaArrray(array);

        try(FileWriter fw = new FileWriter("adio.txt")){

            array = fw.append();
        }catch (FileNotFoundException e){
            System.out.println("FileNotFoundException");
        }catch (IOException e){
            System.out.println("IOException");
        }



    }

    public static void llenaArrray(String[] array) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 1; i++) {



            array[i] = sc.next();
        }


}}
