package co.edu.udistrital.model.interfaz.concretoCreador;

import co.edu.udistrital.model.Automovil;
import co.edu.udistrital.model.Moto;
import co.edu.udistrital.model.interfaz.Transporte;

public class Fabrica {
	
	public static Transporte construir(String tipo) {
	    if (tipo == null) return null;

	    switch (tipo.toLowerCase()) {
	        case "moto":
	            return new Moto();
	        case "carro":
	        case "automovil":
	            return new Automovil();
	        default:
	            System.out.println("No se encuentra dicho vehiculo");
	            return null;
	    }
	}


}

