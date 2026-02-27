package ui;

import process.Switch;

public class CLI {
    public static void start(){
        Switch switch_wifi = new Switch();
        System.out.println("Bienvenidos al programa");
        System.out.println("el switch");
        if (switch_wifi.isOn()){
            System.out.println("desea apagar el switch:");
        } else { System.out.println("desea prender el switch:");

        }
        System.out.println("Es switch esta"+switch_wifi.isOn());
    }
}
