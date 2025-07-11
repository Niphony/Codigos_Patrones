package co.edu.udistrital.model;

import co.edu.udistrital.model.interfaz.Bebida;

public class Cafe implements Bebida {
    public void preparar() {
        System.out.println("Preparando café");
    }
    public void servir() {
        System.out.println("Sirviendo café");
    }
    public String tipo() {
        return "Café";
    }
}