package controller;

import model.PantallaTemperatura;
import model.SensorTemperatura;
import view.VistaConsola;

public class Controller {
    private SensorTemperatura sistema;
    private VistaConsola vista;
    
    public Controller() {
        vista = new VistaConsola();
        sistema = new SensorTemperatura();
        sistema.registrarObserver(new PantallaTemperatura(vista));
    }
    
    public void run() {
        sistema.notificarObservers("Te ha llegado una notificavion de amistad ✉️");
    }
}