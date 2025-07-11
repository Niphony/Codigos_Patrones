package co.edu.udistrital.view;

import java.util.Scanner;

public class VistaConsola {

    public Scanner sc;

    public VistaConsola() {
        sc = new Scanner(System.in); 
    }

    public void mostrarInfo(String mensaje){
        System.out.println(mensaje);
    }

    public int leerDatoEnt(String mensaje){
        int dato = 0;
        System.out.println(mensaje);
        dato = sc.nextInt();
        return dato;
    }



}
