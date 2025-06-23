package co.edu.udistrital.model.fabricaconcreta;

import co.edu.udistrital.model.fabricaabstracta.Figura;
import co.edu.udistrital.model.fabricaabstracta.FiguraFactory;
import co.edu.udistrital.model.Radio;

public class CirculoFactory implements FiguraFactory {

	@Override
	public Figura Crearcirculo() {
		
		return new Radio();
	}

}
