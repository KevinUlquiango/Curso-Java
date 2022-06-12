package com.kulquiango.interfaces.main.imprenta.modelo.elements;

import com.kulquiango.interfaces.main.imprenta.modelo.abstracts.Hoja;
import com.kulquiango.interfaces.main.imprenta.modelo.interfaces.Imprimible;

public class Informe extends Hoja implements Imprimible {
    private Persona autor;
    private String revisor;


    public Informe(String contenido, Persona autor, String revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por: " + this.autor.getNombre() + " " + this.autor.getApellido() +
                "\nRevisado por: " + this.revisor + "\n" +
                this.contenido;
    }
}
