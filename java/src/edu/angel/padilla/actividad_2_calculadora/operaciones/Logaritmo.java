package edu.angel.padilla.actividad_2_calculadora.operaciones;

public class Logaritmo {

    private Division div = new Division();

    public int calcular(int n) {
        if (n <= 0) throw new ArithmeticException("Logaritmo indefinido");

        int contador = 0;

        while (n >= 2) {
            n = div.calcular(n, 2);
            contador++;
        }

        return contador;
    }
}
