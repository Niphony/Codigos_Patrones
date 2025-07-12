package controller;

import model.ComandoCopiar;
import model.Editor;
import view.VistaConsola;

public class Main {
    public static void main(String[] args) {
        VistaConsola vista = new VistaConsola();
        Editor editor = new Editor();
        Controller controller = new Controller();
     
        controller.setComando(new ComandoCopiar(editor));
 
        vista.mostrarinfo("Presione 1 para copiar texto");
        String input = vista.leerTexto("Opción: ");
        
        if(input.equals("1")) {
            controller.ejecutarAccion(); 
        } else {
            vista.mostrarinfo("Comando no reconocido");
        }
    }
}