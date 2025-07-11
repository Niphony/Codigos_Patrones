package model;

import java.util.ArrayList;
import java.util.List;

public class ProductoSing {
    private static ProductoSing instance;
    private List<Producto> listaproductos;

    private ProductoSing() {
        listaproductos = new ArrayList<>();
    }

    public static ProductoSing getInstance() {
        if (instance == null) {
            instance = new ProductoSing();
        }
        return instance;
    }


    public void agregarProducto(Producto producto) {
        listaproductos.add(producto);
    }

    public Producto[] getListaproductos() {
        Producto[] productosArray = new Producto[listaproductos.size()];
        return listaproductos.toArray(productosArray);
    }   




}
