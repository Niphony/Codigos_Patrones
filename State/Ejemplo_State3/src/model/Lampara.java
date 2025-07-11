package model;

import model.estados.EstadoApagado;
import view.VistaConsola;

public class Lampara {
    private EstadoLampara estado;
    
    public Lampara(VistaConsola vista) {
        this.estado = new EstadoApagado(vista); 
    }
    
    public void setEstado(EstadoLampara estado) {
        this.estado = estado;
    }
    
    public void encender() {
        estado.encender();
    }
    
    public void apagar() {
        estado.apagar();
    }
}