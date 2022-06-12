package com.arreglos;

import java.util.Scanner;

public class DeterminarElMayor {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        int auxiliar = 0;
        for (int i = 1; i < numeros.length; i++) {
            auxiliar = (numeros[auxiliar]>numeros[i])?auxiliar:i;
        }
        System.out.println("El numero mayor es: " + numeros[auxiliar]);
    }
}
