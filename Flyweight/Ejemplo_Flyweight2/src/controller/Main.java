package controller;

import model.Bala;
import model.BalasFactory;
import model.TipoArmas;
import view.VistaConsola;

public class Main {
    public static void main(String[] args) {
        VistaConsola vista = new VistaConsola();

        TipoArmas uno = BalasFactory.getTipo("Mag", "50 balas");
        TipoArmas dos = BalasFactory.getTipo("AK-47", "250 balas");

        Bala e1 = new Bala(uno);
        Bala e2 = new Bala(dos);

        vista.mostrarinfo(e1.dibujar());
        vista.mostrarinfo(e2.dibujar());
    }
}