package model;

import view.VistaConsola;

public class ProcesadorElectronico extends ProcesadorPedidos {
    public ProcesadorElectronico(VistaConsola vista) {
        super(vista);
    }

    @Override
    protected void validarStock() {
        vista.mostrarinfo("[Electrónico] Verificando stock en almacén digital");
    }

    @Override
    protected void calcularTotal() {
        vista.mostrarinfo("[Electrónico] Calculando total con IVA incluido");
    }
}