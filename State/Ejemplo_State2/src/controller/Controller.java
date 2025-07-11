package controller;

import model.Semaforo;
import view.VistaConsola;

public class Controller {
	
	
	public void run() {

		      VistaConsola vista = new VistaConsola();
		      Semaforo reproductor = new Semaforo(vista);

		      reproductor.verde();      
		      reproductor.amarillo(); 
		      reproductor.rojo(); 
		    }
	}

