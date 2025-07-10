package model.implementacion;

import model.Cortina;
import model.Casa;

public class Tomar extends Casa {
	
    public Tomar(Cortina color) {
        super(color);
    }
    
    public String mover() {
        return "En tu casa has movido " +color.cortina();
    }



    
}
