package model.hoja;

import model.Forma;

public class Circulo implements Forma {

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo");
    }

    @Override
    public String toString() {
        return "Circulo";
    }

}
