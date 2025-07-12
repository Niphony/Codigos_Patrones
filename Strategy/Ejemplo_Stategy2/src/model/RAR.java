package model;

public class RAR implements EstrategiaCompresion {
    @Override
    public String comprimir(String archivo) {
        return archivo + " comprimido en RAR";
    }
}