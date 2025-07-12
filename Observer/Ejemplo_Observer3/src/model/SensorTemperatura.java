package model;

import java.util.ArrayList;
import java.util.List;
import model.observer.MiObservable;
import model.observer.MiObserver;

public class SensorTemperatura implements MiObservable {
    private List<MiObserver> observers = new ArrayList<>();
    private double temperatura;
    
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
    
    public void setTemperatura(double temp) {
        this.temperatura = temp;
        notificarObservers("Temperatura actual: " + temp + "°C");
    }
}