package com.ejemplos.test;

import com.ejemplos.clases.Automovil;
import com.ejemplos.clases.Estanque;
import com.ejemplos.clases.Motor;
import com.ejemplos.clasesEnun.Color;
import com.ejemplos.clasesEnun.TipoMotor;

public class EjemploAutomovil {
    public static void main(String[] args) {
        /*SUBARU*/
        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        Estanque estanqueSubaru = new Estanque();

        subaru.setMotor(motorSubaru);
        subaru.setColor(Color.BLANCO);
        subaru.setEstanque(estanqueSubaru);


        /*Mazda*/
        Motor motorMazda = new Motor(3.0, TipoMotor.DIESEL);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, motorMazda);
        Estanque estanqueMazda = new Estanque(45);
        mazda.setEstanque(estanqueMazda);


        /*Nissan*/
        Motor motorNissan = new Motor(4.0, TipoMotor.DIESEL);
        Automovil nissan = new Automovil("Nissan", "Narvana", Color.GRIS, motorNissan);
        Estanque estanqueNissan = new Estanque(50);
        nissan.setEstanque(estanqueNissan);


        /*Imprimir resultado*/
        System.out.println("Subaru:" + subaru.verDetalle());
        System.out.println("Mazda: " + mazda.verDetalle());
        System.out.println("Nissan: " + nissan.verDetalle());
    }
}
