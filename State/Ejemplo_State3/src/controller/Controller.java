package controller;

import model.Lampara;
import view.VistaConsola;

public class Controller {
	
	
	public void run() {
		  VistaConsola vista = new VistaConsola();
	        Lampara lampara = new Lampara(vista);
	        
	        lampara.encender(); 
	        lampara.apagar();   
	        lampara.apagar();   
	    }
	
	}

