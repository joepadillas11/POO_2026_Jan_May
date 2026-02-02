package edu.angel.padilla.actividad3.EmpleadosSueldos.process;

/**
 * Representa a un empleado con nombre, edad, salario y departamento.
 */
public class Empleado {

    private String nombre;
    private int edad;
    private double salario;
    private String departamento;

    /**
     * Constructor de la clase Empleado.
     *
     * @param nombre Nombre del empleado.
     * @param edad Edad del empleado.
     * @param salario Salario del empleado.
     * @param departamento Departamento del empleado.
     */
    public Empleado(String nombre, int edad, double salario, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
    }

    /** @return Nombre del empleado. */
    public String getNombre() {
        return nombre;
    }

    /** @return Edad del empleado. */
    public int getEdad() {
        return edad;
    }

    /** @return Salario del empleado. */
    public double getSalario() {
        return salario;
    }

    /** @return Departamento del empleado. */
    public String getDepartamento() {
        return departamento;
    }
}
