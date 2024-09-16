package Main;

import Vehiculo.Estacionamiento;
import Vehiculo.Vehiculo;
import java.util.Scanner;

public class interfaz_Estacionamiento {
    static int filas = 5;
    static int columnas = 6;
    static int fila_reciente = 0;
    static int columna_reciente = 0;

    public static void dibujarCuadro(Estacionamiento estacionamiento) {
        filas = estacionamiento.getFilas();
        columnas = estacionamiento.getColumnas();
        
        Menu.limpiar_consola();
        for (int row = 0; row < filas; row++) {
            for (int col = 0; col < columnas; col++) {
                System.out.print("  --- ");
            }
            System.out.println();
            for (int col = 0; col < columnas; col++) {
                if (row == fila_reciente && col == columna_reciente) {
                    System.out.print("|  X  ");
                } else if (estacionamiento.espacioOcupado(row, col)) {
                    System.out.print("| OCC ");
                } else {
                    System.out.printf("| %s%-2d ", (char)('A' + row), col + 1);
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

    public static void moveCursor(char direction) {
        switch (direction) {
            case 'w':
                if (fila_reciente > 0) fila_reciente--;
                break;
            case 's':
                if (fila_reciente < filas - 1) fila_reciente++;
                break;
            case 'a':
                if (columna_reciente > 0) columna_reciente--;
                break;
            case 'd':
                if (columna_reciente < columnas - 1) columna_reciente++;
                break;
        }
    }

    public static void espacioSeleccionado(Scanner scanner, Estacionamiento estacionamiento) {
        if (estacionamiento.espacioOcupado(fila_reciente, columna_reciente)) {
            System.out.println("Este espacio ya esta ocupado. Elige otro.");
            return;
        }
        
        char tipo;
        
        do {
            Menu.limpiar_consola();
            
            System.out.print("Ingrese el tipo de vehiculo (C para coche, M para moto): ");
            String input = scanner.nextLine();
                        
            if (!input.isEmpty()) {
                tipo = Character.toLowerCase(input.charAt(0));
            } else {
                tipo = ' ';
            }
        } while (tipo != 'c' && tipo != 'm');
        
        String matricula = Vehiculo.generarMatriculaAleatoria();

        Vehiculo vehiculo = new Vehiculo(matricula, tipo, fila_reciente, columna_reciente, null, null);
        if (estacionamiento.agregarVehiculo(vehiculo, fila_reciente, columna_reciente)) {
            System.out.println("Vehiculo registrado exitosamente en el espacio " + (char)('A' + fila_reciente) + (columna_reciente + 1));
        }
    }

    public static void mostrarMenuSesion(Scanner scanner, Estacionamiento estacionamiento) {
        Menu.limpiar_consola();
        Menu.printTitle();
        String[] opciones = {"Registrarse", "Iniciar Sesion", "Cancelar"};
        int idx = 0;
        boolean band = true;
        while (band) {
            for (int i = 0; i < opciones.length; i++) {
                if (i == idx) System.out.println("-> " + opciones[i]);
                else System.out.println("   " + opciones[i]);
            }
            System.out.println("\nUse 'w' para arriba, 's' para abajo, y 'Enter' para seleccionar.");
            String input = scanner.nextLine().toLowerCase();

            if (input.isEmpty()) {
                switch (idx) {
                    case 0:
                        usuarios.registrar_usuario();
                        break;
                    case 1:
                        usuarios.iniciar_sesion(scanner, estacionamiento);
                        break;
                    case 2:
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
            Menu.limpiar_consola();
            Menu.printTitle();
        }
    }

    public static void interfaz_est(Scanner scanner, Estacionamiento estacionamiento) {
        boolean salir = false;
        while (!salir) {
            dibujarCuadro(estacionamiento);
            System.out.print("Use WASD para moverse, Enter para seleccionar, '+' para menu de sesion, 'q' para salir: ");
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("q")) {
                salir = true;
            } else if (input.equals("")) {
                espacioSeleccionado(scanner, estacionamiento);
            } else if (input.equals("+")) {
                mostrarMenuSesion(scanner, estacionamiento);
            } else if (input.length() == 1) {
                moveCursor(input.charAt(0));
            }
        }
    }
}
