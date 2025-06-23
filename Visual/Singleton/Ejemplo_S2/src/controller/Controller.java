package controller;

import model.MaderaSing;
import view.VistaConsola;

public class Controller {

    private VistaConsola vistaConsola;
    MaderaSing maderasing = MaderaSing.getInstance();

    public Controller() {
        vistaConsola = new VistaConsola();
    }


    public void run(){

  switch (vistaConsola.leerTexto("Ingrese una opción de madera: ")) {
            case "1" -> {
                vistaConsola.mostrarInformacion("Opción 1 seleccionada");
                maderasing.agmaderas(" Madera de pino");
                vistaConsola.mostrarInformacion("Madera añadida:" + maderasing.getListamaderas());
            }
            case "2" -> {
                vistaConsola.mostrarInformacion("Opción 2 seleccionada");
                maderasing.agmaderas(" Madera de roble");
                vistaConsola.mostrarInformacion("Madera añadida:" + maderasing.getListamaderas());
            }
            case "3" -> {
                vistaConsola.mostrarInformacion("Opción 3 seleccionada");
                maderasing.agmaderas(" MDF");
                vistaConsola.mostrarInformacion("Madera añadida:" + maderasing.getListamaderas());
            }
            default -> vistaConsola.mostrarInformacion("Opción no válida");
        }
        
    }

}
