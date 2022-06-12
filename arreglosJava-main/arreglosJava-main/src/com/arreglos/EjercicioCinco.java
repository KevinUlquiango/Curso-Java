package com.arreglos;

import java.util.Scanner;

public class EjercicioCinco {
    int[] numeros = new int[12];
    int[] histograma = new int[6];
    Scanner entradaDeDatos = new Scanner(System.in);

    private void pedirDatosAlUsuario() {
        int datoIngresado;
        System.out.println("Ingrese los 12 numeros dentro del rango de 1 a 6");
        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.print("Ingresa el valor N° " + (i + 1) + " : ");
                datoIngresado = entradaDeDatos.nextInt();
                if (datoIngresado >= 1 && datoIngresado <= 6) {
                    numeros[i] = datoIngresado;
                } else {
                    System.err.println("Solo se permite un rango de 1 a 6");
                    System.exit(1);
                }

            } catch (Exception e) {
                System.err.println("Solo se admite valores numericos");
                System.exit(1);
            }
        }
    }

    private void histograma() {
        //obtenemos el numero de veces que se repite el dato
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 1) {

                histograma[0] ++;
            } else if (numeros[i] == 2) {
                histograma[1]++;
            } else if (numeros[i] == 3) {
                histograma[2] ++;
            } else if (numeros[i] == 4) {
                histograma[3]++;
            } else if (numeros[i] == 5) {
                histograma[4]++;
            } else if (numeros[i] == 6) {
                histograma[5] ++;
            }
        }

        //imprimos el resultado
        for (int i = 0; i < histograma.length; i++) {
            System.out.println((i + 1) + ": " + imprimirPuntos(histograma[i]));
        }
    }

    private String imprimirPuntos(int numeroDeVecesARepetir) {
        String puntos = "";
        for (int i = 0; i < numeroDeVecesARepetir; i++) {
            puntos += "*";
        }
        return puntos;
    }

    public static void main(String[] args) {
        EjercicioCinco ejercicio = new EjercicioCinco();
        ejercicio.pedirDatosAlUsuario();
        ejercicio.histograma();

    }
}
