package dominio;

import java.time.LocalDateTime;

public class Ticket {
    private int idTicket;
    private int idUbicacion;
    private int idEstacionamiento;
    private int idVehiculo;
    private String vehiculoMatricula;
    private int idEmpleado;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;
    private boolean pagado;
    private float monto;

    public Ticket() {}


    public Ticket(int idTicket){
        this.idTicket = idTicket;
    }
    
    public Ticket(int idUbicacion, int idEstacionamiento, int idVehiculo, String vehiculoMatricula, int idEmpleado,
                  LocalDateTime horaEntrada, LocalDateTime horaSalida, boolean pagado, float monto) {
        this.idUbicacion = idUbicacion;
        this.idEstacionamiento = idEstacionamiento;
        this.idVehiculo = idVehiculo;
        this.vehiculoMatricula = vehiculoMatricula;
        this.idEmpleado = idEmpleado;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.pagado = pagado;
        this.monto = monto;
    }

    public int getIdTicket() { 
        return idTicket; 
    }
    public void setIdTicket(int idTicket) { 
        this.idTicket = idTicket; 
    }

    public int getIdUbicacion() { 
        return idUbicacion; 
    }
    public void setIdUbicacion(int idUbicacion) { 
        this.idUbicacion = idUbicacion; 
    }

    public int getIdEstacionamiento() { 
        return idEstacionamiento; 
    }
    public void setIdEstacionamiento(int idEstacionamiento) { 
        this.idEstacionamiento = idEstacionamiento; 
    }

    public int getIdVehiculo() { 
        return idVehiculo; 
    }
    public void setIdVehiculo(int idVehiculo) { 
        this.idVehiculo = idVehiculo; 
    }

    public String getVehiculoMatricula() { 
        return vehiculoMatricula; 
    }
    public void setVehiculoMatricula(String vehiculoMatricula) { 
        this.vehiculoMatricula = vehiculoMatricula; 
    }

    public int getIdEmpleado() { 
        return idEmpleado; 
    }
    public void setIdEmpleado(int idEmpleado) { 
        this.idEmpleado = idEmpleado; 
    }

    public LocalDateTime getHoraEntrada() { 
        return horaEntrada; 
    }
    public void setHoraEntrada(LocalDateTime horaEntrada) { 
        this.horaEntrada = horaEntrada; 
    }

    public LocalDateTime getHoraSalida() { 
        return horaSalida; 
    }
    public void setHoraSalida(LocalDateTime horaSalida) { 
        this.horaSalida = horaSalida; 
    }

    public boolean isPagado() { 
        return pagado; 
    }
    public void setPagado(boolean pagado) { 
        this.pagado = pagado; 
    }

    public float getMonto() { 
        return monto; 
    }
    public void setMonto(float monto) { 
        this.monto = monto; 
    }
}
