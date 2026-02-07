package edu.angel.padilla.actividad_2_calculadora_v2.ui;

import edu.angel.padilla.actividad_2_calculadora_v2.operaciones.Calculadora;
import java.util.Scanner;

public class CLI {

    private Scanner sc = new Scanner(System.in);
    private Calculadora calc = new Calculadora();

    
    public void iniciar() {
        int opcion;

        do {
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

            int a, b;

            try {
                switch (opcion) {
                    case 1:
                        calc.setOperacion("suma");
                        System.out.print("Primer número: ");
                        a = sc.nextInt();
                        System.out.print("Segundo número: ");
                        b = sc.nextInt();
                        System.out.println("Resultado: " + calc.ejecutar(a, b));
                        break;

                    case 2:
                        calc.setOperacion("resta");
                        System.out.print("Primer número: ");
                        a = sc.nextInt();
                        System.out.print("Segundo número: ");
                        b = sc.nextInt();
                        System.out.println("Resultado: " + calc.ejecutar(a, b));
                        break;

                    case 3:
                        calc.setOperacion("multiplicacion");
                        System.out.print("Primer número: ");
                        a = sc.nextInt();
                        System.out.print("Segundo número: ");
                        b = sc.nextInt();
                        System.out.println("Resultado: " + calc.ejecutar(a, b));
                        break;

                    case 4:
                        calc.setOperacion("division");
                        System.out.print("Primer número: ");
                        a = sc.nextInt();
                        System.out.print("Segundo número: ");
                        b = sc.nextInt();
                        System.out.println("Resultado: " + calc.ejecutar(a, b));
                        break;

                    case 5:
                        calc.setOperacion("modulo");
                        System.out.print("Primer número: ");
                        a = sc.nextInt();
                        System.out.print("Segundo número: ");
                        b = sc.nextInt();
                        System.out.println("Resultado: " + calc.ejecutar(a, b));
                        break;

                    case 6:
                        calc.setOperacion("potencia");
                        System.out.print("Base: ");
                        a = sc.nextInt();
                        System.out.print("Exponente: ");
                        b = sc.nextInt();
                        System.out.println("Resultado: " + calc.ejecutar(a, b));
                        break;

                    case 7:
                        calc.setOperacion("raiz");
                        System.out.print("Número: ");
                        a = sc.nextInt();
                        System.out.println("Resultado: " + calc.ejecutar(a));
                        break;

                    case 8:
                        calc.setOperacion("logaritmo");
                        System.out.print("Número: ");
                        a = sc.nextInt();
                        System.out.println("Resultado: " + calc.ejecutar(a));
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (opcion != 0);
    }
}
