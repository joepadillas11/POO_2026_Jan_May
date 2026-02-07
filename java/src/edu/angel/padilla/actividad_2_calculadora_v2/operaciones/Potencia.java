package edu.angel.padilla.actividad_2_calculadora_v2.operaciones;

public class Potencia extends Multiplicacion {

    public int calcular(int base, int exponente) {
        if (exponente < 0) {
            throw new ArithmeticException("Exponente negativo no soportado");
        }

        int resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado = super.calcular(resultado, base);
        }

        return resultado;
    }
}
