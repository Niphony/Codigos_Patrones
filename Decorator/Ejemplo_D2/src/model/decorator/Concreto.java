package model.decorator;

import model.Acciones;

public class Concreto extends abstraccion {

	public Concreto(Acciones accion) {
		super(accion);
		
	}

	@Override
	public String Sumar(int a, int b) {
		return accion.Sumar(50, 40)+ " y has aprendido algo de español.";
	}

}
