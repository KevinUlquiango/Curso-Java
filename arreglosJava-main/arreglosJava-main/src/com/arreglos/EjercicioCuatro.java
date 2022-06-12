package com.arreglos;

import java.util.HashMap;
import java.util.Scanner;

public class EjercicioCuatro {
    private int[] numeros = new int[10];
    private int[] validador = new int[10];
    private Scanner inputScan = new Scanner(System.in);

    private void ingresarValoresNumerico() {
        System.out.println("Ingrese 10 valores tipo numerico");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el valor de N° " + (i + 1) + ": ");
            numeros[i] = inputScan.nextInt();
        }
    }

    private void determinarMayorRecurrenteyMasRepetido() {
        for (int i = 0; i < numeros.length; i++) {
            int contador = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                   contador++;

                }
            }
            validador[i] = contador;
        }

        //Validamos el resultado
        int resultado =0;
        for (int i = 0; i <10 ; i++) {
            resultado = validador[resultado]>validador[i]?resultado:i;
        }

        System.out.println("El numero que mas se repite es: " + numeros[resultado]);
        System.out.println("La mayor ocurrencias es: " + validador[resultado]);

    }

    public static void main(String[] args) {
        EjercicioCuatro EjercicioCuatro = new EjercicioCuatro();
        EjercicioCuatro.ingresarValoresNumerico();
        EjercicioCuatro.determinarMayorRecurrenteyMasRepetido();
    }

}
