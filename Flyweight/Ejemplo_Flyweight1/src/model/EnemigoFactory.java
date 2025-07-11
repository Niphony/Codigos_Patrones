package model;

import java.util.HashMap;
import java.util.Map;

public class EnemigoFactory {
    private static Map<String, TipoEnemigo> tipos = new HashMap<>();

    public static TipoEnemigo getTipo(String nombre, String sprite) {
        String key = nombre + "-" + sprite;
        TipoEnemigo tipo = tipos.get(key);
        if (tipo == null) {
            tipo = new TipoEnemigo(nombre, sprite);
            tipos.put(key, tipo);
        }
        return tipo;
    }
}