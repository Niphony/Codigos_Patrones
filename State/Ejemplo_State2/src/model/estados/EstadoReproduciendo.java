package model.estados;

import model.Estado;
import view.VistaConsola;

public class EstadoReproduciendo implements Estado {
    private VistaConsola vista;

    public EstadoReproduciendo(VistaConsola vista) {
        this.vista = vista;
    }

    @Override
    public void reproducir() {
        vista.mostrarinfo("El semaforo esta en verde");
    }

    @Override
    public void pausar() {
        vista.mostrarinfo("Esta cambiando a amarillo");
    }

    @Override
    public void detener() {
        vista.mostrarinfo("Es rojo, toca detenerse.");
    }
}