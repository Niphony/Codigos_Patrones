package controller;

import model.Direccion;
import view.VistaConsola;

public class Controller {

    private VistaConsola vista;
    Direccion direccion = Direccion.getInstance("Cr 80c #4b-15");

    public Controller() {
        this.vista = new VistaConsola();  // Corregido: se asigna al atributo
    }

    public void run() {
        System.out.println("Buenas, mi nombre es juan y tengo direccion unica: ");
        vista.mostrarInformacion("Mi direccion es: " + direccion.getDir());
    }
}