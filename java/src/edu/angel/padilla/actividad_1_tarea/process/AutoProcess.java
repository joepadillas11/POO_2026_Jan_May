package edu.angel.padilla.actividad_1_tarea.process;

import edu.angel.padilla.actividad_1_tarea.data.Auto;
import java.util.ArrayList;
import java.util.List;

public class AutoProcess {

    private List<Auto> autos = new ArrayList<>();

  public void buildList() {
    autos.add(new Auto("Toyota", "Corolla", 2022, "Blanco", 4, "Automática", 220000));
    autos.add(new Auto("Mazda", "3", 2023, "Rojo", 4, "Manual", 250000));
    autos.add(new Auto("Ford", "Focus", 2021, "Negro", 4, "Automática", 210000));
    autos.add(new Auto("Honda", "Civic", 2022, "Azul", 4, "Automática", 230000));
    autos.add(new Auto("Nissan", "Sentra", 2023, "Gris", 4, "Manual", 215000));
    autos.add(new Auto("Chevrolet", "Onix", 2021, "Plata", 4, "Manual", 195000));
    autos.add(new Auto("Hyundai", "Elantra", 2022, "Blanco", 4, "Automática", 240000));
    autos.add(new Auto("Kia", "Rio", 2023, "Rojo", 4, "Manual", 205000));
    autos.add(new Auto("Volkswagen", "Jetta", 2021, "Negro", 4, "Automática", 260000));
    autos.add(new Auto("Renault", "Logan", 2022, "Gris", 4, "Manual", 190000));
}


    public List<Auto> getAutos() {
        return autos;
    }
}
