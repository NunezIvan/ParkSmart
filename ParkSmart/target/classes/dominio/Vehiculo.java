
package dominio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Vehiculo {
    private int id_vehiculo;
    private String matricula;
    private String tipo;
    private LocalDateTime hora_entrada,hora_salida;

    public int getId_vehiculo() {
        return this.id_vehiculo;
    }

    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getHora_entrada() {
        return this.hora_entrada;
    }

    public void setHora_entrada(LocalDateTime hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public LocalDateTime getHora_salida() {
        return this.hora_salida;
    }

    public void setHora_salida(LocalDateTime hora_salida) {
        this.hora_salida = hora_salida;
    }
    
    public String getHoraEntradaFormateada() {
        return this.hora_entrada.format(FORMATO_FECHA);
    }
    
    public String getHoraSalidaFormateada() {
        return this.hora_salida.format(FORMATO_FECHA);
    }
    
    private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS");

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.id_vehiculo;
        hash = 29 * hash + Objects.hashCode(this.matricula);
        hash = 29 * hash + Objects.hashCode(this.tipo);
        hash = 29 * hash + Objects.hashCode(this.hora_entrada);
        hash = 29 * hash + Objects.hashCode(this.hora_salida);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        if (this.id_vehiculo != other.id_vehiculo) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.hora_entrada, other.hora_entrada)) {
            return false;
        }
        return Objects.equals(this.hora_salida, other.hora_salida);
    }
    
    public Vehiculo(){}
    
    public Vehiculo(int id_vehiculo){
        this.id_vehiculo = id_vehiculo;
    }

    public Vehiculo(String matricula, String tipo, LocalDateTime hora_entrada, LocalDateTime hora_salida) {
        this.matricula = matricula;
        this.tipo = tipo;
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
    }
    
}
