package com.arreglos;

public class AlgoritmoBurbuja {
    public static void main(String[] args) {
        String[] productos = {"Coca Cola", "Pizza", "Sanduche", "Mac", "Asus", "Leche", "Carne"};
        int total = productos.length;
        int contador = 0;
        for (int i = 0; i < total -2; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if (productos[j + 1].compareTo(productos[j]) < 0) {
                    String auxiliar = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = auxiliar;
                }
                contador++;
            }
        }

        for (int i = 0; i < total; i++) {
            System.out.println("Producto " + i + ": " + productos[i]);
        }
        System.out.println(contador);
    }
}
