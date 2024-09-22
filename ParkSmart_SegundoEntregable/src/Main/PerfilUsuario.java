//CLASE ELIMINADA EN UN FUTURO, EXCLUSIVA PARA LA EJECUCION EN CONSOLA

package Main;
import java.util.Scanner;

public class PerfilUsuario {
    private String nombreUsuario;
    private String contrasena;

    public PerfilUsuario(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public void mostrarDatosPerfil() {
        System.out.println("Nombre de Usuario: " + nombreUsuario);
        System.out.println("Contrasena Usuario: " + contrasena);
    }
    
    public void elegirNuevaContrasena(Administrador usuarioActual, Scanner scanner) {
        System.out.println("Ingrese la nueva contraseña: ");
        String nuevaContrasena = scanner.nextLine();
        usuarioActual.setContr_Usuario(nuevaContrasena);
        System.out.println("Contraseña actualizada.");
    }

    public void elegirNuevoNombreUsuario(Administrador usuarioActual, Scanner scanner) {
        System.out.println("Ingrese el nuevo nombre de usuario: ");
        String nuevoNombre = scanner.nextLine();
        usuarioActual.setNom_Usuario(nuevoNombre);
        System.out.println("Nombre de usuario actualizado.");
    }
    
    //Cambio de usuario o contraseña
    public void eligirNuevosDatos(Administrador usuarioActual, Scanner scanner) {
        mostrarDatosPerfil();
        System.out.println("¿Qué desea actualizar?");
        System.out.println("1. Nombre de Usuario");
        System.out.println("2. Contraseña");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                elegirNuevoNombreUsuario(usuarioActual, scanner);
                break;
            case 2:
                elegirNuevaContrasena(usuarioActual, scanner);
                break;
            default:
                System.out.println("Opcion no valida.");
        }
    }
}
