package model.hoja;

import model.Lapiz;

public class Bloc implements Lapiz {

    @Override
    public void escribir() {
        System.out.println("Escribiendo en el Bloc");
    }
    
    @Override
    public String toString() {
        return "Bloc";
    }



}
