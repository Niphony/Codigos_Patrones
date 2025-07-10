package model;

import view.VistaConsola;

public class Control implements VerControl {
    private Verificador proveedor; 
    private VistaConsola vista; 

    public Control(Verificador proveedor, VistaConsola vista) {
        this.proveedor = proveedor;
        this.vista = vista;
    }

    @Override
    public void autenticarUsuario() {
        String usuario = vista.leerTexto("Usuario: ");
        String contraseña = vista.leerTexto("Contraseña: ");

        if (proveedor.validar(usuario, contraseña)) {
            vista.mostrarInformacion("¡Autenticación exitosa!");
        } else {
            vista.mostrarInformacion("Error: Usuario o contraseña incorrectos. \nDatos requeridos:\nadmin\n123");
        }
    }
}