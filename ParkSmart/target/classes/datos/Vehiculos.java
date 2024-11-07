package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import conexion.conexion_DB;
import dominio.Vehiculo;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Vehiculos {
    
    private static final Random random = new Random();
    
    public Vehiculos() {}

    public static String leerMatricula() {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder matricula = new StringBuilder();
        matricula.append(letras.charAt(random.nextInt(letras.length())));
        matricula.append(random.nextInt(10));
        matricula.append(letras.charAt(random.nextInt(letras.length())));
        matricula.append("-");
        for (int i = 0; i < 3; i++) {
            matricula.append(random.nextInt(10));
        }
        return matricula.toString();
    }

    public static List<Vehiculo> listarVehiculos() {
        List<Vehiculo> vehiculos = new ArrayList<>();
        String sql = "SELECT * FROM Vehiculo ORDER BY id_vehiculo";

        try (Connection con = conexion_DB.getConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Vehiculo vehiculo = new Vehiculo();
                vehiculo.setId_vehiculo(rs.getInt("id_vehiculo"));
                vehiculo.setMatricula(rs.getString("matricula"));
                vehiculo.setTipo(rs.getString("tipo_vehiculo"));
                vehiculo.setHora_entrada(rs.getTimestamp("hora_entrada").toLocalDateTime());
                vehiculo.setHora_salida(rs.getTimestamp("hora_salida") != null ? rs.getTimestamp("hora_salida").toLocalDateTime() : null);
                vehiculos.add(vehiculo);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar vehículos: " + e.getMessage());
        }

        return vehiculos;
    }

    public static void Agregar_Vehiculo(Vehiculo vehiculo) {
        String sql = "INSERT INTO Vehiculo(matricula, tipo_vehiculo, hora_entrada, hora_salida) VALUES(?, ?, ?, ?)";

        try (Connection con = conexion_DB.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, vehiculo.getMatricula());
            ps.setString(2, vehiculo.getTipo());
            ps.setTimestamp(3, Timestamp.valueOf(vehiculo.getHora_entrada()));  // `hora_entrada` no es opcional

            // `hora_salida` es opcional, verifica si no es null
            if (vehiculo.getHora_salida() != null) {
                ps.setTimestamp(4, Timestamp.valueOf(vehiculo.getHora_salida()));
            } else {
                ps.setNull(4, java.sql.Types.TIMESTAMP);
            }

            ps.execute();
        } catch (SQLException e) {
            System.out.println("Error al agregar vehiculo: " + e.getMessage());
        }
    }

    public static boolean modificarVehiculo(Vehiculo vehiculo) {
        String sql = "UPDATE Vehiculo SET matricula=?, tipo_vehiculo=?, hora_entrada=?, hora_salida=? WHERE id_vehiculo = ?";

        try (Connection con = conexion_DB.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, vehiculo.getMatricula());
            ps.setString(2, vehiculo.getTipo());
            ps.setTimestamp(3, Timestamp.valueOf(vehiculo.getHora_entrada()));  // `hora_entrada` no es opcional
            ps.setTimestamp(4, vehiculo.getHora_salida() != null ? Timestamp.valueOf(vehiculo.getHora_salida()) : null);
            ps.setInt(5, vehiculo.getId_vehiculo());

            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al modificar el vehículo: " + e.getMessage());
        }
        return false;
    }

    public static boolean eliminarVehiculo(Vehiculo vehiculo) {
        String sql = "DELETE FROM Vehiculo WHERE id_vehiculo=?";

        try (Connection con = conexion_DB.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, vehiculo.getId_vehiculo());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al eliminar el vehículo: " + e.getMessage());
        }
        return false;
    }

    public static boolean actualizarHoraSalida(Vehiculo vehiculo) {
        LocalDateTime horaActual = LocalDateTime.now();
        String sql = "UPDATE Vehiculo SET hora_salida = ? WHERE id_vehiculo = ?";

        try (Connection con = conexion_DB.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            vehiculo.setHora_salida(horaActual); // Actualiza en el objeto
            ps.setTimestamp(1, Timestamp.valueOf(horaActual));
            ps.setInt(2, vehiculo.getId_vehiculo());

            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al actualizar la hora de salida: " + e.getMessage());
        }
        return false;
    }
}
