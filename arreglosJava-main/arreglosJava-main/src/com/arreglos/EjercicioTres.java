package com.arreglos;

import java.util.Scanner;

public class EjercicioTres {
    private int  totalDeCeros = 0, totalNegativos = 0, totalPositivos = 0;
    private double positivos = 0, negativos = 0;
    private Scanner inputScan = new Scanner(System.in);
    private int[] numero = new int[7];

    private void ingresarValoresNumerico() {
        System.out.println("Ingrese 10 valores tipo numericos: ");
        for (int i = 0; i < numero.length; i++) {
            System.out.print("Ingrese el valor N° " + (i + 1) + ": ");
            numero[i] = inputScan.nextInt();
            if (numero[i] > 0) {
                sumaPositivos(numero[i]);
            } else if (numero[i] == 0) {
                totalDeCeros();
            } else if (numero[i] < 0) {
                sumaNegativos(numero[i]);
            }
        }

    }

    private void sumaPositivos(int numero) {
        this.positivos += numero;
        totalPositivos++;
    }

    private void sumaNegativos(int numero) {
        this.negativos += numero;
        totalNegativos++;
    }

    private void totalDeCeros() {
        totalDeCeros++;
    }

    private void calcularResultados() {
        if (totalPositivos != 0) {
            positivos /= totalPositivos;
        }
        if (totalNegativos != 0) {
            negativos /= totalNegativos;
        }
    }

    private void imprimirResultado() {
        calcularResultados();
        System.out.println("Suma total Positivo: " + positivos);
        System.out.println("Suma toral Negativos: " + negativos);
        System.out.println("Total de ceros: " + totalDeCeros);
    }

    public static void main(String[] args) {
        EjercicioTres ejercicio = new EjercicioTres();
        ejercicio.ingresarValoresNumerico();
        ejercicio.imprimirResultado();
    }
}
