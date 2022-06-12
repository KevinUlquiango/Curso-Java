package ulquiango.excepciones.main;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class EjemploExcepciones {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        Scanner scaner = new Scanner(System.in);
        ;


        try {
            System.out.println("Ingrese valor: ");
            int divisor = parseInt(scaner.nextLine());
            double resultado = calculadora.dividir(10, divisor);
            double divisor2 = calculadora.dividir("12", "w");
            System.out.println(resultado);
            System.out.println("Division 2" + divisor2);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Error al Transformar");
            main(args);
        } catch (NumeroFormatoException e) {
            System.out.println("Error: " + e);
            System.out.println("==");
            e.printStackTrace(System.out);
            System.out.println("==");
            main(args);
        } catch (DivisionPorCeroException e) {
            System.out.println("Error Exception customer: " + e);
        } finally {
            System.out.println("Finaly");
        }
        System.out.println("Continua Ejecucion");

    }
}
