package co.edu.udistrital.model;

import co.edu.udistrital.model.interfaz.Transporte;

public class Automovil implements Transporte {


	public void arrancar() {
		System.out.println("Estoy arrancando el carro...");
		
	}

	
	public void detener() {
		System.out.println("Estoy deteniendo el carro...");
		
	}

	
	public String tipo() {
		return "Automovil";
	}

}
