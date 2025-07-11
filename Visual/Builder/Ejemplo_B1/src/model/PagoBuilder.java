package model;

public class PagoBuilder {

    private final Pagos pago;

    public PagoBuilder(){
        pago = new Pagos();
    }

    // Este constructor crea un objeto de la clase Pagos, que es el que se va a construir con el builder.

    // Los siguientes métodos son los que permiten construir el objeto Pagos, cada uno de ellos recibe un atributo de la clase Pagos y lo asigna al objeto pago.

    public PagoBuilder nombre(String nombre) {
        this.pago.setNombre(nombre);
        return this;

    }

    public PagoBuilder apellido(String apellido) {
        this.pago.setApellido(apellido);
        return this;
    }

    public PagoBuilder email(String email) {
        this.pago.setEmail(email);
        return this;
    }

    public PagoBuilder telefono(String telefono) {
        this.pago.setTelefono(telefono);
        return this;
    }

    public PagoBuilder ciudad(String ciudad) {
        this.pago.setCiudad(ciudad);
        return this;
    }


    public Pagos build() {
        return this.pago;
    }

}
