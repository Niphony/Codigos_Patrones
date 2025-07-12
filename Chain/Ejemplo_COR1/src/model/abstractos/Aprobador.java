package model.abstractos;

import view.VistaConsola;

public abstract class Aprobador {
    protected Aprobador siguiente;
    protected VistaConsola vista;

    public Aprobador(VistaConsola vista) {
        this.vista = vista;
    }

    public void setSiguiente(Aprobador siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void procesarCompra(double monto);
}
