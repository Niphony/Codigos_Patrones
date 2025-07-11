package controller;

import model.Cortina;
import model.Casa;
import model.implementacion.Cosa;
import model.implementacion.Tomar;
import view.VistaConsola;

public class Controller {
	
	private VistaConsola vista;
	public Tomar cir;
	
	
	
	public Controller() {
		vista = new VistaConsola();
		this.cir = new Tomar(new Cosa());
	}
	
	
	public void run() {
		
		vista.mostrarInformacion(cir.mover());
		
		
	}
	

}
