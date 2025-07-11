package model;

public class Autenticador implements Verificador {
    @Override
    public boolean validar(String usuario, String contraseña) {
       
        return usuario.contains("@") && contraseña.length() >= 5;
    }
}