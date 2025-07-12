package controller;

import model.FiltroOfensivo;
import model.FiltroSpam;
import model.abstractos.Filtro;
import view.VistaConsola;

public class Controller {
    private VistaConsola vista;
    private Filtro cadenaFiltros;

    public Controller() {
        vista = new VistaConsola();
        configurarCadena();
    }

    private void configurarCadena() {
        Filtro spam = new FiltroSpam(vista);
        Filtro ofensivo = new FiltroOfensivo(vista);

        spam.setSiguiente(ofensivo);
        cadenaFiltros = spam;
    }

    public void run() {
        cadenaFiltros.procesarMensaje("¡Gana dinero rápido!", 2); // Ejemplo: Filtrado como spam
    }
}