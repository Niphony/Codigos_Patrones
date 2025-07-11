package co.edu.udistrital.controller;

import co.edu.udistrital.model.fabricaabstracta.Figura;
import co.edu.udistrital.model.fabricaabstracta.FiguraFactory;
import co.edu.udistrital.model.fabricaconcreta.CirculoFactory;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	
	public VistaConsola vista;
	
	public Controller() {
		vista = new VistaConsola();
	}

	
	public void run () {
		
		FiguraFactory factory = new CirculoFactory();
		Figura Circulo = factory.Crearcirculo();
		
		Double diametro = vista.leerdatoDouble("Ingrese diametro del circulo");
		double radio = Circulo.Calcular(diametro);
		
		vista.mostrarinfo("El radio del circulo es: " +radio);
		
		
		
	}


  

    }

