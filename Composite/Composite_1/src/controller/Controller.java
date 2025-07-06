package controller;

import model.componentes.MenuComponent;
import view.VistaConsola;

public class Controller {
    private MenuComponent rootMenu;
    private VistaConsola vista;

    public Controller(MenuComponent rootMenu, VistaConsola vista) {
        this.rootMenu = rootMenu;
        this.vista = vista;
    }

    public void mostrarMenu() {
        vista.displayMenu(rootMenu);
    }
}
