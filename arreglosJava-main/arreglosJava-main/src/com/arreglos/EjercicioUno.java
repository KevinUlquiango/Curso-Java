package com.arreglos;

import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);

        int j = 0;
        while (j!=10){
            System.out.print("Ingrese el valor para la casilla " + (j+1) + ": ");
            numeros[j] = scanner.nextInt();
            j++;
        }

       for (int i = 0; i <numeros.length / 2; i++){

           System.out.println("El valor posicion " + i +": " + numeros[i]);
           System.out.println("El valor posicion " + (numeros.length - i - 1) +": " + numeros[numeros.length - i - 1]);
           System.out.println();
       }
    }
}
