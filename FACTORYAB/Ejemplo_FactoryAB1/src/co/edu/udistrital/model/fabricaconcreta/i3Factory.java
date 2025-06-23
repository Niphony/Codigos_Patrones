package co.edu.udistrital.model.fabricaconcreta;

import co.edu.udistrital.model.I3;
import co.edu.udistrital.model.fabricaabstracta.Intel;
import co.edu.udistrital.model.fabricaabstracta.IntelFactory;

public class i3Factory implements IntelFactory {

  @Override
  public Intel CrearProcesador(){
    return new I3();
  }

}
