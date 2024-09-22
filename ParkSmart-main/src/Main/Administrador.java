package Main;

import java.util.concurrent.ThreadLocalRandom;

public class Administrador {
    private String nom_Usuario;
    private String contr_Usuario;
    private final String id_usuario;

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

    public Administrador(String nom_Usuario, String contr_Usuario, String id_usuario) {
        this.nom_Usuario = nom_Usuario;
        this.contr_Usuario = contr_Usuario;
        this.id_usuario = id_usuario;
    }

    public Administrador(String nom_Usuario, String contr_Usuario) {
        this.nom_Usuario = nom_Usuario;
        this.contr_Usuario = contr_Usuario;
        this.id_usuario = generarID();
    }

    private String generarID() {
        String banco = "1234567890";
        StringBuilder cadena = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            int indiceAleatorio = numeroAleatorioRango(0, banco.length() - 1);
            char caracterAleatorio = banco.charAt(indiceAleatorio);
            cadena.append(caracterAleatorio);
        }
        return cadena.toString();
    }

    private int numeroAleatorioRango(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
}
