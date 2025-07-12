package model;

public class ListaNumeros {
    private int[] numeros = {10, 20, 30};

    public MiIterador<Integer> crearIterador() {
        return new IteradorNumeros(numeros);
    }
}