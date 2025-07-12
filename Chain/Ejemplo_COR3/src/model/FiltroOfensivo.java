package model;

import model.abstractos.Filtro;
import view.VistaConsola;

public class FiltroOfensivo extends Filtro {
    public FiltroOfensivo(VistaConsola vista) {
        super(vista);
    }

    @Override
    public void procesarMensaje(String msg, int severidad) {
        if (severidad <= 3) {
            vista.mostrarinfo("[OFENSIVO] Mensaje moderado: " + msg);
        } else if (siguiente != null) {
            siguiente.procesarMensaje(msg, severidad);
        }
    }
}