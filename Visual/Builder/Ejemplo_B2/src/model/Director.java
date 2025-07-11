package model;

public class Director {

    public Recibo Recibo_Luz(){
        return new ReciboBuilder()
        .setTipo("Luz")
        .setValor(250.000)
        .build();
    }

}