package Main;

import java.util.Scanner;

import Vehiculo.Estacionamiento;
import Vehiculo.Menu_estacionamiento;

public class interfaz_Estacionamiento {
    static final int filas = 5;
    static final int columnas = 6;

    static int fila_reciente = 0;
    static int columna_reciente = 0;

    public static void dibujarCuadro() {
        char[] letras_filas = {'A', 'B', 'C', 'D', 'E'};
        
        for (int row = 0; row < filas; row++) {
            for (int col = 0; col < columnas; col++) {
                System.out.print("  --- ");
            }
            System.out.println();

            for (int col = 0; col < columnas; col++) {
                if (row == fila_reciente && col == columna_reciente) {
                    System.out.print("|  X  ");
                } else {
                    System.out.printf("| %s%-2d ", letras_filas[row], col + 1);
                }
            }
            System.out.println("|");
        }
        System.out.print(" ");
        for (int col = 0; col < columnas; col++) {
            System.out.print(" ---  ");
        }
        System.out.println();
    }

    //Funcionalidad para mover el cursor
    public static void moveCursor(char direction) {
        switch (direction) {
            case 'w':
                if (fila_reciente > 0) {
                    fila_reciente--;
                }
                break;
            case 's':
                if (fila_reciente < filas - 1) {
                    fila_reciente++;
                }
                break;
            case 'a':
                if (columna_reciente > 0) {
                    columna_reciente--;
                }
                break;
            case 'd':
                if (columna_reciente < columnas - 1) {
                    columna_reciente++;
                }
                break;
            default:
                System.out.println("Comando no reconocido. Usa W, A, S, D para moverte.");
        }
    }

    public static void espacio_Seleccionado(char row, int col,Scanner scanner) {
        String sitio = row + String.valueOf(col);
        System.out.println("Se seleccionó el espacio " + sitio);
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();
        Estacionamiento modelo = new Estacionamiento(30, 5.0);
        Menu_estacionamiento menu = new Menu_estacionamiento(modelo);
        menu.iniciar(sitio, modelo);
    }

    public static void interfaz_est() {
        Scanner scanner = new Scanner(System.in);
        String input;
        char[] rowLabels = {'A', 'B', 'C', 'D', 'E'};

        System.out.println("Usa las teclas WASD para moverte y presiona 'Enter' para seleccionar.");
        System.out.println("Presiona 'q' para salir.");
        
        while (true) {
            Menu.limpiar_consola();
            Menu.printTitle();
            dibujarCuadro(); 
            System.out.print("Ingresa dirección (WASD o Enter para seleccionar): ");
            input = scanner.nextLine().toLowerCase(); 

            if (input.equals("q")) {
                System.out.println("Has salido del programa.");
                break;
            } else if (input.equals("")) {
                espacio_Seleccionado(rowLabels[fila_reciente], columna_reciente + 1,scanner); 
            } else if (input.length() == 1) {
                moveCursor(input.charAt(0));
            } else {
                System.out.println("Comando no reconocido. Usa WASD para moverte o presiona Enter.");
            }
            System.out.println();
        }

        scanner.close();
    }
}
