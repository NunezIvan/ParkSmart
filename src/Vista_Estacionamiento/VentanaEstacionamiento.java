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
        
        String tipo;
        
        System.out.println("Vehiculos en el estacionamiento:");
        for (Vehiculo vehiculo : listaVehiculos) {
            switch (vehiculo.getTipo()) {
                case 'c' -> tipo = "CARRO";
                case 'C' -> tipo = "CARRO";
                case 'm' -> tipo = "MOTOCICLETA";
                case 'M' -> tipo = "MOTOCICLETA";
                case 'b' -> tipo = "BICICLETA";
                case 'B' -> tipo = "BICICLETA";
                default -> tipo = "No especificado";
            }
            
            System.out.println("Matricula: " + vehiculo.getMatricula() +
                               ", Tipo: " + tipo +
                               ",\tHora de Entrada: " + vehiculo.getHoraEntradaFormateada());
        }
        
        System.out.println("\nEspacios disponibles: " + espaciosDisponibles + "\n");
    }

    public Vehiculo pedirDatosVehiculo() {
        // String matricula = scanner.nextLine();
        String matricula = modelo.generarMatriculaAleatoria();
        
        char tipo = 'a';
        String input;
        
        do {
            System.out.print("Ingrese el tipo de vehiculo (ej. C para coche, M para moto, B para bicicleta): ");
            input = scanner.nextLine();

            if (input.isEmpty()) {
                limpiarConsola();
                System.out.print("SELECCION INCORRECTA, NO PUEDE DEJAR EL CAMPO VACÍO\n");
                continue;
            }

            tipo = input.charAt(0);

            if (tipo != 'c' && tipo != 'C' && tipo != 'M' && tipo != 'm' && tipo != 'b' && tipo != 'B') {
                limpiarConsola();
                System.out.print("SELECCION INCORRECTA, SOLO UTILICE LO INDICADO\n");
            }

        } while (tipo != 'c' && tipo != 'C' && tipo != 'M' && tipo != 'm' && tipo != 'b' && tipo != 'B');

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
