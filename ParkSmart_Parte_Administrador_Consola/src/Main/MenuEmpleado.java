
package Main;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class MenuEmpleado {

    // Método para limpiar la consola (dependiendo del sistema operativo)
    public static void limpiar_consola() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                for (int i = 0; i < 20; i++) {
                    System.out.println("");
                }
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Error al limpiar la consola.");
        }
    }

    // Método que imprime el título del menú de empleados
    public static void printTitle() {
        System.out.println(" ____            _     ____                       _   ");
        System.out.println("|  _ \\ __ _ _ __| | __/ ___| _ __ ___   __ _ _ __| |_ ");
        System.out.println("| |_) / _` | '__| |/\\___ \\| '_ ` _ \\ / _` | '__| __|");
        System.out.println("|  __/ (_| | |  |   <  ___) | | | | | | (_| | |  | |_ ");
        System.out.println("|_|   \\__,_|_|  |_|\\_\\|____/|_| |_| |_|\\__,_|_|   \\__|");
        System.out.println("\n\n\n");
    }

    // Menú de empleados
    public static void mostrarMenuEmpleado() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
         Estacionamiento estacionamiento = new Estacionamiento(5, 6, 5, 5.0);
         int piso = 1; 
        while (!salir) {
            limpiar_consola();
            printTitle();
            System.out.println("Menú de Empleado");
            System.out.println("1. Ver estacionamiento");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                     Interfaz_Estacionamiento.interfaz_est(scanner, estacionamiento, piso);// Lógica para ver el estado del estacionamiento
                    break;
                case "2":
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

    // Opción para ver estacionamiento (puedes implementar la lógica para mostrar el estado del estacionamiento)


    // Método para pausar la ejecución hasta que el usuario presione Enter
    public static void esperarEntrada() {
        System.out.println("\nPresione Enter para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}

