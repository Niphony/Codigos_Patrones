package model;

public class ZIP implements EstrategiaCompresion {
    @Override
    public String comprimir(String archivo) {
        return archivo + " comprimido en ZIP";
    }
}