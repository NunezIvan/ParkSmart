package dominio;

import java.time.LocalDateTime;
import java.util.Objects;

public class AsignacionEmpleado {
    private int idAsignacion;
    private int idEstacionamiento;
    private int idEmpleado;
    private LocalDateTime fechaAsignacion;
    private String estado;

    public AsignacionEmpleado() {}

    public AsignacionEmpleado(int idAsignacion){
        this.idAsignacion = idAsignacion;
    }
    
    public AsignacionEmpleado(int idEstacionamiento, int idEmpleado, LocalDateTime fechaAsignacion, String estado) {
        this.idEstacionamiento = idEstacionamiento;
        this.idEmpleado = idEmpleado;
        this.fechaAsignacion = fechaAsignacion;
        this.estado = estado;
    }


    public int getIdAsignacion() {
        return idAsignacion;
    }

    public void setIdAsignacion(int idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public int getIdEstacionamiento() {
        return idEstacionamiento;
    }

    public void setIdEstacionamiento(int idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public LocalDateTime getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(LocalDateTime fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAsignacion, idEstacionamiento, idEmpleado, fechaAsignacion, estado);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AsignacionEmpleado asignacion = (AsignacionEmpleado) obj;
        return idAsignacion == asignacion.idAsignacion &&
               idEstacionamiento == asignacion.idEstacionamiento &&
               idEmpleado == asignacion.idEmpleado &&
               Objects.equals(fechaAsignacion, asignacion.fechaAsignacion) &&
               Objects.equals(estado, asignacion.estado);
    }

}
