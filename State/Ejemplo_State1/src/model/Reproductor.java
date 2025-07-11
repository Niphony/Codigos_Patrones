package model;

import model.estados.EstadoDetenido;
import view.VistaConsola;

public class Reproductor {
    private EstadoReproductor estado;
    private VistaConsola vista;

    public Reproductor(VistaConsola vista) {
        this.vista = vista;
        this.estado = new EstadoDetenido(vista); // Estado inicial
    }

    public void setEstado(EstadoReproductor estado) {
        this.estado = estado;
    }

    public void reproducir() {
        estado.reproducir();
    }

    public void pausar() {
        estado.pausar();
    }

    public void detener() {
        estado.detener();
    }
}