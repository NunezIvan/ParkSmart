import java.util.Scanner;
public class Main_Usuario {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Estacionamiento estacionamiento = new Estacionamiento(5, 6, 5, 5.0);
        Menu_Usuario.mostrarMenuUsuario(estacionamiento,1);
        scanner.close();
    }
}
