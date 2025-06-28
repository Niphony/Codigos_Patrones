package model;

public class Director {

    public Pagos construirPagoBogota() {
        return new PagoBuilder()
                .nombre("Juan")
                .apellido("Pérez")
                .email("juanpz@hotmail.com")
                .telefono("3238366895")
                .ciudad("Bogotá")
                .build();
    }

    public Pagos construirPagoMedellin() {
        return new PagoBuilder()
                .nombre("Ana")
                .apellido("Gómez")
                .email("anagz@edu.com")
                .telefono("2337459865")
                .ciudad("Medellín")
                .build();
    }
}
