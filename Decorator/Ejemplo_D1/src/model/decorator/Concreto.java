package model.decorator;

import model.Acciones;

public class Concreto extends abstraccion {

	public Concreto(Acciones accion) {
		super(accion);
		
	}

	@Override
	public String Saltar() {
		return accion.Saltar()+ " y ha corrido.";
	}

}
