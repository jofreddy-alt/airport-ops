package com.airport.cli;
import com.airport.domain.*;
import com.airport.service.GestionEmbarqueService;
public class App {
  public static void main(String[] args){
    GestionEmbarqueService svc = new GestionEmbarqueService();
    Vuelo vuelo = new Vuelo("LA1234","LIM","SCL");
    vuelo.agregarPasajero("Ana","BP001");
    vuelo.agregarPasajero("Luis","BP002");
    Puerta p = new Puerta("B12");
    svc.asignarPuerta(vuelo,p);
    svc.iniciarEmbarque(vuelo);
    System.out.println("Validación BP001: "+svc.validarBoardingPass(vuelo,"BP001"));
    svc.cerrarEmbarque(vuelo);
    System.out.println("Vuelo "+vuelo.getNumero()+" estado: "+vuelo.getEstado()+" puerta: "+vuelo.getPuerta().getCodigo());
  }
}