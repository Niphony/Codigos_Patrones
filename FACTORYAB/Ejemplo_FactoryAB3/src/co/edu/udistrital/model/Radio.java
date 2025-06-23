package co.edu.udistrital.model;

import co.edu.udistrital.model.fabricaabstracta.Figura;

public class Radio implements Figura{

	@Override
	public double Calcular(double diametro) {
		return diametro / 2;
	}


}
	



