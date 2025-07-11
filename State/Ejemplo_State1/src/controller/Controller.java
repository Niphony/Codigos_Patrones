package controller;

import model.Reproductor;
import view.VistaConsola;

public class Controller {
	
	
	public void run() {

		      VistaConsola vista = new VistaConsola();
		      Reproductor reproductor = new Reproductor(vista);

		      reproductor.reproducir();     
		      reproductor.detener();   
		      reproductor.pausar(); 
		    }
	}

