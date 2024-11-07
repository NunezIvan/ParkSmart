package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import conexion.conexion_DB;
import dominio.AsignacionEmpleado;

public class Asignacion_Empleado {

    // Método para agregar una nueva asignación de empleado
    public static boolean agregarAsignacionEmpleado(AsignacionEmpleado asignacion) {
        Connection con = conexion_DB.getConexion();
        String sql = "INSERT INTO asignacion_empleado(idEstacionamiento, id_Empleado, fecha_asignacion, estado) VALUES(?, ?, ?, ?)";
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, asignacion.getIdEstacionamiento());
            ps.setInt(2, asignacion.getIdEmpleado());
            ps.setObject(3, asignacion.getFechaAsignacion()); // Suponiendo LocalDateTime
            ps.setString(4, asignacion.getEstado());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al agregar la asignación de empleado: " + e.getMessage());
            return false;
        }
    }

    // Método para listar todas las asignaciones de empleados
    public static List<AsignacionEmpleado> listarAsignacionesEmpleado() {
        List<AsignacionEmpleado> asignaciones = new ArrayList<>();
        Connection con = conexion_DB.getConexion();
        String sql = "SELECT * FROM asignacion_empleado";
        
        try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                AsignacionEmpleado asignacion = new AsignacionEmpleado();
                asignacion.setIdAsignacion(rs.getInt("id_asignacion"));
                asignacion.setIdEstacionamiento(rs.getInt("idEstacionamiento"));
                asignacion.setIdEmpleado(rs.getInt("id_Empleado"));
                asignacion.setFechaAsignacion(rs.getObject("fecha_asignacion", LocalDateTime.class));
                asignacion.setEstado(rs.getString("estado"));
                asignaciones.add(asignacion);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar las asignaciones de empleados: " + e.getMessage());
        }
        return asignaciones;
    }

    // Método para modificar una asignación de empleado
    public static boolean modificarAsignacionEmpleado(AsignacionEmpleado asignacion) {
        Connection con = conexion_DB.getConexion();
        String sql = "UPDATE asignacion_empleado SET idEstacionamiento = ?, id_Empleado = ?, fecha_asignacion = ?, estado = ? WHERE id_asignacion = ?";
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, asignacion.getIdEstacionamiento());
            ps.setInt(2, asignacion.getIdEmpleado());
            ps.setObject(3, asignacion.getFechaAsignacion());
            ps.setString(4, asignacion.getEstado());
            ps.setInt(5, asignacion.getIdAsignacion());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al modificar la asignación de empleado: " + e.getMessage());
            return false;
        }
    }

    // Método para eliminar una asignación de empleado
    public static boolean eliminarAsignacionEmpleado(int idAsignacion) {
        Connection con = conexion_DB.getConexion();
        String sql = "DELETE FROM asignacion_empleado WHERE id_asignacion = ?";
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idAsignacion);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al eliminar la asignación de empleado: " + e.getMessage());
            return false;
        }
    }
}
