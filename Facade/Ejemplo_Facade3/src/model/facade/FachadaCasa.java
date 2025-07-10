package model.facade;

import model.modulos.Paredes;
import model.modulos.Puertas;
import model.modulos.Ventanas;

public class FachadaCasa {
    private Puertas motor;
    private Ventanas radio;
    private Paredes luces;

    public FachadaCasa() {
        motor = new Puertas();
        radio = new Ventanas();
        luces = new Paredes();
    }

    public String vercasa() {
        StringBuilder sb = new StringBuilder();
        sb.append(luces.par()).append("\n");
        sb.append(motor.pur()).append("\n");
        sb.append(radio.vent()).append("\n");
        return sb.toString();
    }
}
