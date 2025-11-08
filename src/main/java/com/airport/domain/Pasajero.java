package com.airport.domain;
public class Pasajero {
  private final String nombre;
  private final String codigoBP;
  private boolean abordo;
  public Pasajero(String nombre, String codigoBP){ this.nombre=nombre; this.codigoBP=codigoBP; }
  public String getCodigoBP(){ return codigoBP; }
  public boolean isAbordo(){ return abordo; }
  public void marcarAbordo(){ this.abordo=true; }
}