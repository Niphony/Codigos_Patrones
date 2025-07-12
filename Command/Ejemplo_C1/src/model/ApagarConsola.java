package model;

import model.interfaz.Comando;

public class ApagarConsola implements Comando {
    private Luz luz;
    
    public ApagarConsola(Luz luz) {
        this.luz = luz;
    }
    
    @Override
    public void ejecutar() {
        luz.apagar();
    }
}