package controller;

import model.Juego;
import model.decorator.Concreto;
import model.Acciones;
import view.VistaConsola;

public class Controller {
	
	private VistaConsola vista;
	public Acciones ju;
	
	public Controller() {
		vista = new VistaConsola();
		this.ju = new Juego();
		this.ju = new Concreto(this.ju);
	}
	
	public void run() {
		vista.mostrarInformacion("Bienvendio a la base de juego");
		vista.mostrarInformacion("Tenemos la funcionalidad basica del personaje:" + ju.Saltar());
	}

}
