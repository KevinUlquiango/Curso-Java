package com.kulquiango.test;

import com.kulquiango.main.frutas.*;
import com.kulquiango.main.producto.Producto;

public class TestMain {
    public static void main(String[] args) {

        Producto[] productos = new Producto[8];
        /*Lacteos*/
        Lacteo leche = new Lacteo("Leche Tony", .80, 2, 10);
        Lacteo queso = new Lacteo("Queso Manaba", 1.50, 6, 9);

        /*Fruta*/
        Fruta manzana = new Fruta("Manzana", .25, .20, "Roja");
        Fruta platano = new Fruta("Platano", .15, .31, "Amarillo");

        /*Limpieza*/
        Limpieza jabon = new Limpieza("Lava Todo", .80, "sodio", 8);
        Limpieza shampooo = new Limpieza("Sedal", 1.20, "sodio", 4);

        /*No perecibles*/
        NoPerecible atun = new NoPerecible("Atun real", .80, 30, 60);
        NoPerecible miel = new NoPerecible("Selva", .60, 25, 6);

        productos[0] = leche;
        productos[1] = queso;
        productos[2] = manzana;
        productos[3] = platano;
        productos[4] = jabon;
        productos[5] = shampooo;
        productos[6] = atun;
        productos[7] = miel;

        for (Producto producto : productos
        ) {
            StringBuilder detallesDelProducto = new StringBuilder();
            detallesDelProducto
                    .append("\tDetalle del producto "+ producto.getClass().getSimpleName()+"\n")
                    .append("Nombre:" + producto.getNombre() + "\n")
                    .append("Precio: " + producto.getPrecio() + "\n");

            if (producto instanceof Lacteo) {
                detallesDelProducto
                        .append("Cantidad: " + ((Lacteo) producto).getCantidad() + "\n")
                        .append("Proteinas: " + ((Lacteo) producto).getProteinas() + "\n");
            } else if (producto instanceof Fruta) {
                detallesDelProducto
                        .append("Peso: " + ((Fruta) producto).getPeso() + "\n")
                        .append("Color: " + ((Fruta) producto).getColor() + "\n");
            } else if (producto instanceof Limpieza) {
                detallesDelProducto
                        .append("Componentes: " + ((Limpieza) producto).getComponentes() + "\n")
                        .append("Litros: " + ((Limpieza) producto).getLitros() + "\n");
            } else if (producto instanceof NoPerecible) {
                detallesDelProducto
                        .append("Contenido: " + ((NoPerecible) producto).getContenido() + "\n")
                        .append("Calorias: " + ((NoPerecible) producto).getCalorias() + "\n");
            }
            System.out.println(detallesDelProducto);
        }
    }
}
