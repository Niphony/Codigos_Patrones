package controller;

import model.Director;
import model.Recibo;
import model.ReciboBuilder;
import view.VistaConsola;

public class Controller {

    private VistaConsola vista;
    private Director direc;


    public Controller() {
        vista = new VistaConsola();
        direc = new Director();
    }

    public void run(){
        vista.mostrarInformacion("Bienvenido al sistema de recibos");
        String opcion = vista.leerTexto("Ingrese el tipo de recibo que tiene (mensual), ya precarga el recibo que llego), (manual) introducir manualmente:");
    if (opcion.equalsIgnoreCase("Mensual")){
    Director direc = new Director();
    Recibo reci = direc.Recibo_Luz();
    vista.mostrarInformacion("Ya se genero su recibo mensual");
    mostrarReci(reci);
    }else{
        String tipo = vista.leerTexto("Ingrese el tipo de recibo que tiene (mensual, ya precarga el recibo que llego), (manual)introducir manualmente: ");
        double valor = Double.parseDouble(vista.leerTexto("Ingrese el valor del recibo: "));
        ReciboBuilder reciboBuilder = new ReciboBuilder()
        .setTipo(tipo)
        .setValor(valor);

        Recibo reci = reciboBuilder.build();
        vista.mostrarInformacion("Recibo Nuevo generado");
        mostrarReci(reci);
    }
    }
       


        public void mostrarReci(Recibo reci){
            vista.mostrarInformacion("El tipo del recibo es: "+reci.getTipo());
            vista.mostrarInformacion("El valor del recibo a pagar es: "+reci.getValor());

            
        }
    }
