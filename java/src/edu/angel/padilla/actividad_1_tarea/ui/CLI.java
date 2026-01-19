package edu.angel.padilla.actividad_1_tarea.ui;

import edu.angel.padilla.actividad_1_tarea.process.AutoProcess;
import edu.angel.padilla.actividad_1_tarea.process.VentaProcess;
import edu.angel.padilla.actividad_1_tarea.data.Auto;
import edu.angel.padilla.actividad_1_tarea.data.Ticket;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;


public class CLI {

    private AutoProcess autoProcess = new AutoProcess();
    private VentaProcess ventaProcess = new VentaProcess();
    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        autoProcess.buildList();
        List<Auto> autos = autoProcess.getAutos();
        List<Ticket> tickets = new ArrayList<>();
        boolean continuarPrograma = true;

        while (continuarPrograma) {


        System.out.print("Ingrese nombre del cliente: ");
        String cliente = scanner.nextLine();

        // Mostrar marcas disponibles
        System.out.println("\nMarcas disponibles:");
        autos.stream()
                .map(Auto::getMarca)
                .distinct()
                .forEach(m -> System.out.println("- " + m));

        List<Auto> autosFiltrados;

        while (true) {
            System.out.print("\nIngrese una marca válida: ");
            String marca = scanner.nextLine();

            autosFiltrados = autos.stream()
                    .filter(a -> a.getMarca().equalsIgnoreCase(marca))
                    .collect(Collectors.toList());

            if (autosFiltrados.isEmpty()) {
                System.out.println("Marca no válida. Intente con alguna de las mostradas anteriormente.");
            } else {
                break;
            }
        }

        // Mostrar autos de esa marca
        System.out.println("\nAutos disponibles de esa marca:");
        for (int i = 0; i < autosFiltrados.size(); i++) {
            Auto a = autosFiltrados.get(i);
            System.out.println((i + 1) + ". " + a.getModelo() + " - $" + a.getPrecio());
        }

        int opcion;
        while (true) {
            System.out.print("\nSeleccione un auto (1 - " + autosFiltrados.size() + "): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Debe ingresar un número.");
                scanner.next();
                continue;
            }

            opcion = scanner.nextInt();

            scanner.nextLine();
            if (opcion < 1 || opcion > autosFiltrados.size()) {
                System.out.println("Opción fuera de rango.");
            } else {
                break;
            }
        }

        Auto seleccionado = autosFiltrados.get(opcion - 1);
        Ticket ticket = ventaProcess.generarVenta(cliente, seleccionado);

        System.out.println(ticket.getTicketInfo());
        tickets.add(ticket);

        System.out.print("\n¿Desea comprar otro vehículo? (s/n): ");
        String respuesta = scanner.nextLine();

            if (!respuesta.equalsIgnoreCase("s")) {
                continuarPrograma = false;
            }

        }

        System.out.println("\n========= RESUMEN DE COMPRAS =========");
        for (Ticket t : tickets) {
            System.out.println(t.getTicketInfo());
        }

        System.out.println("\nFelicidades por tu compra");
    }

}

