package co.edu.udistrital.controller;

import co.edu.udistrital.model.interfaz.Bebida;
import co.edu.udistrital.model.interfaz.concretoCreador.Fabrica;
import co.edu.udistrital.model.interfaz.concretoCreador.FabricaB;
import co.edu.udistrital.view.VistaConsola;

public class Controller {

    private VistaConsola vista;

    public Controller() {
        vista = new VistaConsola();
    }

    public void run() {
    	String tipo = vista.leerString("Escriba que tipo de bebida desea (Café o Te): ").toLowerCase();


        Bebida t1 = FabricaB.construir(tipo);

        if (t1 != null) {
            t1.preparar();
            t1.servir();
            
            vista.mostrarInformacion("Tipo de Accion: " + t1.tipo());
        } else {
            vista.mostrarInformacion("Tipo de Accion no válido.");
        }
    }
}
