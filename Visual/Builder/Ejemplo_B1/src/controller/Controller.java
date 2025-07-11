package controller;

import model.Director;
import model.PagoBuilder;
import model.Pagos;
import view.VistaConsola;

public class Controller {

    private final VistaConsola vista;

    public Controller() {
        vista = new VistaConsola();
    }

    public void run(){
        vista.mostrarInformacion("¿Desea ingresar los datos manualmente o usar un pago predefinido (Datos precargados del sistema)?");
        String opcion = vista.leerTexto("Escriba 'manual' o 'predefinido': ");

        if (opcion.equalsIgnoreCase("predefinido")) {
            Director director = new Director();
            Pagos pago = director.construirPagoBogota();
            vista.mostrarInformacion("Se ha generado un pago predefinido para Bogotá.");
            mostrarPago(pago);
            Pagos pagoMedellin = director.construirPagoMedellin();
            vista.mostrarInformacion("\nSe ha generado un pago predefinido para Medellín");
            mostrarPago(pagoMedellin);

               
        } else {
            vista.mostrarInformacion("Ingrese los datos personales para hacer efectivo el pago:");
            String nombre = vista.leerTexto("Nombre: ");
            String apellido = vista.leerTexto("Apellido: ");
            String email = vista.leerTexto("Email: ");
            String telefono = vista.leerTexto("Telefono: ");
            String ciudad = vista.leerTexto("Ciudad: ");

            PagoBuilder pagoBuilder = new PagoBuilder()
                    .nombre(nombre)
                    .apellido(apellido)
                    .email(email)
                    .telefono(telefono)
                    .ciudad(ciudad);

            Pagos pago = pagoBuilder.build();
            vista.mostrarInformacion("Pago confirmado exitosamente.");
            mostrarPago(pago);
        }
    }

    public void mostrarPago(Pagos pago) {
        vista.mostrarInformacion("Detalles de los datos para el pago:");
        vista.mostrarInformacion("Nombre: " + pago.getNombre());
        vista.mostrarInformacion("Apellido: " + pago.getApellido());
        vista.mostrarInformacion("Email: " + pago.getEmail());
        vista.mostrarInformacion("Telefono: " + pago.getTelefono());
        vista.mostrarInformacion("Ciudad: " + pago.getCiudad());
    }
}
