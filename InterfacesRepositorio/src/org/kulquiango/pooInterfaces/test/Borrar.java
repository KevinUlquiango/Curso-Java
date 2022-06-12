package org.kulquiango.pooInterfaces.test;

import org.kulquiango.pooInterfaces.main.exceptions.AccesoDatoException;

import java.io.IOException;

public class Borrar {

    double price;
    String bar;

    public Borrar() {
    }

    public Borrar(double price, String bar) {
        this.price = price;
        this.bar = bar;
    }

    public static void main(String[] args) {
        Borrar m1= new Borrar();

        Borrar m2= new Borrar(20,"AS");
        Borrar m3 = m1;
        m1.bar="AS";
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}
