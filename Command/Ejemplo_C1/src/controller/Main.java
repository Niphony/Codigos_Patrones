package controller;

import model.EncenderConsola;
import model.Luz;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Luz luz = new Luz();
        
   
        controller.configurarComando(new EncenderConsola(luz));
        controller.ejecutarComando(); 
    }
}