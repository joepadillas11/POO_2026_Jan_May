package edu.angel.padilla.actividad3.Cadenas.process;

/**
 * Clase con métodos para trabajar con cadenas de texto.
 */
public class Cadenas {

    /**
     * Determina si una cadena es un palíndromo.
     * Ignora espacios y diferencia entre mayúsculas/minúsculas.
     *
     * @param texto Cadena a evaluar.
     * @return true si es palíndromo, false en caso contrario.
     */
    public static boolean esPalindromo(String texto) {
        String limpio = texto.replace(" ", "").toLowerCase();
        int i = 0;
        int j = limpio.length() - 1;

        while (i < j) {
            if (limpio.charAt(i) != limpio.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    /**
     * Cuenta el número de vocales en una cadena.
     *
     * @param texto Cadena de entrada.
     * @return Número de vocales.
     */
    public static int contarVocales(String texto) {
        int contador = 0;
        String vocales = "aeiouAEIOU";

        for (int i = 0; i < texto.length(); i++) {
            if (vocales.indexOf(texto.charAt(i)) != -1) {
                contador++;
            }
        }

        return contador;
    }

    /**
     * Invierte una cadena sin usar el método reverse.
     *
     * @param texto Cadena original.
     * @return Cadena invertida.
     */
    public static String invertir(String texto) {
        String resultado = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado += texto.charAt(i);
        }

        return resultado;
    }

    /**
     * Encuentra la primera posición de un carácter en una cadena
     * sin usar indexOf.
     *
     * @param texto Cadena donde buscar.
     * @param c Carácter a buscar.
     * @return Posición encontrada o -1 si no existe.
     */
    public static int primeraPosicion(String texto, char c) {
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }
}
