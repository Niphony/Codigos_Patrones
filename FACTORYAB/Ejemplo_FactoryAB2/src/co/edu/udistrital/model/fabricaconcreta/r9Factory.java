package co.edu.udistrital.model.fabricaconcreta;

import co.edu.udistrital.model.R9;
import co.edu.udistrital.model.fabricaabstracta.Ryzen;
import co.edu.udistrital.model.fabricaabstracta.RyzenFactory;

public class r9Factory implements RyzenFactory{

   @Override
  public Ryzen CrearProcesador(){
    return new R9();
  }
  
  }
