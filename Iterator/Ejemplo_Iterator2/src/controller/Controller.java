package controller;

import model.MiIterador;
import model.coleccion.Inventario;
import view.VistaConsola;

public class Controller {
    private VistaConsola vista;
    private Inventario inventario;

    public Controller() {
        vista = new VistaConsola();
        inventario = new Inventario();
    }

    public void run() {
        MiIterador<String> iterador = inventario.crearIterador();
        while (iterador.tieneSiguiente()) {
            vista.mostrarinfo("Producto: " + iterador.siguiente());
        }
    }
}