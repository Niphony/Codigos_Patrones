package view;

import java.util.Scanner;

public class VistaConsola {

    private Scanner sc;

    public VistaConsola(){
        sc = new Scanner(System.in);
    }

    public void mostrarmensaje(String mensaje){
        System.out.println(mensaje);
    }
    

}
