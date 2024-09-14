package Main;
import java.util.Scanner;
public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pantalla_Inicio(scanner);
    }

    static void Pantalla_Inicio(Scanner consola) {
        String[] opciones = {"Registrarse", "Inicio de Sesion", "Salir"};
        int idx = 0;
        boolean band = true;
        while (band) {
            limpiar_consola();
            printTitle();

            for (int i = 0; i < opciones.length; i++) {
                if (i == idx) {
                    System.out.println("-> " + opciones[i]);
                } else {
                    System.out.println("   " + opciones[i]);
                }
            }
            System.out.println("\nUse las teclas 'w' para subir, 's' para bajar y 'Enter' para seleccionar.");
            String input = consola.nextLine().toLowerCase();

            if (input.isEmpty()) {
                band = Seleccion(idx);
            } else {
                char key = input.charAt(0);

                switch (key) {
                    case 'w':
                        idx = (idx - 1 + opciones.length) % opciones.length;
                        break;
                    case 's':
                        idx = (idx + 1) % opciones.length;
                        break;
                    default:
                        System.out.println("Entrada no válida, use 'w' para arriba, 's' para abajo y 'Enter' para seleccionar.");
                        break;
                }
            }
        }
        consola.close();
    }

    private static boolean Seleccion(int idx) {
        switch (idx) {
            case 0:
                System.out.println("Has seleccionado Registrarse.");
                usuarios.registrar_usuario(); 
                interfaz_Estacionamiento.interfaz_est();
                return false; 
            case 1:
                System.out.println("Has seleccionado Iniciar Sesión.");
                usuarios.iniciar_sesion();
            
                break;
            case 2:
                System.out.println("Saliendo del programa...");
                return false;
        }
        return true;
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

    public static void printTitle() {
        System.out.println(" ____            _     ____                       _   ");
        System.out.println("|  _ \\ __ _ _ __| | __/ ___| _ __ ___   __ _ _ __| |_ ");
        System.out.println("| |_) / _` | '__| |/ /\\___ \\| '_ ` _ \\ / _` | '__| __|");
        System.out.println("|  __/ (_| | |  |   <  ___) | | | | | | (_| | |  | |_ ");
        System.out.println("|_|   \\__,_|_|  |_|\\_\\|____/|_| |_| |_|\\__,_|_|   \\__|");
        System.out.println("\n\n\n");
    }
}