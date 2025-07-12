package controller;

import model.interfaz.Comando;
import view.VistaConsola;

public class Controller {
    private VistaConsola vista;
    private Comando comando;
    
    public void configurarComando(Comando comando) {
        this.comando = comando;
    }
    
    public void ejecutarComando() {
        comando.ejecutar();
    }
}