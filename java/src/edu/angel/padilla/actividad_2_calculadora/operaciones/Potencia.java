package edu.angel.padilla.actividad_2_calculadora.operaciones;

public class Potencia {

    private Multiplicacion mult = new Multiplicacion();

    public int calcular(int base, int exponente) {
        if (exponente < 0) throw new ArithmeticException("Exponente negativo no soportado");

        int resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado = mult.calcular(resultado, base);
        }
        return resultado;
    }
}