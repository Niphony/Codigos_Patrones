package model;

import model.proxy.Interfaceproxy;

public class Servicio_real implements Interfaceproxy {

	@Override
	public int dat(int a, int b) {
		return a + b;
		
	}
	
	
	

}
