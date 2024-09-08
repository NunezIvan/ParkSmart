import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class usuarios {
    private static final List<usuario> usuarios;

    static {
        usuarios = new ArrayList<>();
        usuarios.add(new usuario("Juan123", "JuanPerez123","12345678"));
        usuarios.add(new usuario("Luis", "LuisBrenis123","45678912"));
        usuarios.add(new usuario("Pedro", "PedroGarcia123","12367845"));
    }

    static void registrar_usuario() {
        Menu.limpiar_consola();
        Menu.printTitle();
        String nombre, contra;
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Ingrese su nombre de usuario: ");
            nombre = scanner.nextLine().trim(); // Usamos trim() para eliminar espacios en blanco
            System.out.println("Ingrese su contraseña: ");
            contra = scanner.nextLine().trim();

            if (nombre.length() > 15 || contra.length() > 18) { // Cambié && a ||
                System.out.println("Error: La contraseña debe tener menos de 18 caracteres y el nombre debe tener menos de 15 caracteres");
                System.out.println("Presione cualquier tecla para continuar.....");
                scanner.nextLine();
                Menu.limpiar_consola();
                Menu.printTitle();
            }
        } while (nombre.length() > 15 || contra.length() > 18); // Cambié && a ||

        agregar_usuario(nombre, contra);
        mostrar_ID(nombre, contra);
        scanner.nextLine();
    }

    private static void agregar_usuario(String nom, String contr) {
        usuarios.add(new usuario(nom, contr));
    }

    private static void mostrar_ID(String nom, String contr) {
        for (var usuario : usuarios) {
            if (nom.equals(usuario.getNom_Usuario()) && contr.equals(usuario.getContr_Usuario())) {
                System.out.println("El ID del usuario es: " + usuario.getId_usuario());
                break; // Termina el bucle una vez encontrado el usuario
            }
        }
    }
}
