package model;


public class RutaEconomica implements EstrategiaNavegacion {
    @Override
    public String calcularRuta(String origen, String destino) {
        return "Ruta económica de " + origen + " a " + destino;
    }
}