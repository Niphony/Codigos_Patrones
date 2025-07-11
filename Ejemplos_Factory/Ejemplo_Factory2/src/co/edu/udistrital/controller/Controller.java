package co.edu.udistrital.controller;

import co.edu.udistrital.model.interfaz.Electrodomestico;
import co.edu.udistrital.model.interfaz.concretoCreador.Fabrica;
import co.edu.udistrital.model.interfaz.concretoCreador.FabricaE;
import co.edu.udistrital.view.VistaConsola;

public class Controller {

    private VistaConsola vista;

    public Controller() {
        vista = new VistaConsola();
    }

    public void run() {
    	String tipo = vista.leerString("Escriba el tipo de Electrodomestico que necesite (Lavadora o Nevera): ").toLowerCase();


        Electrodomestico t1 = FabricaE.construir(tipo);

        if (t1 != null) {
            t1.encender();
            t1.apagar();
            
            vista.mostrarInformacion("Tipo de Electrodomestico: " + t1.tipo());
        } else {
            vista.mostrarInformacion("Tipo de electrodomestico no válido.");
        }
    }
}
