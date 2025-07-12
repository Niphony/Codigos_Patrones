package model;

import model.interfaz.ComandoMultimedia;


public class ComandoPlay implements ComandoMultimedia {
    private Reproductor reproductor;
    
    public ComandoPlay(Reproductor reproductor) {
        this.reproductor = reproductor;
    }
    
    @Override
    public void ejecutar() {
        reproductor.play();
    }
}