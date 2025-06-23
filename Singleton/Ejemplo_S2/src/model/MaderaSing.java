package model;

import java.util.ArrayList;
import java.util.List;

public class MaderaSing {

private static MaderaSing instance;
private List<String> listamaderas;


private MaderaSing() {
    // Constructor privado para evitar instanciación externa
    this.listamaderas = new ArrayList<>();
}

public static MaderaSing getInstance() {
    if (instance == null) {
        instance = new MaderaSing();
    }
    return instance;
}

public void agmaderas(String madera) {
    this.listamaderas.add(madera);
}

public String getListamaderas() {
   listamaderas.sort(String::compareTo);
    StringBuilder sb = new StringBuilder();
    for (String madera : listamaderas) {
        sb.append(madera).append("\n");
    }
    return sb.toString();
}

}