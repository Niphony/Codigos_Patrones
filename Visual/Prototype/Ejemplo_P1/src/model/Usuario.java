package model;

public class Usuario implements Cloneable {

    String nombre;
    String apellido;
    int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public Usuario clone(){
        Usuario cloneusu = new Usuario();
        cloneusu.setNombre(this.nombre);
        cloneusu.setApellido(this.apellido);
        cloneusu.setEdad(this.edad);
        return cloneusu;
    }


}
