package edu.angel.padilla.actividad_2_calculadora.operaciones;

public class Multiplicacion {

    private Suma suma = new Suma();
    private Resta resta = new Resta();

    public int calcular(int a, int b) {
        boolean negativo = false;

        if (b < 0) {
            b = resta.calcular(0, b);
            negativo = true;
        }

        int resultado = 0;
//*
// Este ciclo for implementa una multiplicación usando sumas repetidas  */
        for (int i = 0; i < b; i++) {
            resultado = suma.calcular(resultado, a);
        }

        return negativo ? resta.calcular(0, resultado) : resultado;
    }
}
