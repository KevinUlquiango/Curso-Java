package com.arreglos;

import java.util.Scanner;

public class IncrementarArray {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);

        /*Pedimos al usuario ingresar los nuevos valores */
        System.out.println("Ingrese 10 valores numericos: ");
        for (int i = 0; i <numeros.length; i++){
            numeros[i] = scanner.nextInt();
        }
        /*Ingresamos el nuevo valor*/
        System.out.println("Ingrese el nuevo valor: ");
        int nuevoValor = scanner.nextInt();

        /*Ingresamos la nueva posicion*/
        System.out.println("Ingrese la posicion en donde desea ingrsar el nuevo elemento: ");
        int posicion = scanner.nextInt();

        System.out.println("======Array original========");

        for (int valor: numeros
             ) {
            System.out.print(valor + ", ");
        }

        /*Creamos un nuevo array*/
        int[] nuevoArray = new int[numeros.length+1];

        /*Ingresamos el nuevo valor en la posicion especificada*/

        for (int i = 0; i < nuevoArray.length; i++){
            if(i<posicion){
                nuevoArray[i] = numeros[i];
            }else if(i==posicion){
                nuevoArray[i] = nuevoValor;
            }else if(i>posicion){
                nuevoArray[i] = numeros[i-1];
            }
        }
        System.out.println();
        /*Imprmimos el nuevo array*/
        for (int nuevo:nuevoArray
             ) {
            System.out.print(nuevo + ", ");
        }

    }
}
