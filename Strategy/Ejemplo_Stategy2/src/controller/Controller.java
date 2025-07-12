package controller;

import model.EstrategiaCompresion; 
import model.ZIP;
import view.VistaConsola;

public class Controller {
    private VistaConsola vista;
    private EstrategiaCompresion estrategia;

    public Controller() {
        vista = new VistaConsola();
        estrategia = new ZIP();
    }

    public void cambiarEstrategia(EstrategiaCompresion nueva) {
        this.estrategia = nueva;
    }

    public void run() {
        vista.mostrarinfo(estrategia.comprimir("documento.pdf"));
    }
}