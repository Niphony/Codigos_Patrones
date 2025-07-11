package model;

public abstract class Figura {
    protected Color color;
    public Figura(Color color) {
        this.color = color;
    }
    public abstract String dibujar();
}
