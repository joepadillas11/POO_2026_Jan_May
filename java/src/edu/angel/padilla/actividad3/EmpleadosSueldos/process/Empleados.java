package edu.angel.padilla.actividad3.EmpleadosSueldos.process;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Clase con métodos para operar sobre listas de empleados.
 */
public class Empleados {

    /**
     * Devuelve el empleado con mayor salario.
     *
     * @param empleados Lista de empleados.
     * @return Empleado con mayor salario.
     */
    public static Empleado mayorSalario(List<Empleado> empleados) {
        Empleado mayor = empleados.get(0);

        for (Empleado e : empleados) {
            if (e.getSalario() > mayor.getSalario()) {
                mayor = e;
            }
        }

        return mayor;
    }

    /**
     * Encuentra la edad más común entre los empleados.
     *
     * @param empleados Lista de empleados.
     * @return Edad más repetida.
     */
    public static int edadMasComun(List<Empleado> empleados) {
        Map<Integer, Integer> conteo = new HashMap<>();

        for (Empleado e : empleados) {
            int edad = e.getEdad();
            conteo.put(edad, conteo.getOrDefault(edad, 0) + 1);
        }

        int edadMasComun = empleados.get(0).getEdad();
        int max = 0;

        for (Map.Entry<Integer, Integer> entrada : conteo.entrySet()) {
            if (entrada.getValue() > max) {
                max = entrada.getValue();
                edadMasComun = entrada.getKey();
            }
        }

        return edadMasComun;
    }

    /**
     * Calcula el promedio de edad de los empleados.
     *
     * @param empleados Lista de empleados.
     * @return Promedio de edad.
     */
    public static double promedioEdad(List<Empleado> empleados) {
        double suma = 0;

        for (Empleado e : empleados) {
            suma += e.getEdad();
        }

        return suma / empleados.size();
    }

    /**
     * Calcula el promedio de salario de los empleados.
     *
     * @param empleados Lista de empleados.
     * @return Promedio de salario.
     */
    public static double promedioSalario(List<Empleado> empleados) {
        double suma = 0;

        for (Empleado e : empleados) {
            suma += e.getSalario();
        }

        return suma / empleados.size();
    }

    /**
     * Calcula el promedio de edad de empleados que ganan más de 25,000.
     *
     * @param empleados Lista de empleados.
     * @return Promedio de edad de empleados con salario > 25000.
     */
    public static double promedioEdadMayores25k(List<Empleado> empleados) {
        double suma = 0;
        int contador = 0;

        for (Empleado e : empleados) {
            if (e.getSalario() > 25000) {
                suma += e.getEdad();
                contador++;
            }
        }

        return suma / contador;
    }

    /**
     * Filtra empleados menores de 25 años.
     *
     * @param empleados Lista de empleados.
     * @return Lista de empleados menores de 25.
     */
    public static List<Empleado> menoresDe25(List<Empleado> empleados) {
        List<Empleado> resultado = new ArrayList<>();

        for (Empleado e : empleados) {
            if (e.getEdad() < 25) {
                resultado.add(e);
            }
        }

        return resultado;
    }

    /**
     * Cuenta cuántos empleados pertenecen al departamento de sistemas.
     *
     * @param empleados Lista de empleados.
     * @return Cantidad de empleados en sistemas.
     */
    public static int contarSistemas(List<Empleado> empleados) {
        int contador = 0;

        for (Empleado e : empleados) {
            if (e.getDepartamento().equalsIgnoreCase("sistemas")) {
                contador++;
            }
        }

        return contador;
    }

    /**
     * Devuelve el empleado con mayor salario que tenga más de 30 años.
     *
     * @param empleados Lista de empleados.
     * @return Empleado con mayor salario y edad > 30.
     */
    public static Empleado mayorSalarioMayor30(List<Empleado> empleados) {
        Empleado mayor = null;

        for (Empleado e : empleados) {
            if (e.getEdad() > 30) {
                if (mayor == null || e.getSalario() > mayor.getSalario()) {
                    mayor = e;
                }
            }
        }

        return mayor;
    }

    /**
     * Devuelve el empleado con menor salario cuya edad sea la menos común.
     *
     * @param empleados Lista de empleados.
     * @return Empleado con menor salario y edad menos común.
     */
    public static Empleado menorSalarioEdadMenosComun(List<Empleado> empleados) {
        Map<Integer, Integer> conteo = new HashMap<>();

        for (Empleado e : empleados) {
            int edad = e.getEdad();
            conteo.put(edad, conteo.getOrDefault(edad, 0) + 1);
        }

        int edadMenosComun = empleados.get(0).getEdad();
        int min = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entrada : conteo.entrySet()) {
            if (entrada.getValue() < min) {
                min = entrada.getValue();
                edadMenosComun = entrada.getKey();
            }
        }

        Empleado menorSalario = null;

        for (Empleado e : empleados) {
            if (e.getEdad() == edadMenosComun) {
                if (menorSalario == null || e.getSalario() < menorSalario.getSalario()) {
                    menorSalario = e;
                }
            }
        }

        return menorSalario;
    }
}
