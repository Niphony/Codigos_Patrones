package controller;

import model.Usuario;
import view.VistaConsola;

public class Controller {

    private VistaConsola vista;

    public Controller(){
        vista = new VistaConsola();
    }

    public void run(){
        Usuario usuario = new Usuario();
        vista.mostrarInformacion("Bienvenido al sistema de gestión de usuarios.");
        usuario.setNombre(vista.leerDatoString("Ingrese su nombre: "));
        usuario.setApellido(vista.leerDatoString("Ingrese su apellido: "));
        usuario.setEdad(vista.leerDatoEntero("Ingrese su edad: "));
        vista.mostrarInformacion("Usuario creado con éxito y copiado");
    
        Usuario usuario2 = usuario.clone();
        usuario2.setNombre("Juan");
        usuario2.setApellido("Pérez");
        usuario2.setEdad(30);
        vista.mostrarInformacion("Usuario clonado y modificado:");
        vista.mostrarInformacion("Nombre: " +usuario2.getNombre() 
                + "\nApellido: " + usuario2.getApellido() 
                + "\nEdad: " + usuario2.getEdad());

    }
    
}
