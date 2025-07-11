package model;

import java.util.ArrayList;
import java.util.List;
import model.observer.MiObservable;
import model.observer.MiObserver;

public class Inventario implements MiObservable {
    private List<MiObserver> observers = new ArrayList<>();
    private int stock;
    
    @Override
    public void registrarObserver(MiObserver o) {
        observers.add(o);
    }
    
    @Override
    public void notificarObservers(String mensaje) {
        for (MiObserver o : observers) {
            o.actualizar(mensaje);
        }
    }
    
    public void actualizarStock(int nuevoStock) {
        this.stock = nuevoStock;
        notificarObservers("Stock actualizado: " + nuevoStock);
    }
}