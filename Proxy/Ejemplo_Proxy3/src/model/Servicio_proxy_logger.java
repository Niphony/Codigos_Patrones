package model;


	import java.time.LocalDateTime;
	import model.proxy.Interfaceproxy;

	public class Servicio_proxy_logger implements Interfaceproxy {
	    private Servicio_real servicioReal;

	    @Override
	    public int dat(int a, int b) {
	        System.out.println("📅 [" + LocalDateTime.now() + "] operación solicitada con a=" + a + ", b=" + b);

	        if (servicioReal == null) {
	            servicioReal = new Servicio_real();
	        }

	        return servicioReal.dat(a, b);
	    }
	}

