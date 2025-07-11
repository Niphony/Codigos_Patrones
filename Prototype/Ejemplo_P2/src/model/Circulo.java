package model;

public class Circulo extends Figura {

    public int radio;

    public Circulo(int x, int y, int radio) {
        super(x, y);
        this.radio = radio;
    }

    public Circulo(Circulo original) {
        super(original.getX(), original.getY());
        this.radio = original.getRadio();
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", radio=" + radio +
                '}';
    }

       @Override
    public Figura clonar() {
        return new Circulo(this);
    }

}

