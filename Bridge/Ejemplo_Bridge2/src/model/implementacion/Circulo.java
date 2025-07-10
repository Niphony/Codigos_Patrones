package model.implementacion;

import model.Color;
import model.Figura;

public class Circulo extends Figura {
	
    public Circulo(Color color) {
        super(color);
    }
    
    public String dibujar() {
        return "Dibujando un cuadrado de Color " +color.aplicarcolor();
    }



    
}
