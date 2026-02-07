package edu.angel.padilla.actividad_2_calculadora_v2.operaciones;

/**
 * Multiplicación implementada usando solo sumas.
 * Hereda de Suma para reutilizar su método calcular().
 */
public class Multiplicacion extends Suma {

    @Override
    public int calcular(int a, int b) {
        boolean negativo = false;

        // Si b es negativo, cambiamos el signo
        if (b < 0) {
            b = super.calcular(0, b); // convierte a positivo
            negativo = true;
        }

        int resultado = 0;

        // Sumamos a repetidamente b veces
        for (int i = 0; i < b; i++) {
            resultado = super.calcular(resultado, a);
        }

        // Si era negativo, regresamos el signo
        return negativo ? super.calcular(0, resultado) : resultado;
    }
}
