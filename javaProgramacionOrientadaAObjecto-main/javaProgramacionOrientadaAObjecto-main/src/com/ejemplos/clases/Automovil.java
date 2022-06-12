package com.ejemplos.clases;

import com.ejemplos.clasesEnun.Color;
import com.ejemplos.clasesEnun.TipoAutomovil;

public class Automovil implements  Comparable <Automovil>{
    private int id;
    private String fabricante;
    private String modelo;
    private Color color;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRueda;
    private TipoAutomovil tipo;

    /*Variable statico*/
    private static Color colorPatente = Color.NARANJO;
    private static int capacidadEstanqueEstatico = 30;
    private static String colorPantente = "Naranja";
    private static int ultimoId;

    /*Cosntantes*/
    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    /*sobre carga de metodos inicio*/

    public Automovil() {
        this.id = ++ultimoId;
        this.ruedas = new Rueda[5];
    }

    public Automovil(String fabricante) {
        this();
        this.fabricante = fabricante;
    }

    public Automovil(String fabricante, String modelo) {
        this(fabricante);
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque, conductor);
        this.ruedas = ruedas;
    }
    /*sobre carga de metodos fin*/
    /*getter and setter inicio*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        if (estanque == null) {
            this.estanque = new Estanque();
        }
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Automovil addRueda(Rueda rueda) {
        if (indiceRueda < this.ruedas.length) {
            this.ruedas[indiceRueda++] = rueda;
        }
        return this;
    }

    public static String getColorPantente() {
        return colorPantente;
    }

    public static void setColorPantente(String colorPantente) {
        Automovil.colorPantente = colorPantente;
    }

    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }
    /*getter and setter fin*/


    /******************************************************************************************************************/
    /*METODOS INICIO*/
    public String verDetalle() {
        StringBuilder concatenar = new StringBuilder();

        concatenar.append("\n" + "____________________________________" + "\n");
        concatenar.append("Auto.id: " + this.id);
        concatenar.append("Auto.fabricante: " + this.fabricante + "\n");
        concatenar.append("Auto.modelo: " + this.modelo + "\n");
        if (getTipo() != null) {
            concatenar.append("Auto.tipo: " + this.getTipo().getDescripcion() + "\n");
        }
        concatenar.append("Auto.color: " + this.color + "\n");
        concatenar.append("Auto.colorPatente: " + colorPantente + "\n");
        concatenar.append("Auto.colindraje: " + this.motor.getCilindrada() + "\n");

        if (getConductor() != null) {
            concatenar.append("Conductor: " + this.getConductor());
        }

        if (getRuedas() != null) {
            for (Rueda rueda : this.getRuedas()
            ) {
                concatenar.append("\nRuedas Automovil " + this.getFabricante() + " : " + rueda.getFabricante() + ", aro: " + rueda.getAro() + ", ancho: " + rueda.getAncho());
            }
        }
        concatenar.append("\n____________________________________" + "\n");
        return concatenar.toString();
    }

    public float calcularConsumo(int km, float porcentajeBencina) {
        return km / (this.getEstanque().getCapacidad() * porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina) {
        return km / (this.getEstanque().getCapacidad() * (porcentajeBencina / 100f));
    }

    public static float calcularConsumoEstatico(int km, int porcentajeBencina) {
        return km / (Automovil.capacidadEstanqueEstatico * (porcentajeBencina / 100f));
    }
    /*METODOS FIN*/

    /******************************************************************************************************************/
//    /*SOBRE ESCRITURA INICIO*/
//    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Automovil)){
//            System.err.println("Solo se puede comparar objectos de tipo Automovil");
//        }
//        boolean validador = false;
//        try {
//            Automovil auto = (Automovil) obj;
//            validador=  (this.fabricante.equals(auto.getFabricante()) && (this.modelo.equals(auto.getModelo())));
//        }catch (Exception e) {
//            System.err.println("Error");
//            System.exit(1);
//        }
//        return validador;
//    }
//
    @Override
    public String toString() {
        return this.id + ": " + fabricante + " " + modelo;
    }

    @Override
    public int compareTo(Automovil a) {
        return this.fabricante.compareTo(a.fabricante);
    }

    /*SOBRE ESCRITURA FIN*/
}
