package controller;

import model.Idiomas;
import view.VistaConsola;

public class Controller {
	
	private VistaConsola vista;
	private Idiomas idiom;
	private byte option;
	
	
	public Controller() {
		this.vista = new VistaConsola();
	}
	
	public void run() {
		String idiomap = "Español";
		String idiomas = "Ingles";
		
		idiom = new Idiomas(idiomap, idiomas);
		
		vista.mostrarinfo("Los idiomas que has aprendido ahora son:");
		vista.mostrarinfo(idiomap);
		vista.mostrarinfo(idiomas);
		
		do {
			option = Byte.parseByte(vista.leerTexto("\n Bienvenido a la academia de idiomas: \n 1. Cambiar idioma principal actual"
					+ " \n 2. Cambiar idioma Secundario \n 3. Ver idiomas que has aprendido\n"));
			
			
		switch(option) {
		 case 1-> {
			 idiom.clone();
			 idiomap = vista.leerTexto("Que idioma principal deseas manejar: ");
			 idiom.setIdiomap(idiomap);
             break;
         }
         case 2-> {
        	 idiom.clone();
        	 idiomas = vista.leerTexto("Que idioma secundario deseas manejar: ");
            idiom.setIdiomas(idiomas);
             break;
         }
         case 3-> {
        	 vista.mostrarinfo("Los idiomas que manejas ahora son:\nPrincipal: " +idiomap+ "\nSecundario: " +idiomas );
             break;
         }
         case 4-> {
             break;
         }
         default -> throw new AssertionError();
		}
 } while(option!=4);
 System.exit(0);
		}
	}


