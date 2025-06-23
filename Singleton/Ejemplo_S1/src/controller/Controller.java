package controller;

import model.Producto;
import model.ProductoSing;
import view.VistaConsola;

public class Controller {

private VistaConsola vista;
ProductoSing gestosproductos = ProductoSing.getInstance();


    public Controller() {
        vista=new VistaConsola();
    }


    public void run(){


    System.out.println("------Bienvenido a la tienda de electronicos------");
    vista.mostrarInformacion("Por favor, revise que tipo de productos tenemos:");

    gestosproductos.agregarProducto(new Producto(1, "Computadora Gamer", 1500));
    gestosproductos.agregarProducto(new Producto(2, "TV 4K", 1800));
    gestosproductos.agregarProducto(new Producto(3, "Celular", 800));

    vista.mostrarInformacion("Lista de productos disponibles:");
    for (Producto producto : gestosproductos.getListaproductos()) {
        vista.mostrarInformacion("ID: " + producto.getId() + ", Nombre: " + producto.getNombre() + ", Precio: $" + producto.getPrecio());


    }
    }
}
