package model;

import model.estados.EstadoDetenido;
import view.VistaConsola;

public class Semaforo {
    private Estado estado;
    private VistaConsola vista;

    public Semaforo(VistaConsola vista) {
        this.vista = vista;
        this.estado = new EstadoDetenido(vista); // Estado inicial
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void verde() {
        estado.reproducir();
    }

    public void amarillo() {
        estado.pausar();
    }

    public void rojo() {
        estado.detener();
    }
}