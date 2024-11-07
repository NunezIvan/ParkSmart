package dominio;

import java.util.Objects;

public class Empleado {
    private int idEmpleado;
    private String nombre;
    private String apellido;
    private String username;
    private String contraseña;
    private String cargo;
    private float salario;
    private String telefono;
    private String turno;

    public Empleado() {}
    
    public Empleado(int idEmpleado){
        this.idEmpleado = idEmpleado;
    }

    public Empleado(String nombre, String apellido, String username, String contraseña, String cargo, float salario, String telefono, String turno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.contraseña = contraseña;
        this.cargo = cargo;
        this.salario = salario;
        this.telefono = telefono;
        this.turno = turno;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmpleado, nombre, apellido, username, contraseña, cargo, salario, telefono, turno);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Empleado empleado = (Empleado) obj;
        return idEmpleado == empleado.idEmpleado &&
               Float.compare(empleado.salario, salario) == 0 &&
               Objects.equals(nombre, empleado.nombre) &&
               Objects.equals(apellido, empleado.apellido) &&
               Objects.equals(username, empleado.username) &&
               Objects.equals(contraseña, empleado.contraseña) &&
               Objects.equals(cargo, empleado.cargo) &&
               Objects.equals(telefono, empleado.telefono) &&
               Objects.equals(turno, empleado.turno);
    }


}
