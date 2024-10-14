package Main;

import java.util.Scanner;

public class InicioSesion {

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
        System.out.println("| |_) / _` | '__| |/\\___ \\| '_ ` _ \\ / _` | '__| __|");
        System.out.println("|  __/ (_| | |  |   <  ___) | | | | | | (_| | |  | |_ ");
        System.out.println("|_|   \\__,_|_|  |_|\\_\\|____/|_| |_| |_|\\__,_|_|   \\__|");
        System.out.println("\n\n\n");
    }
    public static void iniciarSesion() {
        limpiar_consola();
        printTitle();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario:");
        String username = scanner.nextLine();
        System.out.println("Ingrese su contraseña:");
        String password = scanner.nextLine();

        // Crear una instancia de LoginLogica para verificar las credenciales
        LoginLogica loginLogica = new LoginLogica();
        String categoria = loginLogica.logearUsuarioYObtenerCategoria(username, password);

        // Si la categoría es válida, mostrar el menú correspondiente
        if (categoria != null) {
            if (categoria.equalsIgnoreCase("Administrador")) {
                System.out.println("Bienvenido, Administrador.");
                MenuAdministrador.mostrarMenuAdministrador(); // Aquí invocamos el menú administrador
            } else if (categoria.equalsIgnoreCase("Observador") || categoria.equalsIgnoreCase("Coordinador")) {
                System.out.println("Bienvenido, " + categoria + ".");
                MenuEmpleado.mostrarMenuEmpleado(); // Invocar el menú para empleados
            }
        } else {
            System.out.println("Usuario o contraseña incorrectos. Inténtelo de nuevo.");
        }

        scanner.close();
    }
}