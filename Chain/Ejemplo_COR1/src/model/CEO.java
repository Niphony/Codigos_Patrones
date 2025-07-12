package model;

import model.abstractos.Aprobador;
import view.VistaConsola;

public class CEO extends Aprobador {
    public CEO(VistaConsola vista) {
        super(vista);
    }

    @Override
    public void procesarCompra(double monto) {
        vista.mostrarinfo("Compra de $" + monto + " requiere junta directiva");
    }
}