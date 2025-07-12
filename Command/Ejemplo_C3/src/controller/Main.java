package controller;

import model.ComandoPlay;
import model.Reproductor;
import view.VistaConsola;

public class Main {
    public static void main(String[] args) {
        VistaConsola vista = new VistaConsola();
        Reproductor reproductor = new Reproductor();
        Controller controller = new Controller();
        
       
        controller.setComando(new ComandoPlay(reproductor));
        
        vista.mostrarinfo("Reproductor Multimedia");
        vista.mostrarinfo("1. Play");
        String opcion = vista.leerTexto("Seleccione: ");
        
        if(opcion.equals("1")) {
            controller.controlarReproduccion(); 
        }
    }
}