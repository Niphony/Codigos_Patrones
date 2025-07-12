package model.abstractos;

import view.VistaConsola;

public abstract class Filtro {
    protected Filtro siguiente;
    protected VistaConsola vista;

    public Filtro(VistaConsola vista) {
        this.vista = vista;
    }

    public void setSiguiente(Filtro siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void procesarMensaje(String mensaje, int severidad);
}

