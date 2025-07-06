package controller;

import model.Forma;
import model.compuestos.DibujoComplejo;
import model.hoja.Circulo;
import model.hoja.Cuadrado;
import view.VistaConsola;

public class Controller {

    private VistaConsola vista; 
    

    public Controller(){
        vista = new VistaConsola();
    }

    public void run(){
         Forma circle = new Circulo();
        Forma square = new Cuadrado();

       
        DibujoComplejo dibujo1 = new DibujoComplejo();
        dibujo1.agregar(circle);
        dibujo1.agregar(square);

        
        DibujoComplejo dibujo2 = new DibujoComplejo();
        dibujo2.agregar(new Circulo());
        dibujo2.agregar(dibujo1);

        vista.mostrarinfo("Dibujando dibujo compuesto:");
        dibujo2.dibujar();
    }


}
