package controller;


import model.facade.FachadaCasa;

public class Controller {
    public void ejecutar() {
        FachadaCasa casa = new FachadaCasa();
        String resultado = casa.vercasa();
        System.out.println("--Progreso de la construccion de la casa--");
        System.out.println(resultado);
    }
}