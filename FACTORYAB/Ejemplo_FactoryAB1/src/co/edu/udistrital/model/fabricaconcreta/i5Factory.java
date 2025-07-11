package co.edu.udistrital.model.fabricaconcreta;

import co.edu.udistrital.model.I5;
import co.edu.udistrital.model.fabricaabstracta.Intel;
import co.edu.udistrital.model.fabricaabstracta.IntelFactory;

public class i5Factory implements IntelFactory {

    @Override
    public Intel CrearProcesador(){
        return new I5();
  }

  }
