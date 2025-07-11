package controller;

import view.VistaConsola;

public class Main {
    public static void main(String[] args) {
    	VistaConsola vista = new VistaConsola();
        Controller controller = new Controller();

        int resultado1 = controller.ejecutarOperacion(10, 5);
        vista.mostrarinfo("Resultado: " + resultado1);

        int resultado2 = controller.ejecutarOperacion(7, 3);
        vista.mostrarinfo("Resultado: " + resultado2);
        
    }
}


