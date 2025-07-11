package controller;

import model.Instanoti;
import model.VistaNoti;
import view.VistaConsola;

public class Controller {
    private Instanoti sistema;
    private VistaConsola vista;
    
    public Controller() {
        vista = new VistaConsola();
        sistema = new Instanoti();
        sistema.registrarObserver(new VistaNoti(vista));
    }
    
    public void run() {
        sistema.nuevaNotificacion("Te ha llegado una notificavion de amistad ✉️");
    }
}