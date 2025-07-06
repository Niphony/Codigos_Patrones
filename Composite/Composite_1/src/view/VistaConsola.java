package view;

import model.componentes.MenuComponent;

public class VistaConsola {
    public void displayMenu(MenuComponent menuComponent) {
        System.out.println("Mostrando menú:");
        menuComponent.print();
    }
}

