package controller;


import model.NotaFactory;
import model.NotaMusical;
import view.VistaConsola;

public class Main {
    public static void main(String[] args) {
        VistaConsola vista = new VistaConsola();

        NotaMusical doNota = NotaFactory.getNota("Do");
        NotaMusical reNota = NotaFactory.getNota("Re");

        vista.mostrarinfo(doNota.tocar());
        vista.mostrarinfo(reNota.tocar());
        vista.mostrarinfo(NotaFactory.getNota("Do").tocar()); // Reutiliza "Do"
    }
}