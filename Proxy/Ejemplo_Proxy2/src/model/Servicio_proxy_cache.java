package model;


import java.util.HashMap;
import java.util.Map;
import model.proxy.Interfaceproxy;

public class Servicio_proxy_cache implements Interfaceproxy {
    private Servicio_real servicioReal;
    private Map<String, Integer> cache = new HashMap<>();

    @Override
    public int num(int a, int b) {
        String clave = a + "," + b;
        
        if (cache.containsKey(clave)) {
            System.out.println("✅ Resultado obtenido del cache.");
            return cache.get(clave);
        }

        if (servicioReal == null) {
            servicioReal = new Servicio_real();
        }

        int resultado = servicioReal.num(a, b);
        cache.put(clave, resultado);
        return resultado;
    }
}
