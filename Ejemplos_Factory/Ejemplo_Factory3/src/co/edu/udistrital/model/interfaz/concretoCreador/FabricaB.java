package co.edu.udistrital.model.interfaz.concretoCreador;

import co.edu.udistrital.model.Cafe;
import co.edu.udistrital.model.Te;
import co.edu.udistrital.model.interfaz.Bebida;

public class FabricaB {

    public static Bebida construir(String tipo) {
        switch (tipo.toLowerCase()) {
            case "cafe":
                return new Cafe();
            case "te":
                return new Te();
            default:
                System.out.println("Bebida no encontrada");
                return null;
        }
    }
}