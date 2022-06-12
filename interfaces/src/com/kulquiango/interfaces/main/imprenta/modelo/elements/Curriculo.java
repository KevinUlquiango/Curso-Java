package com.kulquiango.interfaces.main.imprenta.modelo.elements;

import com.kulquiango.interfaces.main.imprenta.modelo.abstracts.Hoja;
import com.kulquiango.interfaces.main.imprenta.modelo.interfaces.Imprimible;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja implements Imprimible {
    private Persona persona;
    private String carrera;
    private List<String> experiencias;


    public Curriculo(String contenido, Persona persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculo addExperiencia(String experiencia) {
        experiencias.add(experiencia);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder datosExperiencia = new StringBuilder("Nombre: ");
        datosExperiencia.append(this.persona.getNombre() + " " + this.persona.getApellido()).append("\n")
                .append("Resumen: ").append(this.contenido).append("\n")
                .append("Profesion: ").append(this.carrera).append("\n")
                .append("Experiencias: \n");

        for (String exp : this.experiencias
        ) {
            datosExperiencia.append("- ").append(exp).append("\n");
        }
        return datosExperiencia.toString();
    }
}
