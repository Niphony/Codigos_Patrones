package model;

import model.proxy.Interfaceproxy;

public class Servicio_real implements Interfaceproxy{

	@Override
	public int operacion(int a, int b) {
		return a + b;
	}
	

}
