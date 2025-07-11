package controller;

import model.Color;
import model.Figura;
import model.implementacion.Azul;
import model.implementacion.Circulo;
import view.VistaConsola;

public class Controller {
	
	private VistaConsola vista;
	public Circulo cir;
	
	
	
	public Controller() {
		vista = new VistaConsola();
		this.cir = new Circulo(new Azul());
	}
	
	
	public void run() {
		
		vista.mostrarInformacion(cir.dibujar());
		
		
	}
	

}
