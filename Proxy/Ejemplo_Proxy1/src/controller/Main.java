package controller;

import model.Servicio_proxy;

public class Main {
	 public static void main(String[] args) {
		 Servicio_proxy proxy = new Servicio_proxy();
		    proxy.setAccesoPermitido(true); 
		    
		    Controller control = new Controller(proxy);
		    control.run(5, 10); 
	 }
}
