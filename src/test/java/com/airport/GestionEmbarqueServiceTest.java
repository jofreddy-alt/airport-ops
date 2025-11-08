import com.airport.domain.*;
import com.airport.service.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class GestionEmbarqueServiceTest {
  @Test void flujoBasico(){
    GestionEmbarqueService s = new GestionEmbarqueService();
    Vuelo v = new Vuelo("LA1","LIM","CUZ");
    v.agregarPasajero("Ana","BP1");
    Puerta p = new Puerta("A1");
    s.asignarPuerta(v,p);
    s.iniciarEmbarque(v);
    assertTrue(s.validarBoardingPass(v,"BP1"));
    s.cerrarEmbarque(v);
    assertEquals(EstadoVuelo.CERRADO, v.getEstado());
  }
}