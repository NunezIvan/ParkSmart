package Vehiculo;

import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Menu_estacionamiento {

    private Estacionamiento modelo;

    public Menu_estacionamiento(Estacionamiento modelo) {
        this.modelo = modelo;
    }

    public static int mostrarMenu(Scanner scanner) {
        limpiar_consola();
        printTitle();
        System.out.println("1. Registrar entrada de vehiculo");
        System.out.println("2. Registrar salida de vehiculo");
        System.out.println("3. Mostrar estado del estacionamiento");
        System.out.println("4. Volver");
        System.out.print("Seleccione una opcion: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static void mostrarEstadoEstacionamiento(List<Vehiculo> listaVehiculos, int espaciosDisponibles) {
        limpiar_consola();
        printTitle();
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
                               ", Hora de Entrada: " + vehiculo.getHoraEntradaFormateada()+
                               ", Sitio: " + vehiculo.getSitio());
        }
        
        System.out.println("\nEspacios disponibles: " + espaciosDisponibles + "\n");
    }

    public static Vehiculo pedirDatosVehiculo(Scanner scanner , String sitio) {
        String matricula = Vehiculo.generarMatriculaAleatoria();
        
        char tipo = 'a';
        String input;
        
        do {
            System.out.print("Ingrese el tipo de vehiculo (ej. C para coche, M para moto, B para bicicleta): ");
            input = scanner.nextLine();

            if (input.isEmpty()) {
                limpiar_consola();
                System.out.print("SELECCION INCORRECTA, NO PUEDE DEJAR EL CAMPO VACÍO\n");
                continue;
            }

            tipo = input.charAt(0);

            if (tipo != 'c' && tipo != 'C' && tipo != 'M' && tipo != 'm' && tipo != 'b' && tipo != 'B') {
                limpiar_consola();
                System.out.print("SELECCION INCORRECTA, SOLO UTILICE LO INDICADO\n");
            }

        } while (tipo != 'c' && tipo != 'C' && tipo != 'M' && tipo != 'm' && tipo != 'b' && tipo != 'B');

        return new Vehiculo(matricula,sitio, tipo, LocalDateTime.now(), null);
    }

    public static String pedirMatriculaVehiculo(Scanner scanner) {
        System.out.print("Ingrese la matricula del vehiculo: ");
        return scanner.nextLine();
    }

    private void gestionarEntradaVehiculo(String sitio) {
        limpiar_consola();
        printTitle();
        Scanner scanner = new Scanner(System.in);
        if (modelo.verificarDisponibilidad()) {
            Vehiculo vehiculo = Menu_estacionamiento.pedirDatosVehiculo(scanner,sitio);
            if (modelo.agregarVehiculo(vehiculo)) {
                System.out.println("\nVehiculo registrado exitosamente.");
            } else {
                System.out.println("\nNo se pudo registrar el vehiculo. El estacionamiento está lleno.");
            }
        } else {
            System.out.println("\nNo hay espacio disponible en el estacionamiento.\n");
        }
        
        pausa(scanner);
    }

    private void gestionarSalidaVehiculo(String sitio) {
        Scanner scanner = new Scanner(System.in);
        Menu_estacionamiento.mostrarEstadoEstacionamiento(modelo.getListaVehiculos(), modelo.getCapacidadTotal() - modelo.getListaVehiculos().size());
        String matricula = Menu_estacionamiento.pedirMatriculaVehiculo(scanner);
        
        if (modelo.calcularPrecio(matricula,sitio) != 0) {
            limpiar_consola();
            System.out.println("\nPrecio total a pagar: " + modelo.calcularPrecio(matricula,sitio) + " soles.");
        }
        
        if (modelo.removerVehiculo(matricula,sitio)) {
            System.out.println("\nVehiculo retirado exitosamente.");
            pausa(scanner);
        } else {
            limpiar_consola();
            System.out.println("\nNo se encontro un vehiculo con esa matricula.\n");
            pausa(scanner);
        }
    }

    private void actualizarVista() {
        Scanner scanner = new Scanner(System.in);
        Menu_estacionamiento.mostrarEstadoEstacionamiento(modelo.getListaVehiculos(), modelo.getCapacidadTotal() - modelo.getListaVehiculos().size());
        pausa(scanner);
    }

    public void iniciar(String sitio,Estacionamiento modelo) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            int opcion = Menu_estacionamiento.mostrarMenu(scanner);
            switch (opcion) {
                case 1 -> gestionarEntradaVehiculo(sitio);
                case 2 -> gestionarSalidaVehiculo(sitio);
                case 3 -> actualizarVista();
                case 4 -> salir = true;
                default -> System.out.println("Opcion no válida. Intente de nuevo.");
            }
        }
    }

    public static void pausa(Scanner scanner) {
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();
    }

    public static void printTitle() {
        System.out.println(" ____            _     ____                       _   ");
        System.out.println("|  _ \\ __ _ _ __| | __/ ___| _ __ ___   __ _ _ __| |_ ");
        System.out.println("| |_) / _` | '__| |/ /\\___ \\| '_ ` _ \\ / _` | '__| __|");
        System.out.println("|  __/ (_| | |  |   <  ___) | | | | | | (_| | |  | |_ ");
        System.out.println("|_|   \\__,_|_|  |_|\\_\\|____/|_| |_| |_|\\__,_|_|   \\__|");
        System.out.println("\n\n\n");
    }

    public static void limpiar_consola() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Error al limpiar la consola.");
        }
    }
}