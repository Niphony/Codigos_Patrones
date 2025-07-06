package controller;


import model.Menu;
import model.componentes.MenuComponent;
import model.hoja.MenuItem;
import view.VistaConsola;


public class Main {
    public static void main(String[] args) {
        // Crear menú principal y submenús
        MenuComponent desayuno = new Menu("Menú Desayuno");
        MenuComponent almuerzo = new Menu("Menú Almuerzo");

        desayuno.add(new MenuItem("Huevos"));
        desayuno.add(new MenuItem("Café"));

        almuerzo.add(new MenuItem("Arroz con pollo"));
        almuerzo.add(new MenuItem("Sopa de verduras"));

        MenuComponent menuPrincipal = new Menu("-- Menú Principal --");
        menuPrincipal.add(desayuno);
        menuPrincipal.add(almuerzo);

        // MVC
        VistaConsola vista = new VistaConsola();
        Controller controlador = new Controller(menuPrincipal, vista);

        controlador.mostrarMenu();
    }
}
