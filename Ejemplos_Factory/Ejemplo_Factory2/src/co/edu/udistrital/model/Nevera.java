package co.edu.udistrital.model;

import co.edu.udistrital.model.interfaz.Electrodomestico;

public class Nevera implements Electrodomestico {
    public void encender() {
        System.out.println("Nevera encendida");
    }
    public void apagar() {
        System.out.println("Nevera apagada");
    }
    public String tipo() {
        return "Nevera";
    }
	
}
