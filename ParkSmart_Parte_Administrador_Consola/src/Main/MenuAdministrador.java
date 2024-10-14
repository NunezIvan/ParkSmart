package Main;

import java.util.List;
import java.util.Scanner;

public class MenuAdministrador {

    // Método para limpiar la consola (dependiendo del sistema operativo)
    public static void limpiar_consola() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                for (int i = 0; i < 20; i++) {
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

    // Método que imprime el título del programa
    public static void printTitle() {
        System.out.println(" ____            _     ____                       _   ");
        System.out.println("|  _ \\ __ _ _ __| | __/ ___| _ __ ___   __ _ _ __| |_ ");
        System.out.println("| |_) / _` | '__| |/\\___ \\| '_ ` _ \\ / _` | '__| __|");
        System.out.println("|  __/ (_| | |  |   <  ___) | | | | | | (_| | |  | |_ ");
        System.out.println("|_|   \\__,_|_|  |_|\\_\\|____/|_| |_| |_|\\__,_|_|   \\__|");
        System.out.println("\n\n\n");
    }

    // Menú de administrador
    public static void mostrarMenuAdministrador() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
       
         Estacionamiento estacionamiento = new Estacionamiento(5, 6, 5, 5.0);
         int piso = 1; 
        while (!salir) {
            limpiar_consola();
            printTitle();
            System.out.println("Menú de Administrador");
            System.out.println("1. Ver estacionamiento");
            System.out.println("2. Control de empleados");
            System.out.println("3. Registrar pago");
            System.out.println("4. Modificar tarifas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    Interfaz_Estacionamiento.interfaz_est(scanner, estacionamiento, piso);
                    break;
                case "2":
                    mostrarMenuEmpleados(); 
                    break;
                case "3":
                    registrarPago();
                    break;
                case "4":
                    modificarTarifas();
                    break;
                case "5":
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
        scanner.close();
    }

    // Opción 1: Ver estacionamiento (puedes implementar la lógica para mostrar el estado del estacionamiento)
    public static void verEstacionamiento() {
        System.out.println("Mostrando el estado del estacionamiento...");
        // Implementa la lógica aquí
    }

    // Opción 2: Control de empleados (CRUD)
    public static void mostrarMenuEmpleados() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            limpiar_consola();
            System.out.println("Control de Empleados");
            System.out.println("1. Ver empleados");
            System.out.println("2. Agregar empleado");
            System.out.println("3. Actualizar empleado");
            System.out.println("4. Eliminar empleado");
            System.out.println("5. Regresar al menú anterior");
            System.out.print("Seleccione una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    verEmpleados(); 
                    break;
                case "2":
                    agregarEmpleado(); 
                    break;
                case "3":
                    actualizarEmpleado(); 
                    break;
                case "4":
                    eliminarEmpleado(); 
                    break;
                case "5":
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

    // Método para ver empleados
    public static void verEmpleados() {
        List<Empleado> empleados = Empleado.leerEmpleados();
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Lista de empleados:");
            for (Empleado empleado : empleados) {
                System.out.println(empleado.toString());
            }
        }
        esperarEntrada();
    }

    // Método para agregar empleados
   public static void agregarEmpleado() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el nombre: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese el apellido: ");
    String apellido = scanner.nextLine();

    String categoria = "";
    boolean categoriaValida = false;
    while (!categoriaValida) {
        System.out.print("Ingrese la categoría (Administrador/Observador/Coordinador): ");
        categoria = scanner.nextLine();
        if (categoria.equalsIgnoreCase("Administrador") || 
            categoria.equalsIgnoreCase("Observador") || 
            categoria.equalsIgnoreCase("Coordinador")) {
            categoriaValida = true;
        } else {
            System.out.println("Categoría inválida. Intente nuevamente.");
        }
    }

    Empleado nuevoEmpleado = new Empleado(apellido, nombre, categoria);
    Empleado.agregarEmpleado(nuevoEmpleado);
    System.out.println("Empleado agregado exitosamente.");
    esperarEntrada();
}

 
    public static void actualizarEmpleado() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del empleado a actualizar: ");
        String id = scanner.nextLine();

        System.out.print("Ingrese el nuevo nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el nuevo apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese la nueva categoría: ");
        String categoria = scanner.nextLine();

        Empleado nuevoEmpleado = new Empleado(apellido, nombre, categoria);
        Empleado.actualizarEmpleado(id, nuevoEmpleado);
        System.out.println("Empleado actualizado exitosamente.");
        esperarEntrada();
    }

    
    public static void eliminarEmpleado() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del empleado a eliminar: ");
        String id = scanner.nextLine();

        Empleado.eliminarEmpleado(id);
        System.out.println("Empleado eliminado exitosamente.");
        esperarEntrada();
    }

    
    public static void registrarPago() {
        System.out.println("Registrando pago...");
       
        esperarEntrada();
    }

    // Opción 4: Modificar tarifas (puedes implementar la lógica para modificar las tarifas)
    public static void modificarTarifas() {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("La tarifa actual es: $" + Tarifa.getTarifa());

        
        System.out.print("Ingrese la nueva tarifa: ");
        double nuevaTarifa;
        try {
            nuevaTarifa = Double.parseDouble(scanner.nextLine());
            if (nuevaTarifa <= 0) {
                System.out.println("La tarifa debe ser un valor positivo. Intente nuevamente.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
            return;
        }

       
        Tarifa.setTarifa(nuevaTarifa);
        System.out.println("La tarifa ha sido actualizada exitosamente a: $" + Tarifa.getTarifa());

        esperarEntrada();
    }

   
    public static void esperarEntrada() {
        System.out.println("\nPresione Enter para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    }