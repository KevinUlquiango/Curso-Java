package com.arreglos;

import java.util.Arrays;

public class TercerArregloAPartirDeDosArreglos {
    public static void main(String[] args) {
        int[] a, b, c;
        a = new int[10];
        b = new int[10];
        c = new int[20];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = (i + 1) + 10;
        }

        int auxiliar = 0;
        for (int i = 0; i < 10; i++) {
            c[auxiliar++] = a[i];
            c[auxiliar++] = b[i];
        }

        Arrays.sort(c);
        for (int imprimir:c
             ) {
            System.out.println(imprimir);
        }
    }
}
