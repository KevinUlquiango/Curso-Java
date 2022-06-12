package com.arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class BuscarElementoEnArreglo {
    public static void main(String[] args) {
        String[] a = new String[10];

        Scanner inputScan = new Scanner(System.in);
        System.out.println("Ingrese 10 valores numericos");
        for (int i = 0; i < a.length; i++) {
            a[i] = inputScan.next();
        }

        System.out.println("Ingrese el valor a buscar: ");
        String numeroABuscar = inputScan.next();

        /*Solo funciona con valores tipo string*/
        /*aslist Convierne un valores tipo array a un tipo list*/
        boolean numeroEncontrado = Arrays.asList(a).contains(numeroABuscar);
        System.out.println(numeroEncontrado == true ? "Valor Encontrado": "Valor no encontrado");
    }
}
