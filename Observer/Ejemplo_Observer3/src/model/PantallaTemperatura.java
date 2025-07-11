package model;

import model.observer.MiObserver;
import view.VistaConsola;

public class PantallaTemperatura implements MiObserver {
    private VistaConsola vista;
    
    public PantallaTemperatura(VistaConsola vista) {
        this.vista = vista;
    }
    
    @Override
    public void actualizar(String mensaje) {
        vista.mostrarinfo(mensaje);
    }
}