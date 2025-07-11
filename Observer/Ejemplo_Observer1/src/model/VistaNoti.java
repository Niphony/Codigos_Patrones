package model;

import model.observer.MiObserver;
import view.VistaConsola;

public class VistaNoti implements MiObserver {
    private VistaConsola vista;
    
    public VistaNoti(VistaConsola vista) {
        this.vista = vista;
    }
    
    @Override
    public void actualizar(String mensaje) {
        vista.mostrarinfo("NOTIFICACIÓN: " + mensaje);
    }
}