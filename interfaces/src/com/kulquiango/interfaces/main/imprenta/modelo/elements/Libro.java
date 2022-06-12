package com.kulquiango.interfaces.main.imprenta.modelo.elements;

import com.kulquiango.interfaces.main.imprenta.modelo.abstracts.Hoja;
import com.kulquiango.interfaces.main.imprenta.modelo.enums.Genero;
import com.kulquiango.interfaces.main.imprenta.modelo.interfaces.Imprimible;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible {
    private List<Imprimible> paginas;
    private Persona autor;
    private String titulo;
    private Genero genero;

    public Libro(Persona autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina (Imprimible pagina){
        paginas.add(pagina);
        return this;
    }

    @Override
    public String imprimir(){
        StringBuilder datosDelLibro = new StringBuilder("Titulo: ");
        datosDelLibro.append(this.titulo).append("\n")
                .append("Autor: ").append(this.autor.getNombre() + " " + this.autor.getApellido()).append("\n")
                .append("Genero: ").append(this.genero).append("\n");
        for (Imprimible pagina:this.paginas
             ) {
            datosDelLibro.append(pagina.imprimir()).append("\n");
        }
        return datosDelLibro.toString();
    }
}
