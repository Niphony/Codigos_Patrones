package controller;

import model.EstrategiaNavegacion; 
import model.RutaRapida;
import view.VistaConsola;

public class Controller {
    private VistaConsola vista;
    private EstrategiaNavegacion estrategia;

    public Controller() {
        vista = new VistaConsola();
        estrategia = new RutaRapida();
    }

    public void run() {
        vista.mostrarinfo(estrategia.calcularRuta("Madrid", "Barcelona"));
    }
}