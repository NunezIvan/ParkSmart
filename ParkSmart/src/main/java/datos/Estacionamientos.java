package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.conexion_DB;
import static datos.ubicaciones.agregarUbicacion;
import dominio.Estacionamiento;
import dominio.ubicacion;

public class Estacionamientos {
    
    private static void generarYAgregarUbicaciones(int idEstacionamiento, int pisosTotales, int columnasTotales, int filasTotales) {
        for (int piso = 1; piso <= pisosTotales; piso++) {
            for (int fila = 1; fila <= filasTotales; fila++) {
                for (int columna = 1; columna <= columnasTotales; columna++) {
                    // Crear una nueva instancia de Ubicacion con los datos generados
                    ubicacion ubicacion = new ubicacion(idEstacionamiento, fila, columna, piso, "Libre");
                    
                    // Llamar al método agregarUbicacion de la clase Ubicaciones para agregar cada ubicación
                    agregarUbicacion(ubicacion);
                }
            }
        }
    }
    
    public static boolean agregarEstacionamiento(Estacionamiento estacionamiento) {
        PreparedStatement ps = null;
        Connection con = conexion_DB.getConexion();
        String sql = "INSERT INTO Estacionamiento(tarifa_hora, nombre, direccion, pisos_totales, columnas_totales, filas_totales, plazas_libres) VALUES(?, ?, ?, ?, ?, ?, ?)";
        
        try {
            // Insertar el estacionamiento
            ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setFloat(1, estacionamiento.getTarifaHora());
            ps.setString(2, estacionamiento.getNombre());
            ps.setString(3, estacionamiento.getDireccion());
            ps.setInt(4, estacionamiento.getPisosTotales());
            ps.setInt(5, estacionamiento.getColumnasTotales());
            ps.setInt(6, estacionamiento.getFilasTotales());
            ps.setInt(7, estacionamiento.getPlazasLibres());
            ps.executeUpdate();

            ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                int idEstacionamiento = generatedKeys.getInt(1);
                
                generarYAgregarUbicaciones(idEstacionamiento, estacionamiento.getPisosTotales(), estacionamiento.getColumnasTotales(), estacionamiento.getFilasTotales());
            }
            return true;
        } catch (SQLException e) {
            System.out.println("Error al agregar el estacionamiento: " + e.getMessage());
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return false;
    }

    public static List<Estacionamiento> listarEstacionamientos() {
        List<Estacionamiento> estacionamientos = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection con = conexion_DB.getConexion();
        String sql = "SELECT * FROM Estacionamiento ORDER BY idEstacionamiento";
        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Estacionamiento estacionamiento = new Estacionamiento();
                estacionamiento.setIdEstacionamiento(rs.getInt("idEstacionamiento"));
                estacionamiento.setTarifaHora(rs.getFloat("tarifa_hora"));
                estacionamiento.setNombre(rs.getString("nombre"));
                estacionamiento.setDireccion(rs.getString("direccion"));
                estacionamiento.setPisosTotales(rs.getInt("pisos_totales"));
                estacionamiento.setColumnasTotales(rs.getInt("columnas_totales"));
                estacionamiento.setFilasTotales(rs.getInt("filas_totales"));
                estacionamiento.setPlazasLibres(rs.getInt("plazas_libres"));
                estacionamientos.add(estacionamiento);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar los estacionamientos: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return estacionamientos;
    }

    public static Estacionamiento buscarEstacionamientoPorId(int idEstacionamiento) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = conexion_DB.getConexion();
        String sql = "SELECT * FROM Estacionamiento WHERE idEstacionamiento = ?";
        Estacionamiento estacionamiento = null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idEstacionamiento);
            rs = ps.executeQuery();
            if (rs.next()) {
                estacionamiento = new Estacionamiento();
                estacionamiento.setIdEstacionamiento(rs.getInt("idEstacionamiento"));
                estacionamiento.setTarifaHora(rs.getFloat("tarifa_hora"));
                estacionamiento.setNombre(rs.getString("nombre"));
                estacionamiento.setDireccion(rs.getString("direccion"));
                estacionamiento.setPisosTotales(rs.getInt("pisos_totales"));
                estacionamiento.setColumnasTotales(rs.getInt("columnas_totales"));
                estacionamiento.setFilasTotales(rs.getInt("filas_totales"));
                estacionamiento.setPlazasLibres(rs.getInt("plazas_libres"));
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar el estacionamiento por ID: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return estacionamiento;
    }
    
    public static boolean actualizarTarifa(int idEstacionamiento, float nuevaTarifa) {
        PreparedStatement ps = null;
        Connection con = conexion_DB.getConexion();
        String sql = "UPDATE Estacionamiento SET tarifa_hora = ? WHERE idEstacionamiento = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setFloat(1, nuevaTarifa); // Establece la nueva tarifa
            ps.setInt(2, idEstacionamiento); // Especifica el ID del estacionamiento
            int filasActualizadas = ps.executeUpdate(); // Ejecuta la actualización

            // Verifica si se actualizó alguna fila
            return filasActualizadas > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar la tarifa del estacionamiento: " + e.getMessage());
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return false;
    }

    public static boolean eliminarEstacionamiento(int idEstacionamiento) {
        PreparedStatement ps = null;
        Connection con = conexion_DB.getConexion();
        
        try {
            String deleteUbicacionesSql = "DELETE FROM Ubicacion WHERE idEstacionamiento = ?";
            ps = con.prepareStatement(deleteUbicacionesSql);
            ps.setInt(1, idEstacionamiento);
            ps.executeUpdate();

            String deleteEstacionamientoSql = "DELETE FROM Estacionamiento WHERE idEstacionamiento = ?";
            ps = con.prepareStatement(deleteEstacionamientoSql);
            ps.setInt(1, idEstacionamiento);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al eliminar el estacionamiento: " + e.getMessage());
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return false;
    }
    
    public static void generarEstructura() {
        Connection con = conexion_DB.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String checkSql = "SELECT COUNT(*) AS count FROM Estacionamiento";

        try {
            ps = con.prepareStatement(checkSql);
            rs = ps.executeQuery();
            if (rs.next() && rs.getInt("count") == 0) {
                Estacionamiento estacionamiento1 = new Estacionamiento(10.5F,"Megaplaza_1","Av. Alfredo Mendiola 3698",2,6,5);
                Estacionamiento estacionamiento2 = new Estacionamiento(10.5F,"Megaplaza_2","Av. Alfredo Mendiola 3698",2,6,5);
                agregarEstacionamiento(estacionamiento1);
                agregarEstacionamiento(estacionamiento2);
            } else {
                System.out.println("La tabla Estacionamiento ya contiene datos. No es necesario generar la estructura.");
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar la tabla Estacionamiento: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar los recursos: " + e.getMessage());
            }
        }
    }
    
    public static void main(String[] args) { //Primero compilen este archivo si recien han creado su Base de datos y esta vacia
        generarEstructura();
    }
}