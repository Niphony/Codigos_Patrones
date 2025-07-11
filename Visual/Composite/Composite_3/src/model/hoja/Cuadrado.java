package model.hoja;

import model.Forma;

public class Cuadrado implements Forma {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado");
    }

    @Override
    public String toString() {
        return "Cuadrado";
    }

}
