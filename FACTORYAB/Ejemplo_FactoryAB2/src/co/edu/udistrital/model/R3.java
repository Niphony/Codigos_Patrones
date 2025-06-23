package co.edu.udistrital.model;

import co.edu.udistrital.model.fabricaabstracta.Ryzen;

public class R3 implements Ryzen {
	
	@Override
    public String procesador(){
        return "Procesador de entrada de AMD, ideal para tareas básicas como navegación web, ofimática y multimedia ligera.";
    }


}
