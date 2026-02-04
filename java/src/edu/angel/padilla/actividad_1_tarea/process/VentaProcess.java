package edu.angel.padilla.actividad_1_tarea.process;

import edu.angel.padilla.actividad_1_tarea.data.Auto;
import edu.angel.padilla.actividad_1_tarea.data.Ticket;

public class VentaProcess {

    public Ticket generarVenta(String cliente, Auto auto) {
        return new Ticket(cliente, auto);
    }
}
