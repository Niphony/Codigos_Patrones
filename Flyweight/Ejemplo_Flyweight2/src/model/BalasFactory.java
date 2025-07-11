package model;

import java.util.HashMap;
import java.util.Map;

public class BalasFactory {
    private static Map<String, TipoArmas> tipos = new HashMap<>();

    public static TipoArmas getTipo(String nombre, String sprite) {
        String key = nombre + "-" + sprite;
        TipoArmas tipo = tipos.get(key);
        if (tipo == null) {
            tipo = new TipoArmas(nombre, sprite);
            tipos.put(key, tipo);
        }
        return tipo;
    }
}