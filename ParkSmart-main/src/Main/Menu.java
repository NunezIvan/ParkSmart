package Main;

import Modelo.Estacionamiento;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        boolean usuarioAutenticado = false;
        Scanner scanner = new Scanner(System.in);
        Estacionamiento estacionamiento = new Estacionamiento(5, 6, 5.0);
        Interfaz.mostrarMenuSesion(scanner, estacionamiento, usuarioAutenticado);
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

    public static void printTitle() {
        System.out.println(" ____            _     ____                       _   ");
        System.out.println("|  _ \\ __ _ _ __| | __/ ___| _ __ ___   __ _ _ __| |_ ");
        System.out.println("| |_) / _` | '__| |/ /\\___ \\| '_ ` _ \\ / _` | '__| __|");
        System.out.println("|  __/ (_| | |  |   <  ___) | | | | | | (_| | |  | |_ ");
        System.out.println("|_|   \\__,_|_|  |_|\\_\\|____/|_| |_| |_|\\__,_|_|   \\__|");
        System.out.println("\n\n\n");
    }
}
