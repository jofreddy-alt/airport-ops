package com.airport.domain;
public class Puerta {
  private final String codigo;
  private boolean ocupada;
  public Puerta(String codigo){ this.codigo=codigo; }
  public String getCodigo(){ return codigo; }
  public boolean isOcupada(){ return ocupada; }
  public void ocupar(){ this.ocupada=true; }
  public void liberar(){ this.ocupada=false; }
}