package edu.angel.padilla.actividad_2_calculadora_v2.operaciones;

/**
 * Hereda de Resta para reutilizar su método calcular().
 */
public class Division extends Resta {

    @Override
    public int calcular(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }

        boolean negativo = false;

        // Convertimos a positivo si es necesario
        if (a < 0) {
            a = super.calcular(0, a);
            negativo = !negativo;
        }

        if (b < 0) {
            b = super.calcular(0, b);
            negativo = !negativo;
        }

        int contador = 0;

        // Restamos hasta que a sea menor que b
        while (a >= b) {
            a = super.calcular(a, b);
            contador++;
        }

        // Aplicamos signo si era negativo
        return negativo ? super.calcular(0, contador) : contador;
    }
}
