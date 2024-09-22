package Modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Estacionamiento {
    private List<Vehiculo> listaVehiculos;
    private String[][] espacios;
    private int capacidadTotal;
    private double tarifaPorHora;

    public Estacionamiento(int filas, int columnas, double tarifaPorHora) {
        this.capacidadTotal = filas * columnas;
        this.tarifaPorHora = tarifaPorHora;
        this.listaVehiculos = new ArrayList<>();
        this.espacios = new String[filas][columnas];
        agregarporDefecto();
    }

    public boolean agregarVehiculo(Vehiculo vehiculo, int fila, int columna) {
        if (espacios[fila][columna] == null) {
            listaVehiculos.add(vehiculo);
            espacios[fila][columna] = vehiculo.getMatricula();
            return true;
        }
        return false;
    }

    public void agregarporDefecto(){
        Vehiculo vehiculo1 = new Vehiculo("A1B-234", 'c', 0, 1, LocalDateTime.now(), null);
        agregarVehiculo(vehiculo1, 0, 1);
        Vehiculo vehiculo2 = new Vehiculo("A1A-123", 'c', 1, 2, LocalDateTime.now(), null);
        agregarVehiculo(vehiculo2, 1, 2);
        Vehiculo vehiculo3 = new Vehiculo("ZYX-587", 'c', 2, 3, LocalDateTime.now(), null);
        agregarVehiculo(vehiculo3, 2, 3);
        Vehiculo vehiculo4 = new Vehiculo("AEA-144", 'm', 4, 1, LocalDateTime.now(), null);
        agregarVehiculo(vehiculo4, 4, 1);
        Vehiculo vehiculo5 = new Vehiculo("JAA-322", 'm', 0, 3, LocalDateTime.now(), null);
        agregarVehiculo(vehiculo5, 0, 3);
    }

    public Vehiculo buscarVehiculoPorMatricula(String matricula) {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getMatricula().equalsIgnoreCase(matricula)) {
                return vehiculo;
            }
        }
        return null;
    }

    public void buscarVehiculoporSitio(int fila, int columna){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getFila() == fila && vehiculo.getColumna() == columna) {
                System.out.println("Matricula: " + vehiculo.getMatricula() +
                        ", Tipo: " + vehiculo.getTipo() +
                        ", Sitio: " + (char) ('A' + vehiculo.getFila()) + (vehiculo.getColumna() + 1) +
                        ", Hora de Entrada: " + vehiculo.getHoraEntradaFormateada());
                scanner.nextLine();
                return;
            }
        }
        System.out.println("No se encontró un vehículo en el sitio " + (char) ('A' + fila) + (columna + 1)); 
        scanner.nextLine();
    }

    public boolean removerVehiculo(String matricula) {
        Vehiculo vehiculo = buscarVehiculoPorMatricula(matricula);
        if (vehiculo != null) {
            int fila = vehiculo.getFila();
            int columna = vehiculo.getColumna();
            listaVehiculos.remove(vehiculo);
            espacios[fila][columna] = null;
            return true;
        }
        return false;
    }

    public double calcularPrecio(String matricula) {
        Vehiculo vehiculo = buscarVehiculoPorMatricula(matricula);
        if (vehiculo != null) {
            return vehiculo.calcularTiempoEstadia() * tarifaPorHora;
        }
        return 0;
    }

    public boolean verificarDisponibilidad() {
        return listaVehiculos.size() < capacidadTotal;
    }

    public void mostrarVehiculos() {
        if (listaVehiculos.isEmpty()) {
            System.out.println("No hay vehiculos en el estacionamiento.");
        } else {
            System.out.println("Vehiculos en el estacionamiento:");
            for (Vehiculo vehiculo : listaVehiculos) {
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
                        ", Sitio: " + (char)('A' + vehiculo.getFila()) + (vehiculo.getColumna() + 1)+
                        ", Hora de Entrada: " + vehiculo.getHoraEntradaFormateada());
            }
        }
    }

    public boolean espacioOcupado(int fila, int columna) {
        return espacios[fila][columna] != null;
    }

    public void seleccionarVehiculoParaSalir(Scanner scanner) {
        if (listaVehiculos.isEmpty()) {
            System.out.println("No hay vehiculos en el estacionamiento.");
            return;
        }

        System.out.println("Vehiculos en el estacionamiento:");
        for (int i = 0; i < listaVehiculos.size(); i++) {
            Vehiculo vehiculo = listaVehiculos.get(i);
            System.out.println((i + 1) + ". Matricula: " + vehiculo.getMatricula() + ", Sitio: " + (char)('A' + vehiculo.getFila()) + (vehiculo.getColumna() + 1));
        }

        System.out.print("Seleccione el numero del vehiculo que desea retirar: ");
        int seleccion = scanner.nextInt();
        scanner.nextLine();

        if (seleccion > 0 && seleccion <= listaVehiculos.size()) {
            Vehiculo vehiculoSeleccionado = listaVehiculos.get(seleccion - 1);
            vehiculoSeleccionado.registrarSalida();
            double precio = calcularPrecio(vehiculoSeleccionado.getMatricula());
            System.out.println("El precio a pagar es: " + precio + " soles.");
            removerVehiculo(vehiculoSeleccionado.getMatricula());
            System.out.println("Vehiculo retirado exitosamente.");
        } else {
            System.out.println("Seleccion invalida.");
        }
    }
}
