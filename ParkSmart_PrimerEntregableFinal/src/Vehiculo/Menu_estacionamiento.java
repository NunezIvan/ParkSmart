package Vehiculo;

import java.util.Scanner;

public class Menu_estacionamiento {

    private Estacionamiento modelo;

    public Menu_estacionamiento(Estacionamiento modelo) {
        this.modelo = modelo;
    }

    public void iniciar(Scanner scanner) {
        boolean salir = false;
        while (!salir) {
            limpiar_consola();
            printTitle();
            System.out.println("1. Registrar entrada de vehiculo");
            System.out.println("2. Registrar salida de vehiculo");
            System.out.println("3. Ver estado del estacionamiento");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    gestionarEntradaVehiculo(scanner);
                    break;
                case 2:
                    modelo.seleccionarVehiculoParaSalir(scanner);
                    break;
                case 3:
                    modelo.mostrarEstado();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no valida.");
            }

            if (opcion != 4) {
                pausa(scanner);
            }
        }
    }

    private void gestionarEntradaVehiculo(Scanner scanner) {
        limpiar_consola();
        printTitle();
        if (modelo.verificarDisponibilidad()) {
            System.out.print("Ingrese el sitio (ej. A1): ");
            String sitio = scanner.nextLine().toUpperCase();
            System.out.print("Ingrese el tipo de vehiculo (C para coche, M para moto, B para bicicleta): ");
            char tipo = scanner.nextLine().charAt(0);
            String matricula = Vehiculo.generarMatriculaAleatoria();

            int fila = sitio.charAt(0) - 'A';
            int columna = Integer.parseInt(sitio.substring(1)) - 1;

            Vehiculo vehiculo = new Vehiculo(matricula, tipo, fila, columna, null, null);
            if (modelo.agregarVehiculo(vehiculo, fila, columna)) {
                System.out.println("Vehiculo registrado exitosamente.");
            } else {
                System.out.println("Error: No se pudo registrar el vehiculo.");
            }
        } else {
            System.out.println("No hay espacio disponible en el estacionamiento.");
        }
        pausa(scanner);
    }

    private void limpiar_consola() {
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
}
