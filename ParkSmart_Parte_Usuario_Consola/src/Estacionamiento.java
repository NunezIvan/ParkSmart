import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Estacionamiento {
    private final String NOMBRE_ARCHIVO = "Estacionamiento.txt";
    private List<Vehiculo> listaVehiculos;
    private int capacidadTotal;
    private double tarifaPorHora;

    public Estacionamiento(int filas,int columnas, int pisos, double tarifaPorHora){
        this.capacidadTotal = filas * columnas;
        this.tarifaPorHora = tarifaPorHora;
        this.listaVehiculos = new ArrayList<>();

        //Archivos
        var archivo = new File(NOMBRE_ARCHIVO);
        var existe = false;
        try{
            existe = archivo.exists();
            if(existe){
                this.listaVehiculos = obtenerVehiculos();
            }
            else{
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Se ha creado el archivo");
            }
        }catch(Exception e){
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
        if(!existe){
            cargarVehiculosIniciales();
        }
    }

    private List<Vehiculo> obtenerVehiculos() {
        var listavehiculos = new ArrayList<Vehiculo>();
        try {
            List<String> lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));
            for (String linea : lineas) {
                String[] lineasVehiculo = linea.split(";"); // parseo
                var matricula = lineasVehiculo[0];
                var propietario = lineasVehiculo[1];
                var tip_veh = lineasVehiculo[2].charAt(0);
                var piso = Integer.parseInt(lineasVehiculo[3]);
                var columna = Integer.parseInt(lineasVehiculo[4]);
                var fila = Integer.parseInt(lineasVehiculo[5]);
                var horaEntrada = LocalDateTime.parse(lineasVehiculo[6]);
                var horaSalida = lineasVehiculo[7].equals("null") ? null : LocalDateTime.parse(lineasVehiculo[7]);
                var est_sitio = lineasVehiculo[8].charAt(0);
                var vehiculo = new Vehiculo(matricula, propietario, tip_veh, piso, columna, fila, horaEntrada, horaSalida, est_sitio);
                listavehiculos.add(vehiculo);
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo de estacionamiento: " + e.getMessage());
            e.printStackTrace();
        }
        // Debugging: Verificar que se están leyendo los vehículos correctamente
        System.out.println("Vehículos cargados: " + listavehiculos.size());
        for (Vehiculo v : listavehiculos) {
            System.out.println(v);
        }
        return listavehiculos;
    }
    

    public List<Vehiculo> Vehiculos_Piso(int piso) {
        var listavehiculos_piso = new ArrayList<Vehiculo>();
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getPiso() == piso) {
                listavehiculos_piso.add(vehiculo);
            }
        }
        return listavehiculos_piso;
    }

    public boolean espacioOcupado(int fila, int columna,int piso){
        boolean band = false;
        for (Vehiculo vehiculo : listaVehiculos) {
            if(vehiculo.getPiso() == piso && vehiculo.getColumna() == columna && vehiculo.getFila() == fila){
                band = true;
            }
        }
        return band;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        this.listaVehiculos.add(vehiculo);
        this.agregarVehiculoArchivo(vehiculo);
    }

    private void agregarVehiculoArchivo(Vehiculo vehiculo) {
        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);
        try{
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo,anexar));
            salida.println(vehiculo.escribirVehiculo());
            salida.close();//Se escribe la informacion en el archivo
        }catch(Exception e){
            System.out.println("Error al agregar Vehiculo: " + e.getMessage());
        }
    }

    public void mostrarVehiculo(int piso, int columna, int fila) {
        boolean vehiculoEncontrado = false;
        for (Vehiculo vehiculo : this.listaVehiculos) {
            if (vehiculo.getPiso() == piso && vehiculo.getColumna() == columna && vehiculo.getFila() == fila) {
                System.out.println(vehiculo.escribirVehiculo());
                vehiculoEncontrado = true;
                break; 
            }
        }
        if (!vehiculoEncontrado) {
            System.out.println("No hay vehículos en la posición solicitada");
        }
    }

    private void cargarVehiculosIniciales() {
        this.agregarVehiculo(new Vehiculo("A1B-234","Luis_Guevara",'c',1,2,1,LocalDateTime.now(),null,'R'));
        this.agregarVehiculo(new Vehiculo("A1A-123", "Luis_Brenis",'m',2,1,1,LocalDateTime.now(),null,'R'));
    }

}
