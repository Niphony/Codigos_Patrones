package model;

import model.proxy.Interfaceproxy;

public class Servicio_proxy implements Interfaceproxy {
 private Servicio_real servicioReal;
 private boolean accesoPermitido = false;

 public void setAccesoPermitido(boolean permiso) {
     this.accesoPermitido = permiso;
 }

 @Override
 public int operacion(int a, int b) {
     if (!accesoPermitido) {
         throw new SecurityException("🔒 Acceso denegado"); 
     }
     
     if (servicioReal == null) {
         servicioReal = new Servicio_real(); 
     }
     
     return servicioReal.operacion(a, b); 
 }
}