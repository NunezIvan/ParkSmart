package Modelo_Estacionamiento;

import java.time.LocalDateTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 *
 * @author andrey
 */
public class Vehiculo {
    protected String matricula;
    protected char tipo;
    protected LocalDateTime horaEntrada, horaSalida;
    
    private static final DateTimeFormatter FORMATO_FECHA_HORA = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    private static final Random random = new Random();
    
    public Vehiculo(String matricula, char tipo, LocalDateTime horaEntrada, LocalDateTime horaSalida) {
        this.matricula = matricula;
        this.tipo = tipo;
        this.horaEntrada = LocalDateTime.now();
    }
    
    // Para pruebas
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
        // Para pruebas
        // this.horaSalida = LocalDateTime.now();
        
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

    public String getHoraSalidaFormateada() {
        return (horaSalida != null) ? horaSalida.format(FORMATO_FECHA_HORA) : "N/A";
    }

    public String getMatricula() {
        return matricula;
    }

    public char getTipo() {
        return tipo;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }
}
