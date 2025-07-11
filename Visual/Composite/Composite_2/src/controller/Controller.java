package controller;

import model.Lapiz;
import model.componentes.Compuesta;
import model.hoja.Afiche;
import model.hoja.Bloc;
import model.hoja.Cuaderno;
import view.VistaConsola;

public class Controller {

private VistaConsola vista;

public Controller(VistaConsola vista){
    this.vista = vista;
}

public void run(){

        Compuesta compuesta = new Compuesta(); 
        System.out.println("Compuesta creada correctamente");
       
        Lapiz cua = new Cuaderno();
        Lapiz bloc = new Bloc();
        Lapiz afiche = new Afiche();

        
        Compuesta conjunto = new Compuesta();
        conjunto.agregar(cua);
        conjunto.agregar(bloc);
        conjunto.agregar(afiche);

        
        Compuesta superConjunto = new Compuesta();
        superConjunto.agregar(conjunto);
        superConjunto.agregar(new Cuaderno());

        
        vista.mostrarmensaje("Iniciando escritura:");
        superConjunto.escribir();  
}




}
