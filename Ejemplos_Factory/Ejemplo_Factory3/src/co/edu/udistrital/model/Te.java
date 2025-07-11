package co.edu.udistrital.model;

import co.edu.udistrital.model.interfaz.Bebida;

public class Te implements Bebida {
    public void preparar() {
        System.out.println("Preparando té");
    }
    public void servir() {
        System.out.println("Sirviendo té");
    }
    public String tipo() {
        return "Té";
    }
}