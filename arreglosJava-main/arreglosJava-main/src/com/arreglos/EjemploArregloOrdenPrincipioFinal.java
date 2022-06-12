package com.arreglos;

public class EjemploArregloOrdenPrincipioFinal {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = i+1;
        }

        for (int i = 0; i < numeros.length/2; i++){
            System.out.println("Numeros: " + numeros[i]);
            System.out.println(numeros[numeros.length-1-i]);

        }
    }
}
