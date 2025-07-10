package controller;

import model.Mem;
import model.VerControl;
import model.Control;
import model.Verificador;
import view.VistaConsola;

public class Main {
	    public static void main(String[] args) {
	        VistaConsola vista = new VistaConsola();
	        
	
	        Verificador proveedor = new Mem(); 
	      

	        VerControl controlador = new Control(proveedor, vista);
	        controlador.autenticarUsuario();
	    }
	}


