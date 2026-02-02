package edu.angel.padilla.actividad3.Cadenas.test;

import edu.angel.padilla.actividad3.Cadenas.process.Cadenas;

/**
 * Pruebas manuales para la clase Cadenas.
 */
public class CadenasTest {

    public static void main(String[] args) {
        testPalindromoTrue();
        testPalindromoFalse();
        testContarVocales();
        testInvertir();
        testPrimeraPosicion();
        testPrimeraPosicionNoExiste();
    }

    private static void testPalindromoTrue() {
        if (Cadenas.esPalindromo("ana")) {
            System.out.println("test Palindromo True - PASÓ");
        } else {
            System.out.println("test Palindromo True - FALLÓ");
        }
    }

    private static void testPalindromoFalse() {
        if (!Cadenas.esPalindromo("hola mundo")) {
            System.out.println("test Palindromo False - PASÓ");
        } else {
            System.out.println("test Palindromo False - FALLÓ");
        }
    }

    private static void testContarVocales() {
        if (Cadenas.contarVocales("hola") == 2) {
            System.out.println("test Contar Vocales - PASÓ");
        } else {
            System.out.println("test Contar Vocales - FALLÓ");
        }
    }

    private static void testInvertir() {
        if (Cadenas.invertir("hola").equals("aloh")) {
            System.out.println("test Invertir - PASÓ");
        } else {
            System.out.println("test Invertir - FALLÓ");
        }
    }

    private static void testPrimeraPosicion() {
        if (Cadenas.primeraPosicion("hola", 'o') == 1) {
            System.out.println("test Primera Posicion - PASÓ");
        } else {
            System.out.println("test Primera Posicion - FALLÓ");
        }
    }

    private static void testPrimeraPosicionNoExiste() {
        if (Cadenas.primeraPosicion("hola", 'r') == -1) {
            System.out.println("test Primera Posicion No Existe - PASÓ");
        } else {
            System.out.println("test Primera Posicion No Existe - FALLÓ");
        }
    }
}
