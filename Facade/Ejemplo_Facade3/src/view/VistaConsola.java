package view;

import java.util.Scanner;

public class VistaConsola {

		Scanner sc;
		
		public VistaConsola() {
			sc = new Scanner(System.in);
		}
	
		public void mostrarinfo(String mensaje) {
			System.out.println(mensaje);
		}
		
	
}
