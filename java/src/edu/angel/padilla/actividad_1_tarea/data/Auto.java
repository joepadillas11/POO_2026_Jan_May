package edu.angel.padilla.actividad_1_tarea.data;

public class Auto {
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private int puertas;
    private String transmision;
    private double precio;

    public Auto(String marca, String modelo, int anio,
                String color, int puertas, String transmision, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.puertas = puertas;
        this.transmision = transmision;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // 👇 Ya no imprime — devuelve texto
    public String getInfo() {
        return "Marca: " + marca +
               "\nModelo: " + modelo +
               "\nAño: " + anio +
               "\nColor: " + color +
               "\nPuertas: " + puertas +
               "\nTransmisión: " + transmision +
               "\nPrecio: $" + precio;
    }
}
