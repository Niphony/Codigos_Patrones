package controller;

import model.CEO;
import model.Director;
import model.abstractos.Aprobador;
import model.concretos.Gerente;
import view.VistaConsola;

public class Controller {
    private VistaConsola vista;
    private Aprobador cadenaAprobacion;

    public Controller() {
        vista = new VistaConsola();
        configurarCadena();
    }

    private void configurarCadena() {
        Aprobador gerente = new Gerente(vista);
        Aprobador director = new Director(vista);
        Aprobador ceo = new CEO(vista);

        gerente.setSiguiente(director);
        director.setSiguiente(ceo);
        cadenaAprobacion = gerente;
    }

    public void run() {
        cadenaAprobacion.procesarCompra(8000); 
    }
}
