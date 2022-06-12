package com.kulquiango.interfaces.main.imprenta.modelo.elements;

import com.kulquiango.interfaces.main.imprenta.modelo.abstracts.Hoja;
import com.kulquiango.interfaces.main.imprenta.modelo.interfaces.Imprimible;

public class Pagina extends Hoja implements Imprimible {
    public Pagina(String contenido) {
        super(contenido);
    }

    @Override
    public String imprimir() {
        return this.contenido;
    }
}
