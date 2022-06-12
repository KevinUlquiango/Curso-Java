package com.kulquiango.interfaces.main.imprenta.modelo.interfaces;

public interface Imprimible {

    String TEXTO_DEFECTO = "Imprimiendo valor por defecto";

    /*
    Con default puede tener cuerpo el metodo y no es necesario que el hijo lo sobreescriba ya que
    se ejecutara el metodo de la interface.
    */
    //String imprimir(); la implemetacion sin default
    default String imprimir() {
        return TEXTO_DEFECTO ;
    }

    static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
