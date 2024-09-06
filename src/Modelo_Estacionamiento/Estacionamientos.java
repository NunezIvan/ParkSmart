package Modelo_Estacionamiento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andrey
 */
public class Estacionamientos {
    private List<Vehiculo> listaVehiculos;
    private int capacidadTotal;
    private double tarifaPorHora;

    public Estacionamientos (int capacidadTotal, double tarifaPorHora) {
        this.capacidadTotal = capacidadTotal;
        this.tarifaPorHora = tarifaPorHora;
        this.listaVehiculos = new ArrayList<>();
    }

    public boolean agregarVehiculo(Vehiculo vehiculo) {
        if (listaVehiculos.size() < capacidadTotal) {
            listaVehiculos.add(vehiculo);
            return true;
        }
        
        return false;
    }

    public boolean removerVehiculo(String matricula) {
        Vehiculo vehiculo = buscarVehiculo(matricula);
        
        if (vehiculo != null) {
            vehiculo.registrarSalida();
            listaVehiculos.remove(vehiculo);
            
            return true;
        }
        
        return false;
    }

    public double calcularPrecio(String matricula) {
        Vehiculo vehiculo = buscarVehiculo(matricula);
        double precio;
        
        if (vehiculo != null) {
            vehiculo.registrarSalida();
            precio = vehiculo.calcularTiempoEstadia() * tarifaPorHora;
            return precio;
        } else {
            return 0;
        }
    }

    public boolean verificarDisponibilidad() {
        return listaVehiculos.size() < capacidadTotal;
    }

    private Vehiculo buscarVehiculo(String matricula) {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                return vehiculo;
            }
        }
        return null;
    }
    
    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public int getCapacidadTotal() {
        return capacidadTotal;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }
}
