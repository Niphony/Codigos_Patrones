package model;

public class Mem implements Verificador {
    @Override
    public boolean validar(String usuario, String contraseña) {
        return usuario.equals("admin") && contraseña.equals("123");
    }
}
