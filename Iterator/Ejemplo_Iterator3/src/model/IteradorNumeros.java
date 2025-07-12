package model;

public class IteradorNumeros implements MiIterador<Integer> {
    private int[] numeros;
    private int posicion = 0;

    public IteradorNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    @Override
    public boolean tieneSiguiente() {
        return posicion < numeros.length;
    }

    @Override
    public Integer siguiente() {
        return numeros[posicion++];
    }
}