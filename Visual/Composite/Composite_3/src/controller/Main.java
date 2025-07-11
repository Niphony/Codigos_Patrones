package controller;

import view.VistaConsola;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new VistaConsola());
        controller.run();
    }

}
