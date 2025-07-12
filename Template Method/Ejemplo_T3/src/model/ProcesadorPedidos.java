package model;

import view.VistaConsola;

public abstract class ProcesadorPedidos {
    protected VistaConsola vista;

    public ProcesadorPedidos(VistaConsola vista) {
        this.vista = vista;
    }


    public final void procesar() {
        validarStock();
        calcularTotal();
        confirmarPago();
        enviarPedido();
    }

    protected abstract void validarStock();
    protected abstract void calcularTotal();

    protected void confirmarPago() {
        vista.mostrarinfo("Pago confirmado");
    }

    protected void enviarPedido() {
        vista.mostrarinfo("Pedido enviado al cliente");
    }
}