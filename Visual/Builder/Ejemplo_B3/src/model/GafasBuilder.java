package model;

public class GafasBuilder {

    private Gafas gafas;

    public GafasBuilder() {
        gafas = new Gafas();
    }   

    public GafasBuilder setModelo(String modelo) {
        gafas.setModelo(modelo);
        return this;
    }

    public GafasBuilder setColor(String color) {
        gafas.setColor(color);
        return this;
    }

    public Gafas build() {
        return this.gafas;
    }

}
