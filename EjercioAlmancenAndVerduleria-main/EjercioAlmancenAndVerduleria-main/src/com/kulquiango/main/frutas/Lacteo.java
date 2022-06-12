package com.kulquiango.main.frutas;

import com.kulquiango.main.producto.Producto;

public class Lacteo extends Producto {
    private int cantidad,proteinas;

    public Lacteo(String nombre, double precio, int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }
}
