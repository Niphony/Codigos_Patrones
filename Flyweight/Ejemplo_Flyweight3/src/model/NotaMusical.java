package model;

public class NotaMusical {
    private String nombre;

    public NotaMusical(String nombre) {
        this.nombre = nombre;
    }

    public String tocar() {
        return "Tocando nota: " + nombre;
    }
}