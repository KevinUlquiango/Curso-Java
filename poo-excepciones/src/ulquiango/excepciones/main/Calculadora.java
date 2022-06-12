package ulquiango.excepciones.main;

import static java.lang.Integer.parseInt;

public class Calculadora {
    public double dividir(int numerador, int divisor) throws DivisionPorCeroException {
        if (divisor == 0) {
            throw new DivisionPorCeroException("No se puede dividir");
        }
        return (double) numerador / divisor;
    }

    public double dividir(String numerador, String divisor) throws DivisionPorCeroException, NumeroFormatoException {
        try {
            int num = parseInt(numerador);
            int div= parseInt(divisor);
            return this.dividir(num,div);
        }catch (NumberFormatException e){
            throw new NumeroFormatoException("Debe ingresar valores Numericos");
        }



    }
}
