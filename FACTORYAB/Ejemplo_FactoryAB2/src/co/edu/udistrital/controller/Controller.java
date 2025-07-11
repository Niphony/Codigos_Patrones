package co.edu.udistrital.controller;

import co.edu.udistrital.model.fabricaabstracta.Ryzen;
import co.edu.udistrital.model.fabricaabstracta.RyzenFactory;
import co.edu.udistrital.model.fabricaconcreta.r3Factory;
import co.edu.udistrital.model.fabricaconcreta.r7Factory;
import co.edu.udistrital.model.fabricaconcreta.r9Factory;
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
                   RyzenFactory objetoR3 = new r3Factory();
                   Ryzen procesador1 = objetoR3.CrearProcesador();
                   vista.mostrarInfo(procesador1.procesador()); 
                   break;
                case 2:
                RyzenFactory objetoR7 = new r7Factory();
                Ryzen procesador2 = objetoR7.CrearProcesador();
                vista.mostrarInfo(procesador2.procesador());
                break;
                case 3:
                RyzenFactory objetoR9 = new r9Factory();
                Ryzen procesador3 = objetoR9.CrearProcesador();
                vista.mostrarInfo(procesador3.procesador());
                break;
                case 4:
                	vista.mostrarInfo("Cerrando programa");
                    System.exit(0);
                    break;
                 default :
                	 vista.mostrarInfo("...Opcion invalida...");
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

