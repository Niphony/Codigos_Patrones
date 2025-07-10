package controller;

import model.Servicio_proxy_cache;
import model.proxy.Interfaceproxy;
import view.VistaConsola;

public class Controller {
	
	private VistaConsola vista;
	private Interfaceproxy proxy;

	
	    public Controller(Interfaceproxy proxy) {
	        vista = new VistaConsola();
	        this.proxy = proxy;
	    }

	    public void run(int a, int b) {
	        try {
	            int resultado = proxy.num(a, b);
	            vista.mostrarinfo("✅ Resultado: " + resultado);
	        } catch (SecurityException e) {
	            vista.mostrarinfo("❌ Error: Acceso denegado");
	        }
	    }

}
