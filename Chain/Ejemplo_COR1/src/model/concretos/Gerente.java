package model.concretos;

import model.abstractos.Aprobador;
import view.VistaConsola;

public class Gerente extends Aprobador {
    public Gerente(VistaConsola vista) {
        super(vista);
    }

    @Override
    public void procesarCompra(double monto) {
        if (monto <= 5000) {
            vista.mostrarinfo("Compra de $" + monto + " aprobada por Gerente");
        } else if (siguiente != null) {
            siguiente.procesarCompra(monto);
        }
    }
}
