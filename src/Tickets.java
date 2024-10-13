
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Tickets {
    private final String historial = "historial.txt";

    public static void registrarTicketEntrada(String identificador ,String matricula, String propietario, char tipo, int piso, int columna, int fila, LocalDateTime horaEntrada){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("tickets.txt", true))){
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String linea = identificador + ";" + matricula + ";" + propietario + ";" + tipo + ";"+piso+";"+columna+";"+fila+";"+horaEntrada.format(formato);
            bw.write(linea);
            bw.newLine();
        } catch(IOException e){
            System.out.println("Ocurrió un error al escribir en el archivo" + e.getMessage());
        }
    }
    
    /*Para las funciones de cargar tickets es necesario que se devuelva los datos de LocalDateTime en un patrón especifico, leer el codigo registrarTicketEntrada
     * ahí se encuentra el formato, se crearon 2 archivos de tickets, uno de los autos que se encuentran en el estacionamiento y otro que se encuentra fuera, para facilitar 
     * la creación de codigo para las funcionalidades admin
     */

    public void regitrarTicketSalida(token ticket){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String lineaSalida = ticket.getIdentificador() +";"+ticket.getIngreso().format(formato)+";"+ticket.getSalida().format(formato)+";"+ticket.getMatricula()+";"+ticket.getTipos()+";"+ticket.getPiso()+";"+ticket.getColumna()+";"+ticket.getFila()+";"+ticket.getPago();

        try(BufferedWriter bwHistorial = new BufferedWriter(new FileWriter(historial,true))){
            bwHistorial.write(lineaSalida);
            bwHistorial.newLine();
        }catch(IOException e){
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

        String comparador = ticket.getIdentificador();
        traspasoTicket(comparador);
    }

    /*Funcion que recolecta todos las lineas del archivo tickets.txt dentro de una lista, elimina el contenido del archivo, compara los string con un comparador y elimina el string que tenga el identificador a comparar
     * luego vuelve a colocar el contenido de la lista en el archivo ticket.txt con el contenido ya borrado para seguir con el orden y no queden lineas vacías
     */
    public void traspasoTicket(String comparador){
        List<String> lineas = new ArrayList<>();
        
        try(BufferedReader br = new BufferedReader(new FileReader("tickets.txt"))){
            String linea;
            while((linea=br.readLine()) != null){
                lineas.add(linea);
            }
        }catch(IOException e){
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        /*Borra el contenido el archivo tickets.txt */
        try(FileWriter fw = new FileWriter("tickets.txt",false)){

        }catch(IOException e){
            System.out.println("Errror al vaciar el archivo" + e.getMessage());
        }

        Iterator<String> iterador = lineas.iterator();
        while(iterador.hasNext()){
            String actual = iterador.next();

            if(actual.startsWith(comparador)){
                iterador.remove();
                break;
            }
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("tickets.txt",true))){
            for(String linea:lineas){
                bw.write(linea);
                bw.newLine();
            }
        }catch(IOException e){
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

    }


    public static void imprimirTicketEntrada(String matricula, String propietario, char tipo, int piso, int columna, int fila, LocalDateTime horaEntrada){
        Menu_Usuario.limpiar_consola();
        System.out.println("Bienvenido " + propietario);
        System.out.println("Reciba su ticket");
        String identificador = token.genId();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatoHora = horaEntrada.format(formatter);

        String tipoVehiculo;
        switch(tipo){
            case 'c':
                tipoVehiculo = "Automovil";
                break;
            case 'm':
                tipoVehiculo = "Motocicleta";
                break;
            default:
                tipoVehiculo = "Desconocido";
                break;
        }

        System.out.println("=================================");
        System.out.println("          TICKET DE ENTRADA      ");
        System.out.println("=================================");
        System.out.println("ID: " + identificador);
        System.out.println("Matricula: " + matricula);
        System.out.println("Propietario: " + propietario);
        System.out.println("Tipo de vehiculo: "+tipoVehiculo);
        System.out.println("Ubicación: Piso " + piso + ", Columna" + columna + ", Fila " + fila);
        System.out.println("Hora de Entrada: " + formatoHora);
        System.out.println("=================================");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Presione Enter para confirmar la recepción del ticket");
        scanner.nextLine();
        registrarTicketEntrada(identificador, matricula, propietario, tipo, piso, columna, fila, horaEntrada);
        System.out.println("Ticket confirmado!");
        try{
            Thread.sleep(3000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        scanner.close();
    }
    public void Salida(){
        Scanner scanner = new Scanner(System.in);
        String codigo;
        token ticket;
        while(true){
            System.out.println("Ingrese el codigo de su ticket: ");
            codigo = scanner.nextLine();
            ticket = buscarTicket(codigo);
            if(ticket!= null){
                System.out.println("Ticket encontrado");
                LocalDateTime horaSalida = LocalDateTime.now();
                ticket.setSalida(horaSalida);
                int cuota = CalcularCuota(ticket.getIngreso(),ticket.getSalida());
                ticket.setPago(cuota);
                imprimirTicketSalida(ticket);
                regitrarTicketSalida(ticket);
                break;
            }else{
                System.out.println("Ticket no encontrado, ingrese nuevamente");
            }
        }
        scanner.close();
    }

    private token buscarTicket(String codigo){
        try(BufferedReader br = new BufferedReader(new FileReader("tickets.txt"))){
            String linea;
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            while((linea = br.readLine()) != null){
                String[] datos = linea.split(";");
                if(datos[0].equals(codigo)){
                    LocalDateTime ingreso = LocalDateTime.parse(datos[1],formato);
                    return new token(datos[0], ingreso, null, datos[2], datos[3].charAt(0),0, Integer.parseInt(datos[4]), Integer.parseInt(datos[5]),  Integer.parseInt(datos[6]));
                }
            }

        } catch(IOException e){
            System.out.println("Error al leer el archivo : " + e.getMessage());
        }
        return null;
    }

    public void imprimirTicketSalida(token ticket){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("=================================");
        System.out.println("          TICKET DE SALIDA       ");
        System.out.println("=================================");
        System.out.println("ID: " + ticket.getIdentificador());
        System.out.println("Matricula: " + ticket.getMatricula());
        System.out.println("Propietario: " + ticket.getIdentificador()); // Puedes añadir un atributo propietario si lo necesitas
        System.out.println("Hora de Entrada: " + ticket.getIngreso().format(formato));
        System.out.println("Hora de Salida: " + ticket.getSalida().format(formato));
        System.out.println("Cuota total: " + ticket.getPago() + " soles");
        System.out.println("=================================");
    }
        
    private int CalcularCuota(LocalDateTime horaEntrada, LocalDateTime horaSalida){
        Duration duracion = Duration.between(horaEntrada, horaSalida);

        double horas = duracion.toMinutes()/60;

        int horasRedondeadas = (int) Math.ceil(horas);
        
        int costoTotal = horasRedondeadas * 3;

        return costoTotal;
    }
}
