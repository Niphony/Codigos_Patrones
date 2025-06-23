package view;

import java.util.Scanner;

public class VistaConsola {

    public Scanner sc;

    public VistaConsola() {
        sc = new Scanner(System.in); 
    }

    public void mostrarInfo(String mensaje){
        System.out.println(mensaje);
    }

    public String leerEntrada() {
        return sc.nextLine();
    }


}
