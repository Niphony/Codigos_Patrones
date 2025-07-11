package model.estados;

import model.EstadoLampara;
import view.VistaConsola;

public class EstadoApagado implements EstadoLampara {
    private VistaConsola vista;
    
    public EstadoApagado(VistaConsola vista) {
        this.vista = vista;
    }
    
    @Override
    public void encender() {
        vista.mostrarinfo("Encendiendo la lámpara... 🔥");
    }
    
    @Override
    public void apagar() {
        vista.mostrarinfo("¡Ya está apagada!");
    }
}