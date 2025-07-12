package controller;

import model.ListaNumeros;
import model.MiIterador;
import view.VistaConsola;

public class Controller {
    private VistaConsola vista = new VistaConsola();
    private ListaNumeros lista = new ListaNumeros();

    public void run() {
        MiIterador<Integer> iterador = lista.crearIterador();
        while (iterador.tieneSiguiente()) {
            vista.mostrarinfo("Número: " + iterador.siguiente());
        }
    }
}