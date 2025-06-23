package model;

public class Direccion {

    private static Direccion instance;
    private String dir;

    public static Direccion getInstance(String dir) {
        if (instance == null) {
            instance = new Direccion(dir);
        }
        return instance;
    }


    private Direccion(String dir) {
        this.dir = dir;
    }

    public String getDir() {
        return dir;
    }
    public void setDir(String dir) {
        this.dir = dir;
    }
    



}
