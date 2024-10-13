import java.util.Scanner;

public class Menu_Usuario {

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
                for(int i=0; i<20; i++) {
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

    public static void seleccionar_Lugar(Scanner scanner,Estacionamiento estacionamiento, int piso){
        limpiar_consola();
        printTitle();
        Interfaz_Estacionamiento.interfaz_est(scanner, estacionamiento, piso);
    }

    public static void mostrarMenuUsuario(Estacionamiento estacionamiento,int piso) {
        Scanner scanner = new Scanner(System.in);
        limpiar_consola();
        printTitle();
        String[] opciones = {"SELECCIONAR LUGAR","SALIR"};
        int idx = 0;
        boolean band = true;
        while (band) {
            limpiar_consola();
            printTitle();
            for (int i = 0; i < opciones.length; i++) {
                if (i == idx) System.out.println("-> " + opciones[i]);
                else System.out.println("   " + opciones[i]);
            }
            System.out.println("\nUse 'w' para arriba, 's' para abajo, y 'Enter' para seleccionar.");
            String input = scanner.nextLine().toLowerCase();

            if (input.isEmpty()) {
                switch (idx) {
                    case 0:
                        seleccionar_Lugar(scanner,estacionamiento,piso);
                        break;
                    case 1:
                        band = false;
                        break;
                }
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
                        break;
                }
            }
        }
        scanner.close();
    }
}
