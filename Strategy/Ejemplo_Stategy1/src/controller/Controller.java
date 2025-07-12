package controller;

import model.MetodoPago;
import model.TarjetaCredito;
import view.VistaConsola;

public class Controller {
    private VistaConsola vista;
    private MetodoPago estrategiaPago;

    public Controller() {
        vista = new VistaConsola();
    }

    public void setEstrategiaPago(MetodoPago estrategia) {
        this.estrategiaPago = estrategia;
    }

    public void run() {
        setEstrategiaPago(new TarjetaCredito()); 
        vista.mostrarinfo(estrategiaPago.pagar(100.50));
    }
}