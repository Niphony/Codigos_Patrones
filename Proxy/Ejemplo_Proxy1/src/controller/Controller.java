package controller;


import model.Servicio_proxy;
import model.proxy.Interfaceproxy;
import view.VistaConsola;

public class Controller {
	
	private VistaConsola vista;
	private Interfaceproxy proxy;
	private Servicio_proxy proxy2;
	
	    public Controller(Interfaceproxy proxy) {
	        vista = new VistaConsola();
	        this.proxy = proxy;
	    }

	    public void run(int a, int b) {
	        try {
	            int resultado = proxy.operacion(a, b);
	            vista.mostrarinfo("✅ Resultado: " + resultado);
	        } catch (SecurityException e) {
	            vista.mostrarinfo("❌ Error: Acceso denegado");
	        }
	    }

	    public void sum(int a, int b) {
	        vista.mostrarinfo("--- Intento sin acceso ---");
	        run(a, b); // Bloqueado si no hay permisos

	        vista.mostrarinfo("--- Intento con acceso ---");
	        proxy2.setAccesoPermitido(true); // Habilitar acceso
	        run(a, b); // Permitido
	    }
	}
	
