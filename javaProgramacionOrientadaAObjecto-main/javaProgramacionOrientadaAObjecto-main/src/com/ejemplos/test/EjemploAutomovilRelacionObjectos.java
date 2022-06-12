package com.ejemplos.test;

import com.ejemplos.clases.*;
import com.ejemplos.clasesEnun.Color;
import com.ejemplos.clasesEnun.TipoAutomovil;
import com.ejemplos.clasesEnun.TipoMotor;

public class EjemploAutomovilRelacionObjectos {
    public static void main(String[] args) {

        Rueda[] ruedasSuburu = new Rueda[5];
        Persona conductorSubaru = new Persona("Luci", "Martinez");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        //subaru.setRuedas(ruedasSuburu);
        for (int i = 0; i < ruedasSuburu.length; i++) {
            subaru.addRueda(new Rueda("Yakohama", 16, 7.5));
        }

        Rueda[] ruedasMazda = new Rueda[5];
        Persona conductorMazda = new Persona("Patricio", "Rodriguez");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(conductorMazda);
        //mazda.setRuedas(ruedasMazda);
        for (int i = 0; i < ruedasMazda.length; i++) {
            mazda.addRueda(new Rueda("Michellin", 18, 10.2));
        }


        Rueda[] ruedasNissan = new Rueda[5];
        Persona conductorNissan = new Persona("Beatriz", "Gonzales");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.setConductor(conductorNissan);
        //nissan.setRuedas(ruedasNissan);
        for (int i = 0; i < ruedasNissan.length; i++) {
            nissan.addRueda(new Rueda("Pirelli", 20, 11.5));
            ;
        }


        Persona conductorNissan2 = new Persona("Lalo", "Mena");
        Automovil nissan2 = new Automovil("Nissan2", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA), new Estanque(50), conductorNissan2);
        nissan2.setColor(Color.AMARILLO);
        nissan2.setTipo(TipoAutomovil.PICKUP);
        nissan2.addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5));
        Automovil.setColorPatente(Color.AZUL);


        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());


    }
}
