package controller;

import model.ProcesadorElectronico;
import model.ProcesadorPedidos;
import view.VistaConsola;

public class Controller {
 private VistaConsola vista;
 private ProcesadorPedidos procesador;

 public Controller() {
     vista = new VistaConsola();
     procesador = new ProcesadorElectronico(vista);
 }

 public void run() {
     procesador.procesar();
 }
}