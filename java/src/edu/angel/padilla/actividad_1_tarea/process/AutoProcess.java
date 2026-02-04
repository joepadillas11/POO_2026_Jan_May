package edu.angel.padilla.actividad_1_tarea.process;

import edu.angel.padilla.actividad_1_tarea.data.Auto;
import java.util.ArrayList;
import java.util.List;

public class AutoProcess {

    private List<Auto> autos = new ArrayList<>();

  public void buildList() {
    autos.add(new Auto("Toyota", "Corolla", 2022, "Blanco", 4, "Automática", 220000));
    autos.add(new Auto("Toyota", "Yaris", 2023, "Rojo", 4, "Manual", 210000));
    autos.add(new Auto("Toyota", "Camry", 2021, "Negro", 4, "Automática", 280000));
    autos.add(new Auto("Toyota", "Hilux", 2022, "Gris", 4, "Manual", 350000));
    autos.add(new Auto("Toyota", "RAV4", 2023, "Azul", 4, "Automática", 320000));

    autos.add(new Auto("Mazda", "3", 2023, "Rojo", 4, "Manual", 250000));
    autos.add(new Auto("Mazda", "2", 2022, "Blanco", 4, "Manual", 200000));
    autos.add(new Auto("Mazda", "CX-5", 2021, "Negro", 4, "Automática", 330000));
    autos.add(new Auto("Mazda", "CX-30", 2023, "Gris", 4, "Automática", 310000));

    autos.add(new Auto("Ford", "Focus", 2021, "Negro", 4, "Automática", 210000));
    autos.add(new Auto("Ford", "Fiesta", 2022, "Blanco", 4, "Manual", 195000));
    autos.add(new Auto("Ford", "Escape", 2023, "Azul", 4, "Automática", 300000));
    autos.add(new Auto("Ford", "Mustang", 2021, "Rojo", 2, "Manual", 450000));

    autos.add(new Auto("Honda", "Civic", 2022, "Azul", 4, "Automática", 230000));
    autos.add(new Auto("Honda", "Accord", 2021, "Negro", 4, "Automática", 290000));
    autos.add(new Auto("Honda", "CR-V", 2023, "Blanco", 4, "Automática", 340000));
    autos.add(new Auto("Honda", "City", 2022, "Gris", 4, "Manual", 205000));

    autos.add(new Auto("Nissan", "Sentra", 2023, "Gris", 4, "Manual", 215000));
    autos.add(new Auto("Nissan", "Versa", 2022, "Blanco", 4, "Manual", 190000));
    autos.add(new Auto("Nissan", "Altima", 2021, "Negro", 4, "Automática", 275000));
    autos.add(new Auto("Nissan", "X-Trail", 2023, "Azul", 4, "Automática", 330000));

    autos.add(new Auto("Chevrolet", "Onix", 2021, "Plata", 4, "Manual", 195000));
    autos.add(new Auto("Chevrolet", "Aveo", 2022, "Blanco", 4, "Manual", 185000));
    autos.add(new Auto("Chevrolet", "Cruze", 2023, "Rojo", 4, "Automática", 260000));
    autos.add(new Auto("Chevrolet", "Tracker", 2021, "Negro", 4, "Automática", 310000));

    autos.add(new Auto("Hyundai", "Elantra", 2022, "Blanco", 4, "Automática", 240000));
    autos.add(new Auto("Hyundai", "Accent", 2021, "Gris", 4, "Manual", 200000));
    autos.add(new Auto("Hyundai", "Tucson", 2023, "Azul", 4, "Automática", 340000));

    autos.add(new Auto("Kia", "Rio", 2023, "Rojo", 4, "Manual", 205000));
    autos.add(new Auto("Kia", "Forte", 2022, "Blanco", 4, "Automática", 245000));
    autos.add(new Auto("Kia", "Sportage", 2021, "Negro", 4, "Automática", 335000));

    autos.add(new Auto("Volkswagen", "Jetta", 2021, "Negro", 4, "Automática", 260000));
    autos.add(new Auto("Volkswagen", "Polo", 2022, "Blanco", 4, "Manual", 210000));
    autos.add(new Auto("Volkswagen", "Tiguan", 2023, "Gris", 4, "Automática", 350000));
}


    public List<Auto> getAutos() {
        return autos;
    }
}
