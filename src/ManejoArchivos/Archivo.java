package ManejoArchivos;

import Modelo.Vehiculo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.*;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class Archivo {

    // Usar el mismo formato de fecha para leer y escribir
    private static final DateTimeFormatter FORMATO_FECHA_HORA = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss[.SSSSSSSSS]");

    public boolean comprobarExistencia(String nombreRecurso) {
        File archivo = new File(nombreRecurso);
        return archivo.exists();
    }

    public List<Vehiculo> listar(String nombreRecurso) {
        File archivo = new File(nombreRecurso);
        List<Vehiculo> vehiculos = new ArrayList<>();

        try (FileReader lector = new FileReader(archivo); BufferedReader lectura = new BufferedReader(lector)) {
            String contenido;

            while ((contenido = lectura.readLine()) != null) {
                contenido = contenido.trim(); 
                if (contenido.isEmpty()) {
                    continue; 
                }

                String[] datos = contenido.split(";");

                // Validar si la línea tiene el número correcto de datos
                if (datos.length < 6) {
                    System.out.println("Línea ignorada por datos incompletos: " + contenido);
                    continue;
                }

                String matricula = datos[0];
                char tipo = datos[1].charAt(0);
                int fila = Integer.parseInt(datos[2]);
                int columna = Integer.parseInt(datos[3]);

                // Intenta leer la fecha con fracción de segundos
                LocalDateTime horaEntrada;
                try {
                    horaEntrada = LocalDateTime.parse(datos[4], FORMATO_FECHA_HORA);
                } catch (DateTimeParseException e) {
                    horaEntrada = LocalDateTime.parse(datos[4], DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
                }

                LocalDateTime horaSalida = datos[5].equals("null") ? null : LocalDateTime.parse(datos[5], FORMATO_FECHA_HORA);

                Vehiculo vehiculo = new Vehiculo(matricula, tipo, fila, columna, horaEntrada, horaSalida);
                vehiculos.add(vehiculo);
            }
        } catch (IOException excepcion) {
            excepcion.printStackTrace(System.out);
        } catch (NumberFormatException excepcion) {
            excepcion.printStackTrace(System.out);
        }

        return vehiculos;
    }

    public void escribir(Vehiculo vehiculo, String nombreRecurso, boolean anexar) {
        File archivo = new File(nombreRecurso);

        try (PrintWriter escritura = new PrintWriter(new FileWriter(archivo, anexar))) {
            escritura.println(vehiculo.toString());
        } catch (IOException excepcion) {
            excepcion.printStackTrace(System.out);
        }
    }

    public Vehiculo buscarPorMatricula(String buscar, String nombreRecurso) {
        File archivo = new File(nombreRecurso);
        Vehiculo resultado = null;

        try (BufferedReader entrada = new BufferedReader(new FileReader(archivo))) {
            String contenido;

            while ((contenido = entrada.readLine()) != null) {
                contenido = contenido.trim(); // Eliminar espacios en blanco
                if (contenido.isEmpty()) {
                    continue; // Ignorar líneas vacías
                }

                String[] datos = contenido.split(";");

                // Validar si la línea tiene el número correcto de datos
                if (datos.length < 6) {
                    System.out.println("Línea ignorada por datos incompletos: " + contenido);
                    continue; 
                }

                String matricula = datos[0];
                char tipo = datos[1].charAt(0);
                int fila = Integer.parseInt(datos[2]);
                int columna = Integer.parseInt(datos[3]);
                LocalDateTime horaEntrada = LocalDateTime.parse(datos[4], FORMATO_FECHA_HORA); 
                LocalDateTime horaSalida = datos[5].equals("null") ? null : LocalDateTime.parse(datos[5], FORMATO_FECHA_HORA);

                Vehiculo vehiculo = new Vehiculo(matricula, tipo, fila, columna, horaEntrada, horaSalida);
                if (matricula.equalsIgnoreCase(buscar)) {
                    return vehiculo;
                }
            }
        } catch (IOException excepcion) {
            excepcion.printStackTrace(System.out);
        }
        return null;
    }
    
    public void crearArchivo(String nombreRecurso) {
        File archivo = new File(nombreRecurso);
        
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
        } catch (IOException exepcion) {
            exepcion.printStackTrace(System.out);
        }
    }
}
