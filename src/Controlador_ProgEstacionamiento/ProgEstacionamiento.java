package Controlador_ProgEstacionamiento;

import Modelo_Estacionamiento.Estacionamientos;
import Modelo_Estacionamiento.Vehiculo;
import Vista_Estacionamiento.VentanaEstacionamiento;

/**
 *
 * @author andrey
 */
public class ProgEstacionamiento {
    private Estacionamientos modelo;
    private VentanaEstacionamiento vista;

    public ProgEstacionamiento(Estacionamientos modelo, VentanaEstacionamiento vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            int opcion = vista.mostrarMenu();
            
            switch (opcion) {
                case 1 -> gestionarEntradaVehiculo();
                case 2 -> gestionarSalidaVehiculo();
                case 3 -> actualizarVista();
                case 0 -> salir = true;
                default -> vista.mostrarMensaje("Opcion no válida. Intente de nuevo.");
            }
        }
    }

    private void gestionarEntradaVehiculo() {
        vista.limpiarConsola();
        
        if (modelo.verificarDisponibilidad()) {
            Vehiculo vehiculo = vista.pedirDatosVehiculo();
            
            if (modelo.agregarVehiculo(vehiculo)) {
                vista.mostrarMensaje("\nVehiculo registrado exitosamente.");
            } else {
                vista.mostrarMensaje("\nNo se pudo registrar el vehiculo. El estacionamiento está lleno.");
            }
        } else {
            vista.mostrarMensaje("\nNo hay espacio disponible en el estacionamiento.");
        }
        
        vista.pausa();
    }

    private void gestionarSalidaVehiculo() {
        vista.mostrarEstadoEstacionamiento(modelo.getListaVehiculos(), modelo.getCapacidadTotal() - modelo.getListaVehiculos().size());
        
        String matricula = vista.pedirMatriculaVehiculo();
        
        vista.mostrarMensaje("\nPrecio total a pagar: " + modelo.calcularPrecio(matricula) + " soles.");
        
        if (modelo.removerVehiculo(matricula)) {
            vista.mostrarMensaje("\nVehiculo retirado exitosamente.");
            vista.pausa();
        } else {
            vista.mostrarMensaje("\nNo se encontro un vehiculo con esa matricula.");
            vista.pausa();
        }
    }

    private void actualizarVista() {
        vista.mostrarEstadoEstacionamiento(modelo.getListaVehiculos(), modelo.getCapacidadTotal() - modelo.getListaVehiculos().size());
        vista.pausa();
    }

    public static void main(String[] args) {
        Estacionamientos modelo = new Estacionamientos(2, 5.0);
        VentanaEstacionamiento vista = new VentanaEstacionamiento();
        ProgEstacionamiento controlador = new ProgEstacionamiento(modelo, vista);
        controlador.iniciar();
    }
}
