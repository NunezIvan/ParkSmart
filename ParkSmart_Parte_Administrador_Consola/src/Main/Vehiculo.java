package Main;

import java.time.LocalDateTime;
import java.time.Duration;

public class Vehiculo {
    private String matricula,propietario;
    private char tip_veh,est_sitio;
    private int columna,fila,piso;
    private LocalDateTime horaEntrada, horaSalida;

    public char getEst_sitio() {
        return this.est_sitio;
    }
    
    public String getMatricula() {
        return this.matricula;
    }

    public String getPropietario() {
        return this.propietario;
    }

    public char getTip_veh() {
        return this.tip_veh;
    }

    public int getColumna() {
        return this.columna;
    }

    public int getFila() {
        return this.fila;
    }

    public int getPiso() {
        return this.piso;
    }

    public LocalDateTime getHoraEntrada() {
        return this.horaEntrada;
    }

    public LocalDateTime getHoraSalida() {
        return this.horaSalida;
    }

    public Vehiculo(String matricula, String propietario,char tip_veh,int piso,int columna, int fila, LocalDateTime horaEntrada, LocalDateTime horaSalida,char est_sitio){
        this.matricula = matricula;
        this.propietario = propietario;
        this.tip_veh = tip_veh;
        this.fila = fila;
        this.columna = columna;
        this.piso = piso;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.est_sitio = est_sitio;
    }

    public String toString(){
        String tipo_vehiculo = "";
        if(this.tip_veh == 'c'){
            tipo_vehiculo = "Carro";
        }
        else if(this.tip_veh == 'm'){
            tipo_vehiculo = "Moto";
        }

        return ("...:::DATOS DEL VEHICULO:::...\n" +
                "Matricula: " + this.matricula + "\n" +
                "Propietario: " + this.propietario + "\n" + 
                "Tipo_Vehiculo: " + tipo_vehiculo + "\n" +
                "Piso: " + this.piso + "\n" +
                "Columna: " + this.columna + "\n" + 
                "Fila: " + this.fila + "\n" +
                "Hora_Entrada: " + this.horaEntrada + "\n" +
                "Hora_Salida: " + this.horaSalida);

    }

    public double calcularTiempoEstadia() {
        if (horaSalida != null) {
            Duration duracion = Duration.between(horaEntrada, horaSalida);
            return duracion.toHours() + 1;
        }
        return 0;
    }

    public String escribirVehiculo(){
        return this.matricula + ";" + this.propietario + ";" + this.tip_veh + ";" + this.piso + ";" + this.columna + ";" + this.fila + ";" + this.horaEntrada + ";" + this.horaSalida + ";" + this.est_sitio;
    }

}
