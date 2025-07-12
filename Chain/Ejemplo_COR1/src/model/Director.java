package model;

import model.abstractos.Aprobador;
import view.VistaConsola;

public class Director extends Aprobador {
    public Director(VistaConsola vista) {
        super(vista);
    }

    @Override
    public void procesarCompra(double monto) {
        if (monto <= 20000) {
            vista.mostrarinfo("Compra de $" + monto + " aprobada por Director");
        } else if (siguiente != null) {
            siguiente.procesarCompra(monto);
        }
    }
}