package view;

import java.util.Scanner;

public class VistaConsola {

    Scanner sc;

    public VistaConsola(){
        sc = new Scanner(System.in);
    }

    public void mostrarInformacion(String mensaje) {
		System.out.println(mensaje);
	}

	public String leerTexto(String mensaje) {
		String info;
		System.out.print(mensaje);
		info=sc.nextLine();
		return info;
	}

}
