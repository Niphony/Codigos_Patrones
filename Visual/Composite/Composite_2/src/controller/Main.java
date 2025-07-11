package controller;

import view.VistaConsola;

public class Main {
    public static void main(String[] args) {
        VistaConsola vista = new VistaConsola();
        Controller control = new Controller(vista); 
        control.run();
    }

}
