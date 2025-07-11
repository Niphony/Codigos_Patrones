package model.estados;

import model.EstadoLampara;
import view.VistaConsola;

public class EstadoEncendido implements EstadoLampara {
    private VistaConsola vista;
    
    public EstadoEncendido(VistaConsola vista) {
        this.vista = vista;
    }
    
    @Override
    public void encender() {
        vista.mostrarinfo("¡Ya está encendida!");
    }
    
    @Override
    public void apagar() {
        vista.mostrarinfo("Apagando la lámpara... 💡");
    }
}