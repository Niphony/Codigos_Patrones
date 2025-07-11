package model;

public class Bala {

    private TipoArmas tipo;

    public Bala(TipoArmas tipo) {

        this.tipo = tipo;
    }

    public String dibujar() {
        return tipo.getInfo();
    }
}