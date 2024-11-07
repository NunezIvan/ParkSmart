package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.conexion_DB;
import dominio.ubicacion;

public class ubicaciones {
    
    public static boolean agregarUbicacion(ubicacion ubicacion) {
        PreparedStatement ps;
        Connection con = conexion_DB.getConexion();
        String sql = "INSERT INTO Ubicacion(idEstacionamiento, fila, columna, piso, estado) VALUES(?, ?, ?, ?, ?)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ubicacion.getIdEstacionamiento());
            ps.setInt(2, ubicacion.getFila());
            ps.setInt(3, ubicacion.getColumna());
            ps.setInt(4, ubicacion.getPiso());
            ps.setString(5, ubicacion.getEstado()); // Cambiado a String
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al agregar la ubicación: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return false;
    }
    
    public static List<ubicacion> listarUbicacionesPorEstacionamiento(int idEstacionamiento) {
        List<ubicacion> ubicaciones = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection con = conexion_DB.getConexion();
        String sql = "SELECT * FROM Ubicacion WHERE idEstacionamiento = ? ORDER BY idUbicacion";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idEstacionamiento);
            rs = ps.executeQuery();
            while (rs.next()) {
                ubicacion ubicacion = new ubicacion();
                ubicacion.setIdUbicacion(rs.getInt("idUbicacion"));
                ubicacion.setIdEstacionamiento(rs.getInt("idEstacionamiento"));
                ubicacion.setFila(rs.getInt("fila"));
                ubicacion.setColumna(rs.getInt("columna"));
                ubicacion.setPiso(rs.getInt("piso"));
                ubicacion.setEstado(rs.getString("estado")); // Cambiado de habilitado a estado
                ubicaciones.add(ubicacion);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar las ubicaciones: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return ubicaciones;
    }
    
    public static ubicacion buscarUbicacionPorId(int idUbicacion) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = conexion_DB.getConexion();
        String sql = "SELECT * FROM Ubicacion WHERE idUbicacion = ?";
        ubicacion ubicacion = null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idUbicacion);
            rs = ps.executeQuery();
            if (rs.next()) {
                ubicacion = new ubicacion();
                ubicacion.setIdUbicacion(rs.getInt("idUbicacion"));
                ubicacion.setIdEstacionamiento(rs.getInt("idEstacionamiento"));
                ubicacion.setFila(rs.getInt("fila"));
                ubicacion.setColumna(rs.getInt("columna"));
                ubicacion.setPiso(rs.getInt("piso"));
                ubicacion.setEstado(rs.getString("estado")); // Cambiado de habilitado a estado
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar la ubicación por ID: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return ubicacion;
    }
    
    public static boolean modificarUbicacion(ubicacion ubicacion) {
        PreparedStatement ps;
        Connection con = conexion_DB.getConexion();
        String sql = "UPDATE Ubicacion SET idEstacionamiento = ?, fila = ?, columna = ?, piso = ?, estado = ? WHERE idUbicacion = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ubicacion.getIdEstacionamiento());
            ps.setInt(2, ubicacion.getFila());
            ps.setInt(3, ubicacion.getColumna());
            ps.setInt(4, ubicacion.getPiso());
            ps.setString(5, ubicacion.getEstado()); // Cambiado a String
            ps.setInt(6, ubicacion.getIdUbicacion());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al modificar la ubicación: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return false;
    }
    
    public static boolean ModificarUbicacion(ubicacion ubicacion,String estado) {
        PreparedStatement ps;
        Connection con = conexion_DB.getConexion();
        String sql = "UPDATE Ubicacion SET estado = ? WHERE idUbicacion = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, estado); // Por ejemplo, cambiar estado a "Inactivo"
            ps.setInt(2, ubicacion.getIdUbicacion());
            ps.executeUpdate();

            // Actualizar el atributo estado del objeto Ubicacion
            ubicacion.setEstado("Inactivo");

            return true;
        } catch (SQLException e) {
            System.out.println("Error al deshabilitar la ubicación: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return false;
    }
}
