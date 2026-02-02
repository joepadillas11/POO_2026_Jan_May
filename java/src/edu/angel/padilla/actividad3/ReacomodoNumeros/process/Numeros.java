package edu.angel.padilla.actividad3.ReacomodoNumeros.process;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que contiene métodos para operar sobre listas de números enteros.
 */
public class Numeros {

    /**
     * Mueve todos los ceros al final de la lista sin cambiar el orden
     * de los demás números.
     *
     * @param numeros Lista de enteros.
     * @return Nueva lista con los ceros al final.
     */
    public static List<Integer> moverCerosDerecha(List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<>();
        int ceros = 0;

        for (int n : numeros) {
            if (n == 0) {
                ceros++;
            } else {
                resultado.add(n);
            }
        }

        for (int i = 0; i < ceros; i++) {
            resultado.add(0);
        }

        return resultado;
    }

    /**
     * Cuenta cuántos números pares existen en una lista.
     *
     * @param numeros Lista de enteros.
     * @return Cantidad de números pares.
     */
    public static int contarPares(List<Integer> numeros) {
        int contador = 0;

        for (int n : numeros) {
            if (n % 2 == 0) {
                contador++;
            }
        }

        return contador;
    }
}
