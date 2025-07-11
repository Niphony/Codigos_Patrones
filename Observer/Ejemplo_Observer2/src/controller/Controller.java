package controller;

import model.AlertaStock;
import model.Inventario;
import view.VistaConsola;

public class Controller {
    private Inventario sistema;
    private VistaConsola vista;
    
    public Controller() {
        vista = new VistaConsola();
        sistema = new Inventario();
        sistema.registrarObserver(new AlertaStock(vista));
    }
    
    public void run() {
        sistema.notificarObservers("Pañitos agotados");
}
}