package controller;

import model.Servicio_proxy_cache;

public class Main {
	
		 public static void main(String[] args) {
			 Servicio_proxy_cache proxy = new Servicio_proxy_cache();  
			    Controller control = new Controller(proxy);
			    control.run(5, 30); 
		 }
	}


