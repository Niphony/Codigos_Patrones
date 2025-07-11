package model.facade;

import model.modulos.Paredes;
import model.modulos.Puertas;
import model.modulos.Ventanas;

public class FachadaCasa {
    private Puertas pur;
    private Ventanas vent;
    private Paredes par;

    public FachadaCasa() {
        pur = new Puertas();
        vent = new Ventanas();
        par = new Paredes();
    }

    public String vercasa() {
        StringBuilder sb = new StringBuilder();
        sb.append(par.par()).append("\n");
        sb.append(pur.pur()).append("\n");
        sb.append(vent.vent()).append("\n");
        return sb.toString();
    }
}
