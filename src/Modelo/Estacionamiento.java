package Modelo;

import ManejoArchivos.Archivo;
import Main.Menu;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Estacionamiento {
    private String[][] espacios;
    private int capacidadTotal;
    private double tarifaPorHora;
    
    private Archivo archivo;
    private String nombreRecurso = "C:\\Users\\andre\\OneDrive\\Documentos\\NetBeansProjects\\Algoritmica II\\Gestor_Estacionamiento\\ParkSmart-Parte_Usuario_Interfaz\\vehiculos.txt";


    public Estacionamiento(int filas, int columnas, double tarifaPorHora) {
        this.capacidadTotal = filas * columnas;
        this.tarifaPorHora = tarifaPorHora;
        this.espacios = new String[filas][columnas];
        this.archivo = new Archivo();
        
        cargarVehiculosDesdeArchivo();
    }

    // Cargar los vehículos del archivo y colocarlos en los espacios correspondientes
    private void cargarVehiculosDesdeArchivo() {
        if (archivo.comprobarExistencia(nombreRecurso)) {
            List<Vehiculo> vehiculos = archivo.listar(nombreRecurso);
            for (Vehiculo vehiculo : vehiculos) {
                espacios[vehiculo.getFila()][vehiculo.getColumna()] = vehiculo.getMatricula();
            }
        }
    }

    public boolean agregarVehiculo(Vehiculo vehiculo, int fila, int columna) {
        if (espacios[fila][columna] == null) {
            espacios[fila][columna] = vehiculo.getMatricula();
            archivo.escribir(vehiculo, nombreRecurso, true); // Guardar en el archivo
            return true;
        }
        return false;
    }

    public Vehiculo buscarVehiculoPorMatricula(String matricula) {
        return archivo.buscarPorMatricula(matricula, nombreRecurso);
    }

    public void buscarVehiculoporSitio(int fila, int columna) {
        Vehiculo vehiculo = archivo.buscarPorMatricula(espacios[fila][columna], nombreRecurso);
        if (vehiculo != null) {
            System.out.println("Matricula: " + vehiculo.getMatricula() +
                    ", Tipo: " + vehiculo.getTipo() +
                    ", Sitio: " + (char) ('A' + vehiculo.getFila()) + (vehiculo.getColumna() + 1) +
                    ", Hora de Entrada: " + vehiculo.getHoraEntradaFormateada());
        } else {
            System.out.println("No se encontró un vehículo en el sitio " + (char) ('A' + fila) + (columna + 1));
        }
    }

    public boolean removerVehiculo(String matricula) {
        Vehiculo vehiculo = buscarVehiculoPorMatricula(matricula);
        if (vehiculo != null) {
            int fila = vehiculo.getFila();
            int columna = vehiculo.getColumna();
            espacios[fila][columna] = null;
            // Actualizar archivo quitando el vehículo
            actualizarArchivo(matricula);
            return true;
        }
        return false;
    }

    // Actualizar el archivo removiendo el vehículo con la matrícula especificada
    private void actualizarArchivo(String matricula) {
        List<Vehiculo> vehiculos = archivo.listar(nombreRecurso);
        vehiculos.removeIf(v -> v.getMatricula().equalsIgnoreCase(matricula));
        archivo.crearArchivo(nombreRecurso); // Vaciar el archivo y reescribir los vehículos restantes
        for (Vehiculo vehiculo : vehiculos) {
            archivo.escribir(vehiculo, nombreRecurso, true);
        }
    }

    public double calcularPrecio(String matricula) {
        Vehiculo vehiculo = buscarVehiculoPorMatricula(matricula);
        if (vehiculo != null) {
            vehiculo.registrarSalida();
            return vehiculo.calcularTiempoEstadia() * tarifaPorHora;
        }
        return 0;
    }

    public boolean verificarDisponibilidad() {
        int ocupados = 0;
        for (int i = 0; i < espacios.length; i++) {
            for (int j = 0; j < espacios[i].length; j++) {
                if (espacios[i][j] != null) {
                    ocupados++;
                }
            }
        }
        return ocupados < capacidadTotal;
    }

    // Método que verifica si un espacio específico está ocupado
    public boolean espacioOcupado(int fila, int columna) {
        return espacios[fila][columna] != null;
    }

    // Lista detallada de los vehículos en el estacionamiento
    public void mostrarVehiculos() {
        List<Vehiculo> vehiculos = archivo.listar(nombreRecurso);
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehiculos en el estacionamiento.");
        } else {
            System.out.println("Vehiculos en el estacionamiento:");
            for (Vehiculo vehiculo : vehiculos) {
                String tipoS;
                switch (vehiculo.getTipo()) {
                    case 'c': {
                        tipoS = "Carro";
                        break;
                    }
                    case 'm': {
                        tipoS = "Moto";
                        break;
                    }
                    default: {
                        tipoS = "No definido";
                        break;
                    }
                }
                System.out.println("Matricula: " + vehiculo.getMatricula() +
                        ", Tipo: " + tipoS +
                        ", Sitio: " + (char) ('A' + vehiculo.getFila()) + (vehiculo.getColumna() + 1) +
                        ", Hora de Entrada: " + vehiculo.getHoraEntradaFormateada());
            }
        }
    }

    public void seleccionarVehiculoParaSalir(Scanner scanner) {
        List<Vehiculo> vehiculos = archivo.listar(nombreRecurso);
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehiculos en el estacionamiento.");
            return;
        }

        System.out.println("Vehiculos en el estacionamiento:");
        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo vehiculo = vehiculos.get(i);
            System.out.println((i + 1) + ". Matricula: " + vehiculo.getMatricula() + ", Sitio: " + (char) ('A' + vehiculo.getFila()) + (vehiculo.getColumna() + 1));
        }

        System.out.print("Seleccione el numero del vehiculo que desea retirar: ");
        int seleccion = scanner.nextInt();
        scanner.nextLine();

        if (seleccion > 0 && seleccion <= vehiculos.size()) {
            Vehiculo vehiculoSeleccionado = vehiculos.get(seleccion - 1);
            vehiculoSeleccionado.registrarSalida();
            double precio = calcularPrecio(vehiculoSeleccionado.getMatricula());
            Menu.limpiar_consola();
            System.out.println("El precio a pagar es: " + precio + " soles.");
            removerVehiculo(vehiculoSeleccionado.getMatricula());
            System.out.println("Vehiculo retirado exitosamente.");
        } else {
            System.out.println("Seleccion invalida.");
        }
    }
}
