package controller;

import model.Tienda;
import model.decorator.Concreto;
import model.Acciones;
import view.VistaConsola;

public class Controller {
	
	private VistaConsola vista;
	public Acciones ti;
	
	public Controller() {
		vista = new VistaConsola();
		this.ti = new Tienda();
		this.ti = new Concreto(this.ti);
	}
	
	public void run() {
		vista.mostrarInformacion("Bienvendio a feria de muebles");
		vista.mostrarInformacion("Despues de terminada la feria:" + ti.Comprar());
	}

}
