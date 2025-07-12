package model;

import model.abstractos.Soporte;
import view.VistaConsola;

public class SoporteNivel1 extends Soporte {
    public SoporteNivel1(VistaConsola vista) {
        super(vista);
    }

    @Override
    public void resolverProblema(String problema, int nivel) {
        if (nivel <= 1) {
            vista.mostrarinfo("[Nivel 1] Resuelto: " + problema);
        } else if (siguiente != null) {
            siguiente.resolverProblema(problema, nivel);
        }
    }
}
