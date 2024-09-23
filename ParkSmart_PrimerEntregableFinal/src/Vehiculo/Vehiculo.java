package Vehiculo;

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

    private static final DateTimeFormatter FORMATO_FECHA_HORA = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    private static final Random random = new Random();

    public Vehiculo(String matricula, char tipo, int fila, int columna, LocalDateTime horaEntrada, LocalDateTime horaSalida) {
        this.matricula = matricula;
        this.tipo = tipo;
        this.fila = fila;
        this.columna = columna;
        this.horaEntrada = LocalDateTime.now();
    }

    public static String generarMatriculaAleatoria() {
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

    public void registrarSalida() {
        this.horaSalida = LocalDateTime.now().plusHours(random.nextInt(5));
    }

    public double calcularTiempoEstadia() {
        if (horaSalida != null) {
            Duration duracion = Duration.between(horaEntrada, horaSalida);
            return duracion.toHours() + 1;
        }
        return 0;
    }

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
}
