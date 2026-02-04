package edu.angel.padilla.actividad_1_tarea.data;

import java.time.LocalDate;

public class Ticket {
    private String cliente;
    private Auto auto;
    private LocalDate fecha;
    private double total;

    public Ticket(String cliente, Auto auto) {
        this.cliente = cliente;
        this.auto = auto;
        this.fecha = LocalDate.now();
        this.total = auto.getPrecio();
    }

    public String getTicketInfo() {
        return "\n======= TICKET DE VENTA =======\n" +
               "Cliente: " + cliente + "\n" +
               auto.getInfo() + "\n" +
               "Fecha: " + fecha + "\n" +
               "Total: $" + total;
    }
}
