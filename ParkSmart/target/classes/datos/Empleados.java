package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.conexion_DB;
import dominio.Empleado;

public class Empleados {

    public static boolean agregarEmpleado(Empleado empleado) {
        Connection con = conexion_DB.getConexion();
        String sql = "INSERT INTO Empleado(nombre, apellido, username, contraseña, cargo, salario, telefono, turno) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, empleado.getNombre());
            ps.setString(2, empleado.getApellido());
            ps.setString(3, empleado.getUsername());
            ps.setString(4, empleado.getContraseña());
            ps.setString(5, empleado.getCargo());
            ps.setFloat(6, empleado.getSalario());
            ps.setString(7, empleado.getTelefono());
            ps.setString(8, empleado.getTurno());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al agregar el empleado: " + e.getMessage());
            return false;
        }
    }

    public static List<Empleado> listarEmpleados() {
        List<Empleado> empleados = new ArrayList<>();
        Connection con = conexion_DB.getConexion();
        String sql = "SELECT * FROM Empleado";
        
        try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setIdEmpleado(rs.getInt("id_Empleado"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setApellido(rs.getString("apellido"));
                empleado.setUsername(rs.getString("username"));
                empleado.setContraseña(rs.getString("contraseña"));
                empleado.setCargo(rs.getString("cargo"));
                empleado.setSalario(rs.getFloat("salario"));
                empleado.setTelefono(rs.getString("telefono"));
                empleado.setTurno(rs.getString("turno"));
                empleados.add(empleado);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar los empleados: " + e.getMessage());
        }
        return empleados;
    }

    public static Empleado buscarEmpleadoPorId(int idEmpleado) {
        Connection con = conexion_DB.getConexion();
        String sql = "SELECT * FROM Empleado WHERE id_Empleado = ?";
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idEmpleado);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setIdEmpleado(rs.getInt("id_Empleado"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setApellido(rs.getString("apellido"));
                empleado.setUsername(rs.getString("username"));
                empleado.setContraseña(rs.getString("contraseña"));
                empleado.setCargo(rs.getString("cargo"));
                empleado.setSalario(rs.getFloat("salario"));
                empleado.setTelefono(rs.getString("telefono"));
                empleado.setTurno(rs.getString("turno"));
                return empleado;
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar el empleado: " + e.getMessage());
        }
        return null;
    }

    public static boolean modificarEmpleado(Empleado empleado) {
        Connection con = conexion_DB.getConexion();
        String sql = "UPDATE Empleado SET nombre = ?, apellido = ?, username = ?, contraseña = ?, cargo = ?, salario = ?, telefono = ?, turno = ? WHERE id_Empleado = ?";
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, empleado.getNombre());
            ps.setString(2, empleado.getApellido());
            ps.setString(3, empleado.getUsername());
            ps.setString(4, empleado.getContraseña());
            ps.setString(5, empleado.getCargo());
            ps.setFloat(6, empleado.getSalario());
            ps.setString(7, empleado.getTelefono());
            ps.setString(8, empleado.getTurno());
            ps.setInt(9, empleado.getIdEmpleado());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al modificar el empleado: " + e.getMessage());
            return false;
        }
    }

    public static boolean eliminarEmpleado(int idEmpleado) {
        Connection con = conexion_DB.getConexion();
        String sql = "DELETE FROM Empleado WHERE id_Empleado = ?";
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idEmpleado);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al eliminar el empleado: " + e.getMessage());
            return false;
        }
    }
}
