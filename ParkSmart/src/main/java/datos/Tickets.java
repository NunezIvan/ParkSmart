package datos;

import dominio.Ticket;
import conexion.conexion_DB;
import dominio.Estacionamiento;

import java.sql.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Tickets {

    // Método para agregar un nuevo ticket
    public static void agregarTicket(Ticket ticket) {
        String sql = "INSERT INTO Ticket(idUbicacion, idEstacionamiento, id_vehiculo, Vehiculo_matricula, id_Empleado, hora_entrada, hora_salida, pagado, monto) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = conexion_DB.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
             
            ps.setInt(1, ticket.getIdUbicacion());
            ps.setInt(2, ticket.getIdEstacionamiento());
            ps.setInt(3, ticket.getIdVehiculo());
            ps.setString(4, ticket.getVehiculoMatricula());
            ps.setInt(5, ticket.getIdEmpleado());
            ps.setTimestamp(6, Timestamp.valueOf(ticket.getHoraEntrada()));
            ps.setTimestamp(7, ticket.getHoraSalida() != null ? Timestamp.valueOf(ticket.getHoraSalida()) : null);
            ps.setBoolean(8, ticket.isPagado());
            ps.setFloat(9, ticket.getMonto());
            
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al agregar ticket: " + e.getMessage());
        }
    }

    public static List<Ticket> listarTickets() {
        List<Ticket> tickets = new ArrayList<>();
        String sql = "SELECT * FROM Ticket";
        
        try (Connection con = conexion_DB.getConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
             
            while (rs.next()) {
                Ticket ticket = new Ticket();
                ticket.setIdTicket(rs.getInt("idTicket"));
                ticket.setIdUbicacion(rs.getInt("idUbicacion"));
                ticket.setIdEstacionamiento(rs.getInt("idEstacionamiento"));
                ticket.setIdVehiculo(rs.getInt("id_vehiculo"));
                ticket.setVehiculoMatricula(rs.getString("Vehiculo_matricula"));
                ticket.setIdEmpleado(rs.getInt("id_Empleado"));
                ticket.setHoraEntrada(rs.getTimestamp("hora_entrada").toLocalDateTime());
                ticket.setHoraSalida(rs.getTimestamp("hora_salida") != null ? rs.getTimestamp("hora_salida").toLocalDateTime() : null);
                ticket.setPagado(rs.getBoolean("pagado"));
                ticket.setMonto(rs.getFloat("monto"));
                tickets.add(ticket);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar tickets: " + e.getMessage());
        }
        return tickets;
    }
    
    public static List<Ticket> listarTicketsNoPagados() {
        List<Ticket> tickets = new ArrayList<>();
        String sql = "SELECT * FROM Ticket WHERE pagado = 0";

        try (Connection con = conexion_DB.getConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Ticket ticket = new Ticket();
                ticket.setIdTicket(rs.getInt("idTicket"));
                ticket.setIdUbicacion(rs.getInt("idUbicacion"));
                ticket.setIdEstacionamiento(rs.getInt("idEstacionamiento"));
                ticket.setIdVehiculo(rs.getInt("id_vehiculo"));
                ticket.setVehiculoMatricula(rs.getString("Vehiculo_matricula"));
                ticket.setIdEmpleado(rs.getInt("id_Empleado"));
                ticket.setHoraEntrada(rs.getTimestamp("hora_entrada").toLocalDateTime());
                ticket.setHoraSalida(rs.getTimestamp("hora_salida") != null ? rs.getTimestamp("hora_salida").toLocalDateTime() : null);
                ticket.setPagado(rs.getBoolean("pagado"));
                ticket.setMonto(rs.getFloat("monto"));

                tickets.add(ticket);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar tickets no pagados: " + e.getMessage());
        }
        return tickets;
    }
    
    public static List<Ticket> listarTicketsPagados() {
        List<Ticket> tickets = new ArrayList<>();
        String sql = "SELECT * FROM Ticket WHERE pagado = 1";

        try (Connection con = conexion_DB.getConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Ticket ticket = new Ticket();
                ticket.setIdTicket(rs.getInt("idTicket"));
                ticket.setIdUbicacion(rs.getInt("idUbicacion"));
                ticket.setIdEstacionamiento(rs.getInt("idEstacionamiento"));
                ticket.setIdVehiculo(rs.getInt("id_vehiculo"));
                ticket.setVehiculoMatricula(rs.getString("Vehiculo_matricula"));
                ticket.setIdEmpleado(rs.getInt("id_Empleado"));
                ticket.setHoraEntrada(rs.getTimestamp("hora_entrada").toLocalDateTime());
                ticket.setHoraSalida(rs.getTimestamp("hora_salida") != null ? rs.getTimestamp("hora_salida").toLocalDateTime() : null);
                ticket.setPagado(rs.getBoolean("pagado"));
                ticket.setMonto(rs.getFloat("monto"));

                tickets.add(ticket);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar tickets pagados: " + e.getMessage());
        }
        return tickets;
    }
    
    public static Ticket buscarTicketPorId(Ticket ticket_1) {
        String sql = "SELECT * FROM Ticket WHERE idTicket = ?";

        try (Connection con = conexion_DB.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, ticket_1.getIdTicket());

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Ticket ticket = new Ticket();
                    ticket.setIdTicket(rs.getInt("idTicket"));
                    ticket.setIdUbicacion(rs.getInt("idUbicacion"));
                    ticket.setIdEstacionamiento(rs.getInt("idEstacionamiento"));
                    ticket.setIdVehiculo(rs.getInt("id_vehiculo"));
                    ticket.setVehiculoMatricula(rs.getString("Vehiculo_matricula"));
                    ticket.setIdEmpleado(rs.getInt("id_Empleado"));
                    ticket.setHoraEntrada(rs.getTimestamp("hora_entrada").toLocalDateTime());
                    ticket.setHoraSalida(rs.getTimestamp("hora_salida") != null ? rs.getTimestamp("hora_salida").toLocalDateTime() : null);
                    ticket.setPagado(rs.getBoolean("pagado"));
                    ticket.setMonto(rs.getFloat("monto"));

                    return ticket;
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar ticket por ID: " + e.getMessage());
        }
        return null;
    }


    public static boolean actualizarSalidaTicket(Ticket ticket, Estacionamiento estacionamiento) {
        String sql = "UPDATE Ticket SET hora_salida = ?, pagado = ?, monto = ? WHERE idTicket = ?";
        
        LocalDateTime horaSalida = LocalDateTime.now();  // Hora de salida actual
        ticket.setHoraSalida(horaSalida);
        ticket.setPagado(true); // Se establece el estado pagado como verdadero

        // Calcular la duración entre hora de entrada y hora de salida
        Duration duracion = Duration.between(ticket.getHoraEntrada(), horaSalida);
        long horas = duracion.toHours();
        long minutos = duracion.toMinutes() % 60;

        // Calcular el monto total
        float tarifaPorHora = estacionamiento.getTarifaHora();
        float monto = (horas * tarifaPorHora) + (minutos / 60.0f * tarifaPorHora);
        
        monto = Math.round(monto * 100) / 100.0f;
        ticket.setMonto(monto);

        try (Connection con = conexion_DB.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setTimestamp(1, Timestamp.valueOf(horaSalida));
            ps.setBoolean(2, ticket.isPagado());
            ps.setFloat(3, ticket.getMonto());
            ps.setInt(4, ticket.getIdTicket());

            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al actualizar salida del ticket: " + e.getMessage());
            return false;
        }
    }

    public static boolean eliminarTicket(int idTicket) {
        String sql = "DELETE FROM Ticket WHERE idTicket = ?";
        
        try (Connection con = conexion_DB.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
             
            ps.setInt(1, idTicket);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al eliminar ticket: " + e.getMessage());
            return false;
        }
    }
}
