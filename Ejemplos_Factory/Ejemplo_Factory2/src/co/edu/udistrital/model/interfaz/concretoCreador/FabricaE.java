package co.edu.udistrital.model.interfaz.concretoCreador;

import co.edu.udistrital.model.Lavadora;
import co.edu.udistrital.model.Nevera;
import co.edu.udistrital.model.interfaz.Electrodomestico;

public class FabricaE {

    public static Electrodomestico construir(String tipo) {
        switch (tipo.toLowerCase()) {
            case "nevera":
                return new Nevera();
            case "lavadora":
                return new Lavadora();
            default:
                System.out.println("Electrodoméstico no encontrado");
                return null;
        }
    }
}