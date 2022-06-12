package com.kulquiango.interfaces.main.imprenta.modelo.abstracts;

public abstract class Hoja {

    protected String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    public abstract  String imprimir();


}
