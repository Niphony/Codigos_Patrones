package controller;

import model.proxy.Interfaceproxy;
import view.VistaConsola;
import model.Servicio_proxy_logger;

public class Controller {
    private Interfaceproxy proxy;
    private VistaConsola vista;

    public Controller() {
        proxy = new Servicio_proxy_logger(); // ← Usamos el proxy con logging
        this.vista = vista;
    }

    public int ejecutarOperacion(int a, int b) {
        return proxy.dat(a, b);
              
    }
}
