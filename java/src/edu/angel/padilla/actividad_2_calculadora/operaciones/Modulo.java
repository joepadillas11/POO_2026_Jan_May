package edu.angel.padilla.actividad_2_calculadora.operaciones;

public class Modulo {

    private Resta resta = new Resta();

    public int calcular(int a, int b) {
        // Si el divisor es cero, lanza un error
        if (b == 0) throw new ArithmeticException("No se puede dividir entre cero");

        // Convierte a y b a positivos si son negativos
        if (a < 0) a = resta.calcular(0, a);
        if (b < 0) b = resta.calcular(0, b);

        // Resta b repetidamente hasta que a sea menor que b
        while (a >= b) {
            a = resta.calcular(a, b);
        }
        // Devuelve el residuo
        return a;
    }
}
