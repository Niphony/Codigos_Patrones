package co.edu.udistrital.view;

import java.util.Scanner;

public class VistaConsola {
	private Scanner sc = new Scanner(System.in);
	
	public void mostrarinfo(String mensaje) {
		System.out.println(mensaje);
		
	}
	
	
	public double leerdatoDouble(String mensaje) {
		System.out.println(mensaje);	
		return sc.nextDouble();
	}

 
    }
