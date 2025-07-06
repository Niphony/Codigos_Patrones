package model.componentes;

import java.util.ArrayList;
import java.util.List;
import model.Lapiz;

public class Compuesta implements Lapiz {

    private List<Lapiz> elementos = new ArrayList<>();

    @Override
    public void escribir() {
        for (Lapiz elemento : elementos) {
            elemento.escribir();
        }
    }

    public void agregar(Lapiz l) {
        elementos.add(l);
    }

    public void eliminar(Lapiz l) {
        elementos.remove(l);
    }
}
