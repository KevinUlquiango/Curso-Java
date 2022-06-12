package kulquiango.test;

import kulquiango.main.entities.*;

import java.util.List;

public class main {
    public static void main(String[] args) {
        BolsaSupermercado<Fruta> frutaBolsaSupermercado = new BolsaSupermercado<>();
        frutaBolsaSupermercado.addProducto(new Fruta("Manzana", 0.50, 150, "Roja"));
        frutaBolsaSupermercado.addProducto(new Fruta("Coco", 1.00, 250, "Blanco"));
        frutaBolsaSupermercado.addProducto(new Fruta("Naranja", 0.30, 250, "Anaranjado"));
        frutaBolsaSupermercado.addProducto(new Fruta("Uva", 0.20, 550, "Violeta"));
        frutaBolsaSupermercado.addProducto(new Fruta("Frutilla", 0.10, 450, "Roja"));

        BolsaSupermercado<Lacteo> lacteosBolsaSupermercado = new BolsaSupermercado<>();
        lacteosBolsaSupermercado.addProducto(new Lacteo("Leche", 0.80, 150, 20));
        lacteosBolsaSupermercado.addProducto(new Lacteo("Chocolateada", 1.50, 250, 30));
        lacteosBolsaSupermercado.addProducto(new Lacteo("Queso", 2.30, 250, 40));
        lacteosBolsaSupermercado.addProducto(new Lacteo("Yogur", 2.20, 550, 74));
        lacteosBolsaSupermercado.addProducto(new Lacteo("Malteada", 1.10, 450, 46));

        BolsaSupermercado<Limpieza> LimpiezaBolsaSupermercado = new BolsaSupermercado<>();
        LimpiezaBolsaSupermercado.addProducto(new Limpieza("Lava Todo", 0.80, "Detergente", 20));
        LimpiezaBolsaSupermercado.addProducto(new Limpieza("Limpia", 1.50, "Cloro", 30));
        LimpiezaBolsaSupermercado.addProducto(new Limpieza("Protes", 2.30, "Jabon", 40));
        LimpiezaBolsaSupermercado.addProducto(new Limpieza("EGO", 2.20, "Alcohol gel", 74));
        LimpiezaBolsaSupermercado.addProducto(new Limpieza("Desifectante de platos", 1.10, "Cloro", 46));

        BolsaSupermercado<NoPerecible> noPereciblesBolsaSupermercado = new BolsaSupermercado<>();
        noPereciblesBolsaSupermercado.addProducto(new NoPerecible("Arroz", 0.80, 150, 20));
        noPereciblesBolsaSupermercado.addProducto(new NoPerecible("Chocolateada", 1.50, 250, 30));
        noPereciblesBolsaSupermercado.addProducto(new NoPerecible("Chetos", 2.30, 250, 40));
        noPereciblesBolsaSupermercado.addProducto(new NoPerecible("Atun", 2.20, 550, 74));
        noPereciblesBolsaSupermercado.addProducto(new NoPerecible("Refresco", 1.10, 450, 46));

        System.out.println("=====Frutas=====");
        for (Fruta fruta: frutaBolsaSupermercado.getProducto()
        ) {
            System.out.println("Nombre: " + fruta.getNombre());
            System.out.println("Color: " + fruta.getColor());
            System.out.println("Precio: " + fruta.getPrecio());
            System.out.println("Peso: " + fruta.getPeso());
            System.out.println();
        }

        System.out.println("=====Lacteos=====");
        for (Lacteo lacteo: lacteosBolsaSupermercado.getProducto()
        ) {
            System.out.println("Nombre: " + lacteo.getNombre());
            System.out.println("Cantidad: " + lacteo.getCantidad());
            System.out.println("Precio: " + lacteo.getPrecio());
            System.out.println("Proteina: " + lacteo.getProteina());
            System.out.println();
        }
        System.out.println("=====Limpieza=====");
        for (Limpieza lacteo: LimpiezaBolsaSupermercado.getProducto()
        ) {
            System.out.println("Nombre: " + lacteo.getNombre());
            System.out.println("Componente: " + lacteo.getComponentes());
            System.out.println("Precio: " + lacteo.getPrecio());
            System.out.println("Litros: " + lacteo.getLitros());
            System.out.println();
        }
        System.out.println("=====NoPerecibles=====");
        for (NoPerecible lacteo: noPereciblesBolsaSupermercado.getProducto()
        ) {
            System.out.println("Nombre: " + lacteo.getNombre());
            System.out.println("Calorias: " + lacteo.getCalorias());
            System.out.println("Precio: " + lacteo.getPrecio());
            System.out.println("Contenido: " + lacteo.getContenido());
            System.out.println();
        }
    }

}
