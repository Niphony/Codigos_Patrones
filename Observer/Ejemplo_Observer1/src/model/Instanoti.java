package model;

import java.util.ArrayList;
import java.util.List;
import model.VistaNoti;
import model.observer.MiObservable;
import model.observer.MiObserver;

public class Instanoti implements MiObservable {
    private List<MiObserver> observers = new ArrayList<>();
    
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
    
    public void nuevaNotificacion(String texto) {
        notificarObservers(texto);
    }
}