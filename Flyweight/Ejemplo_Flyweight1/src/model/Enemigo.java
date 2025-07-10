package model;

public class Enemigo {
    private int x, y;
    private TipoEnemigo tipo;

    public Enemigo(int x, int y, TipoEnemigo tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public String dibujar() {
        return tipo.getInfo() + " en (" + x + ", " + y + ")";
    }
}