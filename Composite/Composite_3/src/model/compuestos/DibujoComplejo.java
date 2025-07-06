package model.compuestos;

import java.util.ArrayList;
import java.util.List;
import model.Forma;

public class DibujoComplejo implements Forma {
    private List<Forma> formas = new ArrayList<>();

    public void agregar(Forma forma) {
        formas.add(forma);
    }

    public void eliminar(Forma forma) {
        formas.remove(forma);
    }

    @Override
    public void dibujar() {
        for (Forma f : formas) {
            f.dibujar();
        }
    }
}
