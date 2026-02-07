package edu.angel.padilla.actividad_2_calculadora_v2.operaciones;

public class Calculadora {

    private Operacion operacion;

    /**
     * Selecciona dinámicamente la operación que se va a usar.
     */
    public void setOperacion(String tipo) {
        switch (tipo.toLowerCase()) {
            case "suma": operacion = new Suma(); break;
            case "resta": operacion = new Resta(); break;
            case "multiplicacion": operacion = new Multiplicacion(); break;
            case "division": operacion = new Division(); break;
            case "modulo": operacion = new Modulo(); break;
            case "potencia": operacion = new Potencia(); break;
            case "raiz": operacion = new RaizCuadrada(); break;
            case "logaritmo": operacion = new Logaritmo(); break;
        }
    }

    /**
     * Ejecuta operaciones binarias (2 operandos).
     */
    public int ejecutar(int a, int b) {
        return operacion.calcular(a, b);
    }

    /**
     * Ejecuta operaciones unarias (1 operando).
     */
    public int ejecutar(int a) {
        return operacion.calcular(a, 0);
    }
}
