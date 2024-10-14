package Modelo;

import java.time.LocalDateTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Vehiculo {
    private String matricula;
    private char tipo;
    private int fila;
    private int columna;
    private LocalDateTime horaEntrada, horaSalida;
    
    //Formato estandar de fecha y hora
    private static final DateTimeFormatter FORMATO_FECHA_HORA = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    private static final Random random = new Random();

    public Vehiculo(String matricula, char tipo, int fila, int columna, LocalDateTime horaEntrada, LocalDateTime horaSalida) {
        this.matricula = matricula;
        this.tipo = tipo;
        this.fila = fila;
        this.columna = columna;
        this.horaEntrada = horaEntrada; 
        this.horaSalida = horaSalida;
    }
    
    //Simulación de escanear matricula
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
    
    public void registrarEntrada() {
        horaEntrada = LocalDateTime.now();
    }
    
    //Para realizar el ejemplo, en escenarios reales es this.horaSalida = LocalDateTime.now()
    public void registrarSalida() {
        this.horaSalida = LocalDateTime.now();
    }
    
    public void asignarEspacio(int f,int c) {
        fila = f;
        columna = c;
    }
    
    public void asignarTipoVehiculo(char t) {
        tipo = t;
    }
    
    //Es una hora más por como funcionan los estacionamientos
    public double calcularTiempoEstadia() {
        if (horaSalida != null) {
            Duration duracion = Duration.between(horaEntrada, horaSalida);
            return duracion.toHours() + 1;
        }
        return 0;
    }
    
    //Se agrega el formato creado anteriormente a la hora de entrada
    public String getHoraEntradaFormateada() {
        return horaEntrada.format(FORMATO_FECHA_HORA);
    }

    public String getMatricula() {
        return matricula;
    }

    public char getTipo() {
        return tipo;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }
    
    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    @Override
    public String toString() {
        return "\n" + matricula + ";" + tipo + ";" + fila + ";" + columna + ";" + horaEntrada + ";" + horaSalida;
    }
}
