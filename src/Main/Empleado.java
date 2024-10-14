package Main;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Empleado  {
    private static int contador = 0; // Contador de empleados
    private String apellido;
    private String nombre;
    private String nom_Usuario;
    private String contr_Usuario;
    private  String id_usuario;
    private String categoria;
    private Random random;
  public Empleado(String apellido, String nombre, String categoria) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.categoria = categoria; // Asegúrate de asignar la categoría aquí
        this.random = new Random(); // Inicializar el objeto Random
        this.nom_Usuario = generarUsername(); // Generar el nombre de usuario
        this.contr_Usuario = generarContrasenia(); // Generar la contraseña
        this.id_usuario = generarIdUsuario(); // Generar el ID de usuario
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNom_Usuario() {
        return nom_Usuario;
    }

    public String getContr_Usuario() {
        return contr_Usuario;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNom_Usuario(String nom_Usuario) {
        this.nom_Usuario = nom_Usuario;
    }

    public void setContr_Usuario(String contr_Usuario) {
        this.contr_Usuario = contr_Usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
   private String generarIdUsuario() {
        contador++; // Incrementar el contador
        return String.format("%05d", contador); // Formatear como número de 5 cifras
    }
    private String generarUsername() {
        String nombreCorto = nombre.length() >= 3 ? nombre.substring(0, 3).toLowerCase() : nombre.toLowerCase();
        return nombreCorto + apellido.toLowerCase(); // Combina nombre corto y apellido
    }

    private String generarContrasenia() {
        int numeroAleatorio = random.nextInt(10000); // Generar un número aleatorio de 4 cifras
        return nom_Usuario + "+" + String.format("%04d", numeroAleatorio); // Formatear a 4 cifras
    }
    public static void agregarEmpleado(Empleado empleado) {
           try (BufferedWriter writer = new BufferedWriter(new FileWriter("DatosEmpleados.txt", true))) {
               writer.write(empleado.toString());
               writer.newLine();
           } catch (IOException e) {
               e.printStackTrace();
           }
       }

       // 2. Read
        public static List<Empleado> leerEmpleados() {
            List<Empleado> empleados = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader("DatosEmpleados.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] data = line.split(",");
                    if (data.length == 6) {
                        // Crear un nuevo empleado sin generar un nuevo username o contraseña
                        Empleado empleado = new Empleado(data[0], data[1], data[5]);

                        // Asignar directamente el username, contraseña e ID desde el archivo
                        empleado.setNom_Usuario(data[2]);
                        empleado.setContr_Usuario(data[3]);
                        empleado.setId_usuario(data[4]);

                        empleados.add(empleado);
                        // Actualizar el contador para reflejar el mayor ID
                        contador = Math.max(contador, Integer.parseInt(data[4]));
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return empleados;
        }
       // 3. Update
       public static void actualizarEmpleado(String id_usuario, Empleado nuevoEmpleado) {
           List<Empleado> empleados = leerEmpleados();
           try (BufferedWriter writer = new BufferedWriter(new FileWriter("DatosEmpleados.txt"))) {
               for (Empleado empleado : empleados) {
                   if (empleado.getId_usuario().equals(id_usuario)) {
                       writer.write(nuevoEmpleado.toString());
                   } else {
                       writer.write(empleado.toString());
                   }
                   writer.newLine();
               }
           } catch (IOException e) {
               e.printStackTrace();
           }
       }

       // 4. Delete
       public static void eliminarEmpleado(String id_usuario) {
           List<Empleado> empleados = leerEmpleados();
           try (BufferedWriter writer = new BufferedWriter(new FileWriter("DatosEmpleados.txt"))) {
               for (Empleado empleado : empleados) {
                   if (!empleado.getId_usuario().equals(id_usuario)) {
                       writer.write(empleado.toString());
                       writer.newLine();
                   }
               }
           } catch (IOException e) {
               e.printStackTrace();
           }
       }

       @Override
       public String toString() {
           return apellido + "," + nombre + "," + nom_Usuario + "," + contr_Usuario + "," + id_usuario + "," + categoria;
       }

  
}
