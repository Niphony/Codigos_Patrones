package co.edu.udistrital.model.fabricaconcreta;

import co.edu.udistrital.model.R7;
import co.edu.udistrital.model.fabricaabstracta.Ryzen;
import co.edu.udistrital.model.fabricaabstracta.RyzenFactory;

public class r7Factory implements RyzenFactory {

    @Override
    public Ryzen CrearProcesador(){
        return new R7();
  }

  }
