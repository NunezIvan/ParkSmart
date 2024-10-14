
import java.time.LocalDateTime;
import java.util.Random;

public class token {
    
    private String identificador; 
    private LocalDateTime ingreso;
    private LocalDateTime salida;
    private String usuario;
    private String matricula;
    private char tipo;
    private int pago;
    private int columna, fila, piso;

    /*Zona de constructures */
    public String getIdentificador(){
        return this.identificador;
    }

    public String getUsuario(){
        return this.usuario;
    }

    public int getColumna(){
        return this.columna;
    }

    public int getFila(){
        return this.fila;
    }

    public int getPiso(){
        return this.piso;
    }

    public LocalDateTime getIngreso(){
        return this.ingreso;
    }

    public LocalDateTime getSalida(){
        return this.salida;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public char getTipos(){
        return this.tipo;
    }

    public int getPago(){
        return this.pago;
    }
    
    public void setId(String identificador){
        this.identificador = identificador;
    }

    public void setIngreso(LocalDateTime ingreso){
        this.ingreso = ingreso;
    }

    public void setSalida(LocalDateTime salida){
        this.salida = salida;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public void setTipo (char tipo){
        this.tipo = tipo;
    }

    public void setPago(int pago){
        this.pago = pago;
    }

    public void setColumna(int columna){
        this.columna = columna;
    }

    public void setFila(int fila){
        this.fila = fila;
    }

    public void setPiso(int piso){
        this.piso = piso;
    }

    public token(String identificador, LocalDateTime ingreso, LocalDateTime salida, String matricula, char tipo, int pago, int columna, int fila, int piso){
        this.identificador = genId();
        this.ingreso = ingreso;
        this.salida = null;
        this.matricula = matricula;
        this.tipo = tipo;
        this.pago = pago;
        this.columna = columna;
        this.fila = fila;
        this.piso = piso;
    }

    public static String genId(){
        Random random = new Random();
        StringBuilder codigo = new StringBuilder();
        for (int i = 0; i < 10; i++){
            int numero = random.nextInt(10);
            codigo.append(numero);
        }
        return codigo.toString();
    }
    

}