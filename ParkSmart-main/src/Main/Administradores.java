package Main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Modelo.Estacionamiento;

public class Administradores {
    private static final List<Administrador> usuarios;

    static {
        usuarios = new ArrayList<>();
        usuarios.add(new Administrador("Juan123", "JuanPerez123", "12345678"));
        usuarios.add(new Administrador("Luis", "LuisBrenis123", "45678912"));
        usuarios.add(new Administrador("Pedro", "PedroGarcia123", "12367845"));
        usuarios.add(new Administrador("admin", "123", "12367845"));
    }

    static void registrar_usuario() {
        Menu.limpiar_consola();
        Menu.printTitle();
        String nombre, contra;
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Ingrese su nombre de usuario (maximo 15 caracteres): ");
            nombre = scanner.nextLine().trim();
            System.out.println("Ingrese su contraseña (maximo 18 caracteres): ");
            contra = scanner.nextLine().trim();

            if (nombre.length() > 15 || contra.length() > 18) {
                System.out.println("Error: La contraseña debe tener menos de 18 caracteres y el nombre debe tener menos de 15 caracteres");
                System.out.println("Presione cualquier tecla para continuar.....");
                scanner.nextLine();
                Menu.limpiar_consola();
                Menu.printTitle();
            }
        } while (nombre.length() > 15 || contra.length() > 18);

        agregar_usuario(nombre, contra);
        mostrar_ID(nombre, contra);
    }

    private static void agregar_usuario(String nom, String contr) {
        usuarios.add(new Administrador(nom, contr));
    }

    static void iniciar_sesion(Scanner scanner, Estacionamiento estacionamiento) {
        Menu.limpiar_consola();
        Menu.printTitle();
        String nombre, contra;

        System.out.println("Ingrese su nombre de usuario: ");
        nombre = scanner.nextLine().trim();
        System.out.println("Ingrese su contrasena: ");
        contra = scanner.nextLine().trim();

        Administrador usuarioActual = null;
        boolean autenticado = false;

        for (Administrador usu : usuarios) {
            if (usu.getNom_Usuario().equals(nombre) && usu.getContr_Usuario().equals(contra)) {
                System.out.println("Bienvenido " + usu.getNom_Usuario());
                autenticado = true;
                usuarioActual = usu;
                break;
            }
        }

        if (!autenticado) {
            System.out.println("Error: Nombre o contraseña incorrectos");
            scanner.nextLine();
        } else {
            PerfilUsuario perfil = new PerfilUsuario(usuarioActual.getNom_Usuario(), usuarioActual.getContr_Usuario());
            mostrarMenuEstacionamiento(scanner, estacionamiento,perfil, usuarioActual);
        }
       
        
    }

    private static void mostrarMenuEstacionamiento(Scanner scanner, Estacionamiento estacionamiento, PerfilUsuario perfil, Administrador usuarioActual) {
        boolean continuar = true;
        while (continuar) {
            Menu.limpiar_consola();
            Menu.printTitle();
            System.out.println("1. Mostrar vehiculos en el estacionamiento");
            System.out.println("2. Seleccionar vehiculo para salir");
            System.out.println("3. Ver espacios disponibles");
            System.out.println("4. Modificar informacion de usuario");
            System.out.println("5. Registrar vehiculo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Menu.limpiar_consola();
                    estacionamiento.mostrarVehiculos();
                    break;
                case 2:
                    Menu.limpiar_consola();
                    estacionamiento.seleccionarVehiculoParaSalir(scanner);
                    break;
                case 3:
                    Menu.limpiar_consola();
                    Interfaz.interfaz_est(scanner, estacionamiento,false);
                    break;
                case 4:
                    Menu.limpiar_consola();
                    perfil.eligirNuevosDatos(usuarioActual, scanner);
                    System.out.println("Información modificada.");
                    break;
                case 5:
                    Menu.limpiar_consola();
                    Interfaz.interfaz_est(scanner, estacionamiento,true);
                    break;
                case 0:
                    Menu.limpiar_consola();
                    continuar = false;
                    System.out.println("Sesion finalizada.");
                    break;
                default:
                    Menu.limpiar_consola();
                    System.out.println("Opcion no válida.");
            }

            if (opcion != 0) {
                System.out.println("Presione cualquier tecla para continuar...");
                scanner.nextLine();
            }
        }
    }

    private static void mostrar_ID(String nom, String contr) {
        for (Administrador usuario : usuarios) {
            if (nom.equals(usuario.getNom_Usuario()) && contr.equals(usuario.getContr_Usuario())) {
                System.out.println("El ID del usuario es: " + usuario.getId_usuario());
                break;
            }
        }
    }
    
}
