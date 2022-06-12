package com.arreglos;

import javax.swing.*;

public class EjercicioDos {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        System.out.println("Ingrese valores numericos en un rango de 11 a 99");

        for (int i = 0; i < numeros.length; i++) {
            int validador = 1;
            while (validador != 0) {
                try {
                    numeros[i]= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor " + (i + 1),"0"));
                    validador =  (numeros[i] >= 11 && numeros[i] <= 99) ? 0 : 1;
                    if(validador!=0){
                        System.err.println("Numero ingresado no esta dentro del rango establecido!!!");
                    }
                }catch (Exception e){
                    System.err.println("Solo se admite valores numericos");
                    System.exit(1);
                }


            }

        }

        //Encontrar el numero mayor
        int resultado = 0;
        for (int i = 0; i < numeros.length;i++){
            resultado =numeros[resultado]> numeros[i]?resultado:i;
        }
        System.out.println("El numero mayor es: " + numeros[resultado]);
    }
}
