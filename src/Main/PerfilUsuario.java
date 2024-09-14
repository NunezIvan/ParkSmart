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

    public void elegirNuevaContrasena(usuario usuarioActual) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elegir una nueva contrasena:");
        String nuevaContrasena = scanner.nextLine();
        usuarioActual.setContr_Usuario(nuevaContrasena); 
        System.out.println("Contrasena actualizada.");
    }

    public void elegirNuevoPerfil(usuario usuarioActual) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elegir nuevo nombre de usuario:");
        String nuevoNombre = scanner.nextLine();
        usuarioActual.setNom_Usuario(nuevoNombre); 
        System.out.println("Nombre de usuario actualizado.");
    }

    public void eligirNuevosDatos(usuario usuarioActual) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        mostrarDatosPerfil();
        System.out.println("Que desea actualizar");
        System.out.println("1.- Nombre de Usuario");
        System.out.println("2.- Contrasena");
        opcion = scanner.nextInt();
        scanner.nextLine();
        switch(opcion) {
            case 1:
                elegirNuevoPerfil(usuarioActual);
                break;
            case 2:
                elegirNuevaContrasena(usuarioActual);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}