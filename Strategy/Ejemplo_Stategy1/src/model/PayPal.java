package model;

public class PayPal implements MetodoPago {
    @Override
    public String pagar(double monto) {
        return "Pago de $" + monto + " con PayPal";
    }
}