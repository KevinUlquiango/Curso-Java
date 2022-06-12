package com.arreglos;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Arreglos {

    private static void arreloInteger() {
        int[] numeros = new int[4];
        /*Asignar valores al arreglo*/
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        System.out.println("Imprimir arreglo numerico");
        for (int numero : numeros
        ) {
            System.out.println(numero);
        }
        System.out.println("=========================");
    }

    private static void arregloString() {
        String[] productos = new String[7];

        /*Asignar valores*/
        productos[0] = "Coca Cola";
        productos[1] = "Pizza";
        productos[2] = "Sanduche";
        productos[3] = "Mac";
        productos[4] = "Asus";
        productos[5] = "Leche";
        productos[6] = "Carne";

        System.out.println("Arreglo antes de usar Arrays");
        for (String producto : productos) {
            System.out.println(producto);
        }
        System.out.println("=========================");
        /*ORDENA DE LA A-Z - TAMBIEN ORDENA VALORES NUMERICOS*/
        Arrays.sort(productos);
        System.out.println("Arreglo ordenado alfabeticamente con el Arrays.sort(productos) ");
        for (String palabra : productos) {
            System.out.println(palabra);
        }
        System.out.println("=========================");
    }

    public static void main(String[] args) {
        Arreglos.arregloString();
        Arreglos.arregloString();

    }
}
