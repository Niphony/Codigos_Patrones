package controller;

import model.Calc;
import model.decorator.Concreto;
import model.Acciones;
import view.VistaConsola;

public class Controller {
	
	private VistaConsola vista;
	public Acciones ju;
	
	public Controller() {
		vista = new VistaConsola();
		this.ju = new Calc();
		this.ju = new Concreto(this.ju);
	}
	
	public void run() {
		vista.mostrarInformacion("Hoy en la escuela");
		vista.mostrarInformacion("Has aprendido a sumar " + ju.Sumar(0, 0));
	}

}
