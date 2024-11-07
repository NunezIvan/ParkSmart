package dominio;

public class ubicacion {
    private int idUbicacion;
    private int idEstacionamiento;
    private int fila;
    private int columna;
    private int piso;
    private String estado; // Cambiado de boolean habilitado a String estado

    public ubicacion() {}
    
    public ubicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public ubicacion(int idEstacionamiento, int fila, int columna, int piso, String estado) {
        this.idEstacionamiento = idEstacionamiento;
        this.fila = fila;
        this.columna = columna;
        this.piso = piso;
        this.estado = estado;
    }

    public int getIdUbicacion() {
        return this.idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public int getIdEstacionamiento() {
        return this.idEstacionamiento;
    }

    public void setIdEstacionamiento(int idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }

    public int getFila() {
        return this.fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return this.columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getPiso() {
        return this.piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
