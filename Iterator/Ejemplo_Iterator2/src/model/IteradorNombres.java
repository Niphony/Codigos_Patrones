package model;

public class IteradorNombres implements MiIterador<String> {
    private int indice = 0;

    @Override
    public boolean tieneSiguiente() {
        return indice < nombres.length;
    }

    @Override
    public String siguiente() {
        return nombres[indice++];
    }
}
