package model;

public class RutaRapida implements EstrategiaNavegacion {
    @Override
    public String calcularRuta(String origen, String destino) {
        return "Ruta rápida de " + origen + " a " + destino;
    }
}