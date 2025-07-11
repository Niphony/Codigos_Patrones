package model.facade;

import model.modulos.Luces;
import model.modulos.Motor;
import model.modulos.Radio;

public class FachadaAuto {
    private Motor motor;
    private Radio radio;
    private Luces luces;

    public FachadaAuto() {
        motor = new Motor();
        radio = new Radio();
        luces = new Luces();
    }

    public String iniciarViaje() {
        StringBuilder sb = new StringBuilder();
        sb.append(motor.activar()).append("\n");
        sb.append(radio.encender()).append("\n");
        sb.append(luces.prender()).append("\n");
        return sb.toString();
    }
}
