package edu.angel.padilla.actividad3.EmpleadosSueldos.test;

import edu.angel.padilla.actividad3.EmpleadosSueldos.process.Empleado;
import edu.angel.padilla.actividad3.EmpleadosSueldos.process.Empleados;

import java.util.List;

/**
 * Pruebas manuales para la clase Empleados.
 */
public class EmpleadosTest {

    public static void main(String[] args) {
        List<Empleado> empleados = List.of(
                new Empleado("Ana", 22, 20000, "sistemas"),
                new Empleado("Luis", 30, 30000, "ventas"),
                new Empleado("Carlos", 30, 28000, "sistemas"),
                new Empleado("Marta", 40, 35000, "RH"),
                new Empleado("Sofia", 22, 18000, "sistemas")
        );

        testMayorSalario(empleados);
        testEdadMasComun(empleados);
        testPromedioEdad(empleados);
        testPromedioSalario(empleados);
        testPromedioEdadMayores25k(empleados);
        testMenoresDe25(empleados);
        testContarSistemas(empleados);
        testMayorSalarioMayor30(empleados);
        testMenorSalarioEdadMenosComun(empleados);
    }

    private static void testMayorSalario(List<Empleado> empleados) {
        if (Empleados.mayorSalario(empleados).getNombre().equals("Marta")) {
            System.out.println("test Mayor Salario - PASÓ");
        } else {
            System.out.println("test Mayor Salario - FALLÓ");
        }
    }

    private static void testEdadMasComun(List<Empleado> empleados) {
        if (Empleados.edadMasComun(empleados) == 22) {
            System.out.println("test Edad Mas Comun - PASÓ");
        } else {
            System.out.println("test Edad Mas Comun - FALLÓ");
        }
    }

    private static void testPromedioEdad(List<Empleado> empleados) {
        double resultado = Empleados.promedioEdad(empleados);

        if (Math.abs(resultado - 28.8) < 0.01) {
            System.out.println("test Promedio Edad - PASÓ");
        } else {
            System.out.println("test Promedio Edad - FALLÓ");
        }
    }

    private static void testPromedioSalario(List<Empleado> empleados) {
        double resultado = Empleados.promedioSalario(empleados);

        if (Math.abs(resultado - 26200) < 0.01) {
            System.out.println("test Promedio Salario - PASÓ");
        } else {
            System.out.println("test Promedio Salario - FALLÓ");
        }
    }

    private static void testPromedioEdadMayores25k(List<Empleado> empleados) {
        double resultado = Empleados.promedioEdadMayores25k(empleados);

        if (Math.abs(resultado - 33.33) < 0.1) {
            System.out.println("test Promedio Edad Mayores 25k - PASÓ");
        } else {
            System.out.println("test Promedio Edad Mayores 25k - FALLÓ");
        }
    }

    private static void testMenoresDe25(List<Empleado> empleados) {
        if (Empleados.menoresDe25(empleados).size() == 2) {
            System.out.println("test Menores De 25 - PASÓ");
        } else {
            System.out.println("test Menores De 25 - FALLÓ");
        }
    }

    private static void testContarSistemas(List<Empleado> empleados) {
        if (Empleados.contarSistemas(empleados) == 3) {
            System.out.println("test Contar Sistemas - PASÓ");
        } else {
            System.out.println("test Contar Sistemas - FALLÓ");
        }
    }

    private static void testMayorSalarioMayor30(List<Empleado> empleados) {
        if (Empleados.mayorSalarioMayor30(empleados).getNombre().equals("Marta")) {
            System.out.println("test Mayor Salario Mayor 30 - PASÓ");
        } else {
            System.out.println("test Mayor Salario Mayor 30 - FALLÓ");
        }
    }

    private static void testMenorSalarioEdadMenosComun(List<Empleado> empleados) {
        if (Empleados.menorSalarioEdadMenosComun(empleados).getNombre().equals("Luis")) {
            System.out.println("test Menor Salario Edad Menos Comun - PASÓ");
        } else {
            System.out.println("test Menor Salario Edad Menos Comun . FALLÓ");
        }
    }
}
