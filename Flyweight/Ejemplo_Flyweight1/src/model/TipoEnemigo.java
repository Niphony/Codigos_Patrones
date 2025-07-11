package model;

public class TipoEnemigo {
    private String nombre;
    private String sprite;

    public TipoEnemigo(String nombre, String sprite) {
        this.nombre = nombre;
        this.sprite = sprite;
    }

    public String getInfo() {
        return nombre + " (Sprite: " + sprite + ")";
    }
}