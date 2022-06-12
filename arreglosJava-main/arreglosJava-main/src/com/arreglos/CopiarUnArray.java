package com.arreglos;

public class CopiarUnArray
{
    public static void main(String[] args) {
        int[] arrayOriginals = {1,2,3,4,5};
        int[] arraynuevo = {1,14,5,10,14,8,9,10};
        /*
        remplaza los valores del primer array en el segundo, en este caso
        los valores 3,4 seran remplazados por los valores 8,9
                         array original     desde array remplazara
        System.arraycopy(arrayOriginals,    2,
                         array destino      la posicion inicio de remplazo      numeros de elementos a copiar
                         arraynuevo,        5,                                  2)
        antes: 1,14,5,10,14,8,9,10
        despues: 1,14,5,10,14,3,4,10
        */

        System.arraycopy(arrayOriginals,2,arraynuevo,5,2);
        for (int nuevo:arraynuevo
             ) {
            System.out.println(nuevo);
        }
    }
}
