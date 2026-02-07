package edu.angel.padilla.actividad_2_calculadora_v2.operaciones;

public class RaizCuadrada extends Resta {

    public int calcular(int n) {
        if (n < 0) {
            throw new ArithmeticException("No existe raíz cuadrada de negativos");
        }

        int impar = 1;
        int resultado = 0;

        // Restamos números impares consecutivos
        while (n >= impar) {
            n = super.calcular(n, impar);
            impar += 2;
            resultado++;
        }

        return resultado;
    }
}
