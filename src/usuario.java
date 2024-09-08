import java.util.concurrent.ThreadLocalRandom;

public class usuario {
    private String nom_Usuario, contr_Usuario;
    private String id_usuario;

    public String getNom_Usuario() {
        return this.nom_Usuario;
    }
    public void setNom_Usuario(String nom_Usuario) {
        this.nom_Usuario = nom_Usuario;
    }
    public String getContr_Usuario() {
        return this.contr_Usuario;
    }
    public void setContr_Usuario(String contr_Usuario) {
        this.contr_Usuario = contr_Usuario;
    }
    public String getId_usuario() {
        return this.id_usuario;
    }
    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }


    public usuario(String nom_Usuario, String contr_Usuario, String id_usuario){
        this.nom_Usuario = nom_Usuario;
        this.contr_Usuario = contr_Usuario;
        this.id_usuario = id_usuario;
    }


    public usuario(String nom_Usuario, String contr_Usuario){
        this.nom_Usuario = nom_Usuario;
        this.contr_Usuario = contr_Usuario;
        this.id_usuario = generarID();
    }

    private String generarID(){
        String banco = "1234567890";
        String cadena = "";
        for(int i=0; i<9; i++){
            int indiceAleatorio = numeroAleatorioRango(0, banco.length()-1);
            char caracterAleatorio = banco.charAt(indiceAleatorio);
            cadena += caracterAleatorio;
        }
        return cadena;
    }
    private int numeroAleatorioRango(int minimo, int maximo){
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
    
}
