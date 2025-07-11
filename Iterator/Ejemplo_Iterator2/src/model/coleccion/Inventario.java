package model.coleccion;

import java.util.Iterator;
import java.util.List;

import model.Comida;
import model.MiIterador;

public class Inventario {
    private String[] productos = {"Laptop", "Teléfono", "Tablet"};

    public MiIterador<String> crearIterador() {
        return new IteradorProductos(productos);
    }
}