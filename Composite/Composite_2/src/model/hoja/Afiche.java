package model.hoja;

import model.Lapiz;

public class Afiche implements Lapiz  {

    @Override
    public void escribir() {
        System.out.println("Escribiendo en el Afiche");
    }
    
    @Override
    public String toString() {
        return "Afiche";
    }
    
}
