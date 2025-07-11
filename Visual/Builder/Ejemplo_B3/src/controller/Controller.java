package controller;

import model.Gafas;
import model.GafasBuilder;
import view.VistaConsola;

public class Controller {

    private VistaConsola vista;

    public Controller(){
        vista = new VistaConsola();
    }

    public void run(){
        vista.mostrarInformacion("Bienvenido a su renovacion de gafas");
        String modelo = vista.leerTexto("Por favor, introduzca el modelo de sus gafas(por ejemplo: aviador, cuadradas, etc.): ");
        String color = vista.leerTexto("Por favor, introduzca el color de sus gafas: ");

        creargafas(modelo, color);
    }

    public void creargafas(String modelo, String color) {
        Gafas gafas = new GafasBuilder()
            .setModelo(modelo)
            .setColor(color)
            .build();

        vista.mostrarInformacion("Gafas de forma: " + gafas.getModelo() + " de color " + gafas.getColor());
    }

}
