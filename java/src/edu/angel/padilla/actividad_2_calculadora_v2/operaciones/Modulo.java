package edu.angel.padilla.actividad_2_calculadora_v2.operaciones;

/**
 * Módulo (residuo) implementado usando solo restas.
 */
public class Modulo extends Resta {

    @Override
    public int calcular(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }

        // Convertimos a positivos
        if (a < 0) a = super.calcular(0, a);
        if (b < 0) b = super.calcular(0, b);

        // Restamos hasta que a < b
        while (a >= b) {
            a = super.calcular(a, b);
        }

        return a;
    }
}
