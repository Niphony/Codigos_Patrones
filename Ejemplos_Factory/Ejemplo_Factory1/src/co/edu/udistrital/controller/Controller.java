package co.edu.udistrital.controller;

import co.edu.udistrital.model.interfaz.Transporte;
import co.edu.udistrital.model.interfaz.concretoCreador.Fabrica;
import co.edu.udistrital.view.VistaConsola;

public class Controller {

    private VistaConsola vista;

    public Controller() {
        vista = new VistaConsola();
    }

    public void run() {
    	String tipo = vista.leerString("Escriba el tipo de transporte (moto o carro): ").toLowerCase();


        Transporte t1 = Fabrica.construir(tipo);

        if (t1 != null) {
            t1.arrancar();
            t1.detener();
            
            vista.mostrarInformacion("Tipo de transporte: " + t1.tipo());
        } else {
            vista.mostrarInformacion("Tipo de transporte no válido.");
        }
    }
}
