package model;

import view.VistaConsola;

public abstract class GeneradorReportes {
    protected VistaConsola vista;

    public GeneradorReportes(VistaConsola vista) {
        this.vista = vista;
    }

    public final void generar() {
        obtenerDatos();
        formatearReporte();
        guardarReporte();
        vista.mostrarinfo("Reporte generado exitosamente");
    }

    protected abstract void obtenerDatos();
    protected abstract void formatearReporte();

    protected void guardarReporte() {
        vista.mostrarinfo("Guardando en formato estándar...");
    }
}