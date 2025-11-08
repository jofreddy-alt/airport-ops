package com.airport.service;
import com.airport.domain.*;
import com.airport.service.ex.ReglaNegocioException;
public class GestionEmbarqueService {
  public void asignarPuerta(Vuelo vuelo, Puerta puerta){ if(puerta.isOcupada()) throw new ReglaNegocioException("Puerta ocupada"); puerta.ocupar(); vuelo.setPuerta(puerta); }
  public void iniciarEmbarque(Vuelo vuelo){ if(vuelo.getEstado()!=EstadoVuelo.PROGRAMADO) throw new ReglaNegocioException("Estado inválido"); vuelo.setEstado(EstadoVuelo.EMBARCANDO); }
  public boolean validarBoardingPass(Vuelo vuelo, String bp){ return vuelo.buscarPasajeroPorBP(bp).map(p->{ p.marcarAbordo(); return true;}).orElse(false); }
  public void cerrarEmbarque(Vuelo vuelo){ if(vuelo.getEstado()!=EstadoVuelo.EMBARCANDO) throw new ReglaNegocioException("No se puede cerrar"); vuelo.setEstado(EstadoVuelo.CERRADO); }
}