package model;

import model.interfaz.Comando;

public class EncenderConsola implements Comando {
    private Luz luz;
    
    public EncenderConsola(Luz luz) {
        this.luz = luz;
    }
    
    @Override
    public void ejecutar() {
        luz.encender();
    }
}
