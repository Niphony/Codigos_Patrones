package model.estados;

import model.EstadoReproductor;
import view.VistaConsola;

public class EstadoReproduciendo implements EstadoReproductor {
    private VistaConsola vista;

    public EstadoReproduciendo(VistaConsola vista) {
        this.vista = vista;
    }

    @Override
    public void reproducir() {
        vista.mostrarinfo("Ya se está reproduciendo música.");
    }

    @Override
    public void pausar() {
        vista.mostrarinfo("Pausando la música...");
    }

    @Override
    public void detener() {
        vista.mostrarinfo("Deteniendo la música...");
    }
}
