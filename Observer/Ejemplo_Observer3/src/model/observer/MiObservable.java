package model.observer;

public interface MiObservable {
    void registrarObserver(MiObserver o);
    void notificarObservers(String mensaje);
}