package dominio;

import java.util.Objects;

public class Estacionamiento {
    private int idEstacionamiento;
    private float tarifaHora;
    private String nombre;
    private String direccion;
    private int pisosTotales;
    private int columnasTotales;
    private int filasTotales;
    private int plazasLibres;

    public Estacionamiento() {}

    public Estacionamiento(int idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }

   
    public Estacionamiento(float tarifaHora, String nombre, String direccion, int pisosTotales, int columnasTotales, int filasTotales) {
        this.tarifaHora = tarifaHora;
        this.nombre = nombre;
        this.direccion = direccion;
        this.pisosTotales = pisosTotales;
        this.columnasTotales = columnasTotales;
        this.filasTotales = filasTotales;
        this.plazasLibres = this.pisosTotales*this.columnasTotales*this.filasTotales;
    }

    public int getIdEstacionamiento() {
        return idEstacionamiento;
    }

    public void setIdEstacionamiento(int idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }

    public float getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(float tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPisosTotales() {
        return pisosTotales;
    }

    public void setPisosTotales(int pisosTotales) {
        this.pisosTotales = pisosTotales;
    }

    public int getColumnasTotales() {
        return columnasTotales;
    }

    public void setColumnasTotales(int columnasTotales) {
        this.columnasTotales = columnasTotales;
    }

    public int getFilasTotales() {
        return filasTotales;
    }

    public void setFilasTotales(int filasTotales) {
        this.filasTotales = filasTotales;
    }

    public int getPlazasLibres() {
        return plazasLibres;
    }

    public void setPlazasLibres(int plazasLibres) {
        this.plazasLibres = plazasLibres;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEstacionamiento, tarifaHora, nombre, direccion, pisosTotales, columnasTotales, filasTotales, plazasLibres);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Estacionamiento other = (Estacionamiento) obj;
        return idEstacionamiento == other.idEstacionamiento &&
               Float.compare(other.tarifaHora, tarifaHora) == 0 &&
               Objects.equals(nombre, other.nombre) &&
               Objects.equals(direccion, other.direccion) &&
               pisosTotales == other.pisosTotales &&
               columnasTotales == other.columnasTotales &&
               filasTotales == other.filasTotales &&
               Objects.equals(plazasLibres, other.plazasLibres);
    }

    @Override
    public String toString() {
        return "Estacionamiento{" +
                "idEstacionamiento=" + idEstacionamiento +
                ", tarifaHora=" + tarifaHora +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", pisosTotales=" + pisosTotales +
                ", columnasTotales=" + columnasTotales +
                ", filasTotales=" + filasTotales +
                ", plazasLibres='" + plazasLibres + '\'' +
                '}';
    }
}
