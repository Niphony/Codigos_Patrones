package controller;


import model.facade.FachadaAuto;

public class Controller {
    public void ejecutar() {
        FachadaAuto auto = new FachadaAuto();
        String resultado = auto.iniciarViaje();
        System.out.println("---- Iniciando viaje ----");
        System.out.println(resultado);
    }
}