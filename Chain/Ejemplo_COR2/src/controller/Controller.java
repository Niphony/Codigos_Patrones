package controller;


import model.SoporteNivel1;
import model.SoporteNivel2;
import model.abstractos.Soporte;
import view.VistaConsola;

public class Controller {
    private VistaConsola vista;
    private Soporte cadenaSoporte;

    public Controller() {
        vista = new VistaConsola();
        configurarCadena();
    }

    private void configurarCadena() {
        Soporte nivel1 = new SoporteNivel1(vista);
        Soporte nivel2 = new SoporteNivel2(vista);

        nivel1.setSiguiente(nivel2);
        cadenaSoporte = nivel1;
    }

    public void run() {
        cadenaSoporte.resolverProblema("Error de conexión", 2);
    }
}