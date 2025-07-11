package model.hoja;

import model.Lapiz;

public class Cuaderno implements Lapiz {

    @Override
    public void escribir() {
        System.out.println("Escribiendo en el Cuaderno");
    }
    
    @Override
    public String toString() {
        return "Cuaderno";
    }

}
