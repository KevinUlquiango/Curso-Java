package com.kulquiango.interfaces.test;

import com.kulquiango.interfaces.main.imprenta.modelo.elements.*;
import com.kulquiango.interfaces.main.imprenta.modelo.interfaces.Imprimible;

import static com.kulquiango.interfaces.main.imprenta.modelo.enums.Genero.*;
import static com.kulquiango.interfaces.main.imprenta.modelo.interfaces.Imprimible.*;


public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo("Hoja de vida", new Persona("Kevin", "Ulquiango"), "Redes y Telecomunicaciones");
        cv.addExperiencia("Java")
                .addExperiencia("React")
                .addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Luis", " Vargas"), "Patron de diseño", PROGRAMACION);
        libro.addPagina(new Pagina("Patron MVC"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Compositor"));

        Informe informe = new Informe("Estudio sobre informe de microservicios", new Persona("Martin", " Fowler"), "Luis");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        /*Clase anonima de interface*/
        imprimir(new Imprimible() {
        });
        System.out.println(TEXTO_DEFECTO);
    }


}
