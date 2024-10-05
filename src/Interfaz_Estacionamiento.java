import java.util.Random;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Interfaz_Estacionamiento {
        private static final Random random = new Random();
    static final int filas = 5;
    static final int columnas = 6;
    static final int pisos = 5;
    static int fila_reciente = 0;
    static int columna_reciente = 0;
    static int piso_reciente = 1;

    public static void dibujarCuadro(Estacionamiento estacionamiento,int piso) {
        Menu_Usuario.limpiar_consola();
        Menu_Usuario.printTitle();
        System.out.println("PISO: "+ piso);
        for (int row = 0; row < filas; row++) {
            for (int col = 0; col < columnas; col++) {
                System.out.print("  --- ");
            }
            System.out.println();
            for (int col = 0; col < columnas; col++) {
                if (row == fila_reciente && col == columna_reciente) {
                    System.out.print("|  X  ");
                } else if (estacionamiento.espacioOcupado(row+1,col+1,piso)) {
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
            case 'q':
                if(piso_reciente==1){
                    System.out.println("No se puede retroceder al piso 0");
                }
                else{
                    piso_reciente++;
                }
                break;
            case 'e':
                if(piso_reciente==pisos){
                    System.out.println("No se puede avanzar al piso 6 ");
                }
                else{
                    piso_reciente--;
                }
        }
    }

    public static String leerMatricula() {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder matricula = new StringBuilder();
        matricula.append(letras.charAt(random.nextInt(letras.length())));
        matricula.append(random.nextInt(10));
        matricula.append(letras.charAt(random.nextInt(letras.length())));
        matricula.append("-");
        for (int i = 0; i < 3; i++) {
            matricula.append(random.nextInt(10));
        }
        return matricula.toString();
    }

    public static void espacioSeleccionado(Scanner scanner, Estacionamiento estacionamiento,int piso) {
        if(!estacionamiento.espacioOcupado(fila_reciente+1, columna_reciente+1, piso)){
            char tipo;
            String nombre,apellido,propietario;
            do {
                Menu_Usuario.limpiar_consola();
                System.out.print("Ingrese el tipo de vehiculo (C para coche, M para moto): ");
                String input = scanner.nextLine();
                            
                if (!input.isEmpty()) {
                    tipo = Character.toLowerCase(input.charAt(0));
                } else {
                    tipo = ' ';
                }
            } while (tipo != 'c' && tipo != 'm');

            System.out.println("Ingrese su nombre: ");
            nombre = scanner.nextLine();
            System.out.println("Ingrese su apellido: ");
            apellido = scanner.nextLine();
            propietario=nombre+"_"+apellido;
 
            String matricula = leerMatricula();
    
            Vehiculo vehiculo = new Vehiculo(matricula,propietario,tipo,piso,columna_reciente+1,fila_reciente+1,LocalDateTime.now(),null,'R');
            estacionamiento.agregarVehiculo(vehiculo);
            
            if (estacionamiento.espacioOcupado(fila_reciente+1,columna_reciente+1,piso)) {
                System.out.println("Vehiculo registrado exitosamente en el espacio " + (char)('A' + fila_reciente) + (columna_reciente + 1));
                scanner.nextLine();
            }
        }else{
            System.out.println("El espacio seleccionado ya esta ocupado");
            scanner.nextLine();
        }
    }

    public static void interfaz_est(Scanner scanner, Estacionamiento estacionamiento, int piso) {
        boolean salir = false;
        while(!salir){
            dibujarCuadro(estacionamiento,piso);
            System.out.print("Use WASD para moverse,Enter para reservar el lugar,'q' para disminuir de piso,'e' para aumentar de piso y 'x' para salir: ");
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("x")) {
                salir = true;
            }else if(input.equals("q")){
                if (piso > 1) {
                    piso--;
                } else {
                    System.out.println("No se puede retroceder al piso 0");
                }
            }else if (input.equals("e")) {
                if (piso < 5) {
                    piso++;
                } else {
                    System.out.println("No se puede avanzar al piso 6");
                }
            }else if(input.length() == 1){
                moveCursor(input.charAt(0));
            }else if(input.equals("")){
                espacioSeleccionado(scanner, estacionamiento,piso);
            }
        }
    }
}
