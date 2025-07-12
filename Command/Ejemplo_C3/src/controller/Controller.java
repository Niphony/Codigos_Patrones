package controller;

import model.interfaz.ComandoMultimedia;

public class Controller {
    private ComandoMultimedia comando;
    
    public void setComando(ComandoMultimedia comando) {
        this.comando = comando;
    }
    
    public void controlarReproduccion() {
        comando.ejecutar();
    }
}