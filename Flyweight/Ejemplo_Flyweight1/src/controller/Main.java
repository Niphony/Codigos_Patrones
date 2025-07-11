package controller;

import model.Enemigo;
import model.EnemigoFactory;
import model.TipoEnemigo;
import view.VistaConsola;

public class Main {
    public static void main(String[] args) {
        VistaConsola vista = new VistaConsola();

        TipoEnemigo zombie = EnemigoFactory.getTipo("Zombie", "zombie.png");
        TipoEnemigo esqueleto = EnemigoFactory.getTipo("Esqueleto", "skeleton.png");

        Enemigo e1 = new Enemigo(10, 20, zombie);
        Enemigo e2 = new Enemigo(30, 40, esqueleto);
        Enemigo e3 = new Enemigo(50, 60, zombie); 

        vista.mostrarinfo(e1.dibujar());
        vista.mostrarinfo(e2.dibujar());
        vista.mostrarinfo(e3.dibujar());
    }
}