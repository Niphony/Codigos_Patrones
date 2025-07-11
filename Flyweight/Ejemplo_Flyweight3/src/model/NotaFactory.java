package model;

import java.util.HashMap;
import java.util.Map;

public class NotaFactory {
    private static Map<String, NotaMusical> notas = new HashMap<>();

    public static NotaMusical getNota(String nombre) {
        NotaMusical nota = notas.get(nombre);
        if (nota == null) {
            nota = new NotaMusical(nombre);
            notas.put(nombre, nota);
        }
        return nota;
    }
}