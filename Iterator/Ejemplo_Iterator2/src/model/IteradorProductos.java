package model;

import java.util.List;

public class IteradorProductos implements MiIterador<String> {
    private String[] productos;
    private int posicion = 0;

    public IteradorProductos(String[] productos) {
        this.productos = productos;
    }

    @Override
    public boolean tieneSiguiente() {
        return posicion < productos.length;
    }

    @Override
    public String siguiente() {
        return productos[posicion++];
    }
}