package com.airport.domain;
import java.util.*;
public class Vuelo {
  private final String numero;
  private String origen, destino;
  private EstadoVuelo estado = EstadoVuelo.PROGRAMADO;
  private Puerta puerta;
  private final List<Pasajero> pasajeros = new ArrayList<>();
  public Vuelo(String numero, String origen, String destino){ this.numero=numero; this.origen=origen; this.destino=destino; }
  public void agregarPasajero(Pasajero p){ pasajeros.add(p); }
  public void agregarPasajero(String nombre, String bp){ pasajeros.add(new Pasajero(nombre,bp)); }
  public Optional<Pasajero> buscarPasajeroPorBP(String bp){ return pasajeros.stream().filter(p->p.getCodigoBP().equals(bp)).findFirst(); }
  public String getNumero(){return numero;}
  public EstadoVuelo getEstado(){return estado;}
  public void setEstado(EstadoVuelo e){this.estado=e;}
  public Puerta getPuerta(){return puerta;}
  public void setPuerta(Puerta p){this.puerta=p;}
}