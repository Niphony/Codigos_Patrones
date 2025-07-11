package model.estados;

import model.EstadoReproductor;
import view.VistaConsola;

public class EstadoDetenido implements EstadoReproductor {
    private VistaConsola vista;

    public EstadoDetenido(VistaConsola vista) {
        this.vista = vista;
    }

    @Override
    public void reproducir() {
        vista.mostrarinfo("Comenzando a reproducir música...");
    }

    @Override
    public void pausar() {
        vista.mostrarinfo("No se puede pausar, la música está detenida.");
    }

    @Override
    public void detener() {
        vista.mostrarinfo("La música ya está detenida.");
    }
}