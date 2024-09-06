package Vista_Estacionamiento;

import Modelo_Estacionamiento.Estacionamientos;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;
import Modelo_Estacionamiento.Vehiculo;

/**
 *
 * @author andrey
 */
public class VentanaEstacionamiento {
    private Scanner scanner = new Scanner(System.in);
    private Vehiculo modelo;

    public int mostrarMenu() {
        limpiarConsola();
        System.out.println("1. Registrar entrada de vehiculo");
        System.out.println("2. Registrar salida de vehiculo");
        System.out.println("3. Mostrar estado del estacionamiento");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opcion: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarEstadoEstacionamiento(List<Vehiculo> listaVehiculos, int espaciosDisponibles) {
        limpiarConsola();
        
        System.out.println("Vehiculos en el estacionamiento:");
        for (Vehiculo vehiculo : listaVehiculos) {
            System.out.println("Matricula: " + vehiculo.getMatricula() +
                               ", Tipo: " + vehiculo.getTipo() +
                               ", Hora de Entrada: " + vehiculo.getHoraEntradaFormateada());
        }
        
        System.out.println("\nEspacios disponibles: " + espaciosDisponibles);
    }

    public Vehiculo pedirDatosVehiculo() {
        String matricula = modelo.generarMatriculaAleatoria();
        System.out.print("Ingrese el tipo de vehiculo (ej. C para coche, M para moto): ");
        char tipo = scanner.nextLine().charAt(0);
        
        return new Vehiculo(matricula, tipo, LocalDateTime.now(), null);
    }
    
    //Para situacion real
    public String pedirMatriculaVehiculo() {
        System.out.print("Ingrese la matricula del vehiculo: ");
        return scanner.nextLine();
    }
    
    public void limpiarConsola() {
        for (int i = 0; i < 20; i++) { 
            System.out.println(); 
        }
    }
    
    public static void pausa() {
        System.out.println("Presione cualquier tecla para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
