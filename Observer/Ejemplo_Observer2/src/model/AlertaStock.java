package model;

import model.observer.MiObserver;
import view.VistaConsola;

public class AlertaStock implements MiObserver {
    private VistaConsola vista;
    
    public AlertaStock(VistaConsola vista) {
        this.vista = vista;
    }
    
    @Override
    public void actualizar(String mensaje) {
        vista.mostrarinfo("ALERTA: " + mensaje);
    }
}