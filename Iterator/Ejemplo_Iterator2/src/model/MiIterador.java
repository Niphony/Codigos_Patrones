package model;

public interface MiIterador<T> {
    boolean tieneSiguiente();
    T siguiente();
}