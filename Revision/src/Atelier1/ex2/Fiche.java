package Atelier1.ex2;

public class Fiche {
    private String nom, Adresse;
    private String Numero;
    public Fiche(String nom, String adresse, String numero) {
        this.nom = nom;
        Adresse = adresse;
        Numero = numero;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getAdresse() {
        return Adresse;
    }
    public void setAdresse(String adresse) {
        Adresse = adresse;
    }
    public String getNumero() {
        return Numero;
    }
    public void setNumero(String numero) {
        Numero = numero;
    }






}
