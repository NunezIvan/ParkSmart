package Vehiculo;

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
    }

    public boolean agregarVehiculo(Vehiculo vehiculo, int fila, int columna) {
        if (espacios[fila][columna] == null) {
            listaVehiculos.add(vehiculo);
            espacios[fila][columna] = vehiculo.getMatricula();
            return true;
        }
        return false;
    }

    public Vehiculo buscarVehiculoPorMatricula(String matricula) {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getMatricula().equalsIgnoreCase(matricula)) {
                return vehiculo;
            }
        }
        return null;
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

    public void mostrarEstado() {
        System.out.println("Estado del Estacionamiento:");
        for (int i = 0; i < espacios.length; i++) {
            for (int j = 0; j < espacios[i].length; j++) {
                if (espacios[i][j] == null) {
                    System.out.print("[Libre] ");
                } else {
                    System.out.print("[Ocupa] ");
                }
            }
            System.out.println();
        }
        System.out.println("Total de espacios disponibles: " + (capacidadTotal - listaVehiculos.size()));
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
