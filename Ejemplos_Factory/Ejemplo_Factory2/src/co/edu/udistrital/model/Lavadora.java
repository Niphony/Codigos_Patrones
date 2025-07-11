package co.edu.udistrital.model;

import co.edu.udistrital.model.interfaz.Electrodomestico;

public class Lavadora implements Electrodomestico {
    public void encender() {
        System.out.println("Lavadora encendida");
    }
    public void apagar() {
        System.out.println("Lavadora apagada");
    }
    public String tipo() {
        return "Lavadora";
    }
}