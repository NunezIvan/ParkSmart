package Vehiculo;


import java.util.ArrayList;
import java.util.List;

public class Estacionamiento {
    private List<Vehiculo> listaVehiculos;
    private int capacidadTotal;
    private double tarifaPorHora;

    public Estacionamiento (int capacidadTotal, double tarifaPorHora) {
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

    private Vehiculo buscarVehiculo(String matricula, String sitio) {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                return vehiculo;
            }
        }
        return null;
    }

    public boolean removerVehiculo(String matricula, String sitio) {
        Vehiculo vehiculo = buscarVehiculo(matricula,sitio);
        if (vehiculo != null) {
            vehiculo.registrarSalida();
            listaVehiculos.remove(vehiculo);
            return true;
        }
        return false;
    }

    public double calcularPrecio(String matricula,String sitio) {
        Vehiculo vehiculo = buscarVehiculo(matricula,sitio);
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
        //Modificar este
        return listaVehiculos.size() < capacidadTotal;
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
