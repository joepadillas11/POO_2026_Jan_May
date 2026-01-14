package edu.angel.padilla.actividad_1_tarea.ui;

import edu.angel.padilla.actividad_1_tarea.process.AutoProcess;
import edu.angel.padilla.actividad_1_tarea.process.VentaProcess;
import edu.angel.padilla.actividad_1_tarea.data.Auto;
import edu.angel.padilla.actividad_1_tarea.data.Ticket;

import java.util.List;
import java.util.Scanner;

public class CLI {

    private AutoProcess autoProcess = new AutoProcess();
    private VentaProcess ventaProcess = new VentaProcess();
    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        autoProcess.buildList();
        List<Auto> autos = autoProcess.getAutos();

        System.out.print("Ingrese nombre del cliente: ");
        String cliente = scanner.nextLine();

        System.out.println("\nAutos disponibles:");
        for (int i = 0; i < autos.size(); i++) {
            System.out.println((i + 1) + ". " + autos.get(i).getMarca() + " " + autos.get(i).getModelo());
        }

        int opcion = -1;
        while (true) {
            System.out.print("\nSeleccione un auto (1 - " + autos.size() + "): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número válido entre 1 y " + autos.size());
                scanner.next(); // descarta entrada inválida
                continue;
            }

            opcion = scanner.nextInt();

            if (opcion < 1 || opcion > autos.size()) {
                System.out.println("Opción fuera de rango. Valores válidos: 1 a " + autos.size());
            } else {
                break;
            }
        }

        Auto seleccionado = autos.get(opcion - 1);
        Ticket ticket = ventaProcess.generarVenta(cliente, seleccionado);

        System.out.println(ticket.getTicketInfo());
    }
}
