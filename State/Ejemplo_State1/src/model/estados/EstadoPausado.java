package model.estados;

import model.EstadoReproductor;
import view.VistaConsola;

public class EstadoPausado implements EstadoReproductor {
    private VistaConsola vista;

    public EstadoPausado(VistaConsola vista) {
        this.vista = vista;
    }

    @Override
    public void reproducir() {
        vista.mostrarinfo("Reanudando la música...");
    }

    @Override
    public void pausar() {
        vista.mostrarinfo("La música ya está pausada.");
    }

    @Override
    public void detener() {
        vista.mostrarinfo("Deteniendo la música desde pausa...");
    }
}