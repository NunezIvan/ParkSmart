package Main;

import java.io.*;

public class LoginLogica {

    private String username; // Variable para almacenar el nombre de usuario
    private String password; // Variable para almacenar la contraseña

    // Constructor por defecto
    public LoginLogica() {}

    // Constructor que inicializa el nombre de usuario y la contraseña
    public LoginLogica(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Métodos getters y setters
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Método para crear un archivo donde se guardarán los datos de los usuarios
    public void crearArchivo() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("DatosEmpleados.txt", true))) {
            // Archivo creado, se puede añadir contenido si es necesario
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }

    // Método para iniciar sesión con un usuario existente
public String logearUsuarioYObtenerCategoria(String usr, String pswd) {
        try (BufferedReader br = new BufferedReader(new FileReader("DatosEmpleados.txt"))) {
            String line;

            // Verifica usuario y contraseña
            while ((line = br.readLine()) != null) {
                String[] userData = line.split(","); // Divide la línea por comas

                if (userData.length >= 6) { // Asegúrate de que hay suficientes datos
                    String storedUsername = userData[2].trim(); // Toma el username
                    String storedPassword = userData[3].trim(); // Toma la contraseña
                    String categoria = userData[5].trim(); // Toma la categoría (Administrador o Empleado)

                    if (usr.equals(storedUsername) && pswd.equals(storedPassword)) {
                        return categoria; // Retorna la categoría si el usuario y la contraseña son correctos
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return null; // Si no coincide usuario y contraseña, retorna null
    }

    // Método para agregar un nuevo usuario
    public void agregarUsuario(String nombre, String apellido, String username, String password, String id, String categoria) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("DatosEmpleados.txt", true))) {
            // Escribe los datos en el archivo en el formato especificado
            bw.write(nombre + "," + apellido + "," + username + "," + password + "," + id + "," + categoria);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error al agregar el usuario: " + e.getMessage());
        }
    }
}