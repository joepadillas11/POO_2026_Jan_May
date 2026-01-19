package edu.angel.padilla.actividad_2_calculadora.operaciones;

public class RaizCuadrada {

    private Resta resta = new Resta();

    // Método que calcula la raíz cuadrada entera de un número
    public int calcular(int n) {
        // Si el número es negativo, lanza un error
        if (n < 0) throw new ArithmeticException("No existe raíz");

        int impar = 1;     
        int resultado = 0;

        while (n >= impar) {
            n = resta.calcular(n, impar); 
            impar += 2;
            resultado++;
        }
        return resultado;
    }
}
