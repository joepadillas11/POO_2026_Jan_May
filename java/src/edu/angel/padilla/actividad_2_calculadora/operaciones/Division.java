package edu.angel.padilla.actividad_2_calculadora.operaciones;

public class Division {

    private Resta resta = new Resta();

    public int calcular(int a, int b) {
        // Si el divisor es cero, lanza un error
        if (b == 0) throw new ArithmeticException("No se puede dividir entre cero");

        boolean negativo = false;
        if (a < 0) {
            a = resta.calcular(0, a);
            negativo = !negativo;
        }
        // Si b es negativo, se vuelve positivo y se invierte el signo final
        if (b < 0) {
            b = resta.calcular(0, b);
            negativo = !negativo;
        }
        int contador = 0; // Cuenta cuántas veces cabe b en a

        // Resta b repetidamente hasta que a sea menor que b
        while (a >= b) {
            a = resta.calcular(a, b);
            contador++;
        }
        return negativo ? resta.calcular(0, contador) : contador;
    }
}
