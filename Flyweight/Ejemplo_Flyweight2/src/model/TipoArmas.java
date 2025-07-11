package model;

public class TipoArmas {
    private String nombre;
    private String sprite;

    public TipoArmas(String nombre, String sprite) {
        this.nombre = nombre;
        this.sprite = sprite;
    }

    public String getInfo() {
        return nombre + " (Carga total: " + sprite + ")";
    }
}