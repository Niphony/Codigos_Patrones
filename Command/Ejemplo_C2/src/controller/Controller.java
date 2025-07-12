package controller;

import model.interfaz.ComandoEditor;


public class Controller {
    private ComandoEditor comando;
    
    public void setComando(ComandoEditor comando) {
        this.comando = comando;
    }
    
    public void ejecutarAccion() {
        comando.ejecutar();
    }
}