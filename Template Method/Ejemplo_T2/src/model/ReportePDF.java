package model;

import view.VistaConsola;

public class ReportePDF extends GeneradorReportes {
    public ReportePDF(VistaConsola vista) {
        super(vista);
    }

    @Override
    protected void obtenerDatos() {
        vista.mostrarinfo("Extrayendo datos para PDF...");
    }

    @Override
    protected void formatearReporte() {
        vista.mostrarinfo("Aplicando diseño específico para PDF");
    }
}