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

        Compuesta con = new Compuesta(); 
        System.out.println("Compuesta creada correctamente");
       
        Lapiz cua = new Cuaderno();
        Lapiz bloc = new Bloc();
        Lapiz afiche = new Afiche();

        
        con.agregar(cua);
        con.agregar(bloc);
        con.agregar(afiche);

        
        Compuesta superConjunto = new Compuesta();
        superConjunto.agregar(con);
        superConjunto.agregar(new Cuaderno());

        
        vista.mostrarmensaje("Iniciando escritura:");
        superConjunto.escribir();  
}



}
