package controller;

import model.facade.Facade;
import view.VistaConsola;

public class Controller {

		private VistaConsola vista;
	
		
	public Controller() {
		vista = new VistaConsola();
	}
	    public void run() {
	        Facade fachada = new Facade();
	        String resultado = fachada.realizarCompras();
	        System.out.println("Resultado de la compra:");
	        System.out.println(resultado);
	    }
	
}
	
