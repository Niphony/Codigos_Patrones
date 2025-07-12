package model;

import model.abstractos.Soporte;
import view.VistaConsola;

public class SoporteNivel2 extends Soporte {
    public SoporteNivel2(VistaConsola vista) {
        super(vista);
    }

    @Override
    public void resolverProblema(String problema, int nivel) {
        if (nivel <= 3) {
            vista.mostrarinfo("[Nivel 2] Escalando problema: " + problema);
        } else if (siguiente != null) {
            siguiente.resolverProblema(problema, nivel);
        }
    }
}