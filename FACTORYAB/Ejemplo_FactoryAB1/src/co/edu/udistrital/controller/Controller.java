package co.edu.udistrital.controller;

import co.edu.udistrital.model.fabricaabstracta.Intel;
import co.edu.udistrital.model.fabricaabstracta.IntelFactory;
import co.edu.udistrital.model.fabricaconcreta.i3Factory;
import co.edu.udistrital.model.fabricaconcreta.i5Factory;
import co.edu.udistrital.model.fabricaconcreta.i9Factory;
import co.edu.udistrital.view.VistaConsola;

public class Controller {

    public VistaConsola vista;

    public Controller(){
        vista = new VistaConsola();
    }


    public void run() {
    	int op = 0;
        do{
            op=menu();
            switch(op){
                case 1:
                   IntelFactory objetoI3;
                objetoI3 = new i3Factory();
                   Intel procesador1 = objetoI3.CrearProcesador();
                   vista.mostrarInfo(procesador1.procesador()); 
                   break;
                case 2:
                IntelFactory objetoI5 = new i5Factory();
                Intel procesador2 = objetoI5.CrearProcesador();
                vista.mostrarInfo(procesador2.procesador()); 
                break;
                case 3:
                IntelFactory objetoI9 = new i9Factory();
                Intel procesador3 = objetoI9.CrearProcesador();
                vista.mostrarInfo(procesador3.procesador()); 
                break;
                case 4:
                	vista.mostrarInfo("Cerrando Programa");
                    System.exit(0);
                    break;
                 default :
                	 vista.mostrarInfo(".....Opcion invalida....");
            }
            vista.mostrarInfo("");
        }while(op!=4);
    }
        
        public int menu(){
            String menu2 = 
                    """
                    MENU DE OPCIONES
                    1.   Que tipo de procesador es un i3. 
                    2.   Que tipo de procesador es un i5. 
                    3.   Que tipo de procesador es un i9. 
                    4.   Cerrar programa. 
                    
                    Seleccion opcion...""";
            return vista.leerDatoEnt(menu2);
        }
               


    }

