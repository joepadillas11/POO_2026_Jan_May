package edu.angel.padilla.actividad_2_calculadora_v2.operaciones;

/**
 * Logaritmo base 2 usando divisiones sucesivas.
 * Hereda de Division.
 */
public class Logaritmo extends Division {

    /**
     * Calcula log2(n) entero.
     */
    public int calcular(int n) {
        if (n <= 0) {
            throw new ArithmeticException("Logaritmo indefinido");
        }

        int contador = 0;

        while (n >= 2) {
            n = super.calcular(n, 2);
            contador++;
        }

        return contador;
    }
}
