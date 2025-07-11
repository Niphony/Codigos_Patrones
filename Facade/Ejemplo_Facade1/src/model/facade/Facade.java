package model.facade;


import model.Comprador;
import model.modulos.Celular;
import model.modulos.Pc;


public class Facade {
	
		private Celular celular;
	    private Pc pc;

	    public Facade() {
	        celular = new Celular();
	        pc = new Pc();
	    }

	    public String realizarCompras() {
	        StringBuilder sb = new StringBuilder();
	        sb.append(celular.comprar()).append("\n");
	        sb.append(pc.compra2());
	        return sb.toString();
	    }
}
