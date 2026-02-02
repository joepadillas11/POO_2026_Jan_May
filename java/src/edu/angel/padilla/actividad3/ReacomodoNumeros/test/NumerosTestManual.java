package edu.angel.padilla.actividad3.ReacomodoNumeros.test;

import edu.angel.padilla.actividad3.ReacomodoNumeros.process.Numeros;
import java.util.List;

/**
 * Pruebas manuales para la clase Numeros.
 * Cada método imprime si la prueba pasó o falló.
 */
public class NumerosTestManual {

    public static void main(String[] args) {
        testMoverCerosDerecha();
        testContarPares();
    }

    private static void testMoverCerosDerecha() {
        List<Integer> entrada = List.of(0, 2, 1, 4, 0, 2);
        List<Integer> esperado = List.of(2, 1, 4, 2, 0, 0);
        List<Integer> resultado = Numeros.moverCerosDerecha(entrada);

        if (resultado.equals(esperado)) {
            System.out.println("test Mover Ceros Derecha - PASÓ");
        } else {
            System.out.println("test Mover Ceros Derecha - FALLÓ");
        }
    }

    private static void testContarPares() {
        int resultado = Numeros.contarPares(List.of(3, 4, 5, 7, 6));

        if (resultado == 2) {
            System.out.println("test Contar Pares - PASÓ");
        } else {
            System.out.println("test Contar Pares - FALLÓ");
        }
    }
}
