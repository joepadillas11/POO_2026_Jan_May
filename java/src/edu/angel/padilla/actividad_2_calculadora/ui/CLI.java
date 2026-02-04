package edu.angel.padilla.actividad_2_calculadora.ui;

// Importación de clases para realizar las operaciones matemáticas
import edu.angel.padilla.actividad_2_calculadora.operaciones.Division;
import edu.angel.padilla.actividad_2_calculadora.operaciones.Logaritmo;
import edu.angel.padilla.actividad_2_calculadora.operaciones.Modulo;
import edu.angel.padilla.actividad_2_calculadora.operaciones.Multiplicacion;
import edu.angel.padilla.actividad_2_calculadora.operaciones.Potencia;
import edu.angel.padilla.actividad_2_calculadora.operaciones.RaizCuadrada;
import edu.angel.padilla.actividad_2_calculadora.operaciones.Resta;
import edu.angel.padilla.actividad_2_calculadora.operaciones.Suma;
import java.util.Scanner;

public class CLI {

    // Objeto para leer datos desde el teclado
    private Scanner sc = new Scanner(System.in);

    // Objetos para cada operación
    private Suma suma = new Suma();
    private Resta resta = new Resta();
    private Multiplicacion mult = new Multiplicacion();
    private Division div = new Division();
    private Modulo mod = new Modulo();
    private Potencia pot = new Potencia();
    private RaizCuadrada raiz = new RaizCuadrada();
    private Logaritmo log = new Logaritmo();

    // Método principal que inicia la calculadora
    public void iniciar() {
        int opcion;

        // Ciclo que se repite hasta que el usuario elija salir
        do {
            // Muestra el menú de opciones
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Módulo");
            System.out.println("6. Potencia");
            System.out.println("7. Raíz cuadrada");
            System.out.println("8. Logaritmo base 2");
            System.out.println("0. Salir");
            System.out.print("\nOpción: ");
            opcion = sc.nextInt();

            int a, b; //Variables para almacenar los números ingresados

            // Evalúa la opción elegida por el usuario
            switch (opcion) {
                case 1:
                    System.out.print("\nPrimer número: ");
                    a = sc.nextInt();
                    System.out.print("\nSegundo número: ");
                    b = sc.nextInt();
                    System.out.println("\nResultado: " + suma.calcular(a, b));
                    break;

                case 2:
                    System.out.print("\nPrimer número: ");
                    a = sc.nextInt();
                    System.out.print("\nSegundo número: ");
                    b = sc.nextInt();
                    System.out.println("\nResultado: " + resta.calcular(a, b));
                    break;

                case 3:
                    System.out.print("\nPrimer número: ");
                    a = sc.nextInt();
                    System.out.print("\nSegundo número: ");
                    b = sc.nextInt();
                    System.out.println("\nResultado: " + mult.calcular(a, b));
                    break;

                case 4:
                    System.out.print("\nPrimer número: ");
                    a = sc.nextInt();
                    System.out.print("\nSegundo número: ");
                    b = sc.nextInt();
                    System.out.println("\nResultado: " + div.calcular(a, b));
                    break;

                case 5:
                    System.out.print("\nPrimer número: ");
                    a = sc.nextInt();
                    System.out.print("\nSegundo número: ");
                    b = sc.nextInt();
                    System.out.println("\nResultado: " + mod.calcular(a, b));
                    break;

                case 6:
                    System.out.print("\nOperandor: ");
                    a = sc.nextInt();
                    System.out.print("\nExponente: ");
                    b = sc.nextInt();
                    System.out.println("\nResultado: " + pot.calcular(a, b));
                    break;

                case 7:
                    System.out.print("\nNúmero: ");
                    a = sc.nextInt();
                    System.out.println("\nResultado: " + raiz.calcular(a));
                    break;

                case 8:
                    System.out.print("\nNúmero: ");
                    a = sc.nextInt();
                    System.out.println("\nResultado: " + log.calcular(a));
                    break;
            }

        } while (opcion != 0); //Termina cuando el usuario elige salir
    }
}
