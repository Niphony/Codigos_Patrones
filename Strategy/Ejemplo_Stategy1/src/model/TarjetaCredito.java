package model;

public class TarjetaCredito implements MetodoPago {
    @Override
    public String pagar(double monto) {
        return "Pago de $" + monto + " con Tarjeta de Crédito";
    }
}
