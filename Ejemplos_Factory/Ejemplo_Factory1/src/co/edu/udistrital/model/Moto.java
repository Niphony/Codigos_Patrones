package co.edu.udistrital.model;

import co.edu.udistrital.model.interfaz.Transporte;

public class Moto implements Transporte {


	public void arrancar() {
		System.out.println("Estoy arrancando la moto...");
		
	}
	
	public void detener() {
		System.out.println("Estoy deteniendo la moto...");
		
	}

	public String tipo() {
		return "Moto";
	}

}
