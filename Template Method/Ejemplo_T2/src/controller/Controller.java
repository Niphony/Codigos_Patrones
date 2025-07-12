package controller;

import model.ReportePDF;
import view.VistaConsola;

public class Controller {
    private VistaConsola vista;
    
    public Controller() {
        vista = new VistaConsola();
    }
    
    public void iniciarGeneracionReporte() {
        String opcion = vista.leerOpcionReporte();
        if (opcion.equalsIgnoreCase("S")) {
            ReportePDF reporte = new ReportePDF(vista);
            reporte.generar();
        } else {
            vista.mostrarinfo("Operación cancelada");
        }
    }
}