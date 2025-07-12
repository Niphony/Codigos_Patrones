package view;

import java.util.Scanner;

public class VistaConsola {
    private Scanner sc;

    public VistaConsola() {
        sc = new Scanner(System.in);
    }

    public void mostrarinfo(String mensaje) {
        System.out.println(mensaje);
    }

    public String leerOpcionReporte() {
        System.out.print("¿Generar reporte en PDF (S/N)? ");
        return sc.nextLine();
    }
}
