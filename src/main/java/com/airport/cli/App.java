package com.airport.cli;
import com.airport.domain.*;
import com.airport.service.GestionEmbarqueService;
public class App {
  private static final java.util.Scanner scanner = new java.util.Scanner(System.in);
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

    //A partir de aqui estara el metodo del menu
    mostrarMenu();
  }

  public static void mostrarMenu() {
      int opcion;
      do {
          limpiarPantalla();
          System.out.println("============================================");
          System.out.println("        ✈️  AGENCIA DE VUELOS JAVA  ✈️");
          System.out.println("============================================");
          System.out.println("Hola! Bienvenido/a a la Agencia de Vuelos");
          System.out.println("Seleccione una opción del menú:");
          System.out.println("--------------------------------------------");
          System.out.println("[1] Registrar vuelo de cliente");
          System.out.println("[2] Consultar registro de vuelo");
          System.out.println("[3] Eliminar registro de vuelo");
          System.out.println("[4] Modificar registro de vuelo");
          System.out.println("[5] Listar registros por fecha");
          System.out.println("[0] Salir");
          System.out.println("--------------------------------------------");
          System.out.print("Ingrese una opción: ");

          opcion = scanner.nextInt();
          scanner.nextLine();

          switch (opcion) {
              case 1:
                  registrarVuelo();
                  break;
              case 2:
                  consultarVuelo();
                  break;
              case 3:
                  eliminarVuelo();
                  break;
              case 4:
                  modificarVuelo();
                  break;
              case 5:
                  listarRegistrosPorFecha();
                  break;
              case 0:
                  System.out.println("Gracias por usar la Agencia de Vuelos. Hasta pronto!");
                  break;
              default:
                  System.out.println("Opción inválida. Intentelo nuevamente.");
                  pausa();
          }
      } while (opcion != 0);
  }

  private static void registrarVuelo() {
      limpiarPantalla();
      System.out.println("=== Registrar Vuelo de Cliente ===");
      System.out.println("Aquí se implementaría la lógica de registro...");
      pausa();
  }

  private static void consultarVuelo() {
      limpiarPantalla();
      System.out.println("=== Consultar Registro de Vuelo ===");
      System.out.println("Mostraría: número de embarque, código, cliente, hora, retrasos, estado, etc.");
      pausa();
  }

  private static void eliminarVuelo() {
      limpiarPantalla();
      System.out.println("=== Eliminar Registro de Vuelo ===");
      System.out.println("Aquí se eliminaría el registro de un cliente...");
      pausa();
  }

  private static void modificarVuelo() {
      limpiarPantalla();
      System.out.println("=== Modificar Registro de Vuelo ===");
      System.out.println("Permitiría cambiar asiento, destino, hora, etc.");
      pausa();
  }

  private static void listarRegistrosPorFecha() {
      limpiarPantalla();
      System.out.println("=== Listar Registros por Fecha ===");
      System.out.println("Aquí se listarían los registros filtrados por una fecha...");
      pausa();
  }

  private static void limpiarPantalla() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
  }

  private static void pausa() {
      System.out.println("\nPresione ENTER para continuar...");
      scanner.nextLine();
  }
}