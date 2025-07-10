package model.decorator;

import model.Acciones;

public abstract class abstraccion implements Acciones {
	protected Acciones accion;
	
	public abstraccion(Acciones accion) {
		this.accion= accion;
	}
	

}
