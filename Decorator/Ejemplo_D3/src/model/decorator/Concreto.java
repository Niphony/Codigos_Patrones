package model.decorator;

import model.Acciones;

public class Concreto extends abstraccion {

	public Concreto(Acciones accion) {
		super(accion);
		
	}

	@Override
	public String Comprar() {
		return accion.Comprar()+ " y has vendido un armario.";
	}

}
