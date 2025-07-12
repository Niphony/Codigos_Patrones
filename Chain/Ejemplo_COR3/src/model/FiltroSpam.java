package model;

import model.abstractos.Filtro;
import view.VistaConsola;

public class FiltroSpam extends Filtro {
    public FiltroSpam(VistaConsola vista) {
        super(vista);
    }

    @Override
    public void procesarMensaje(String msg, int severidad) {
        if (severidad <= 1) {
            vista.mostrarinfo("[SPAM] Mensaje bloqueado: " + msg);
        } else if (siguiente != null) {
            siguiente.procesarMensaje(msg, severidad);
        }
    }
}