package model.abstractos;

import view.VistaConsola;

public abstract class Soporte {
    protected Soporte siguiente;
    protected VistaConsola vista;

    public Soporte(VistaConsola vista) {
        this.vista = vista;
    }

    public void setSiguiente(Soporte siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void resolverProblema(String problema, int nivel);
}

