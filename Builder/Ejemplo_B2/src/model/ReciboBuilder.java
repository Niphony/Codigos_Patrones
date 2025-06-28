package model;

public class ReciboBuilder {

    private final Recibo recibo;

    public ReciboBuilder() {
        recibo = new Recibo();
    }

    public ReciboBuilder setTipo(String tipo) {
        this.recibo.setTipo(tipo);
        return this;
    }

    public ReciboBuilder setValor(double valor) {
        this.recibo.setValor(valor);
        return this;
    }

    public Recibo build() {
        return this.recibo;
    }

}
