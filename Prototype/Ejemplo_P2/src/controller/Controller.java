package controller;

import model.Circulo;
import view.VistaConsola;

public class Controller {

    private VistaConsola vista;


    public Controller(){
        vista = new VistaConsola();
    }

    public void run(){
        Circulo c1 = new Circulo( 10,  20,  15);
        vista.mostrarInformacion("Creando un círculo:");
        vista.mostrarInformacion(c1.toString());


        Circulo c2 = (Circulo) c1.clonar();
        c2.setRadio( 10);
        c2.setX( 30);
        c2.setY( 40);
        vista.mostrarInformacion("Clonando el círculo y cambiando atributos:");
        vista.mostrarInformacion(c2.toString());
    }

    }

