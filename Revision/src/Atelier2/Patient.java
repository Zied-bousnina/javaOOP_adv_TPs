package Atelier2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Patient {

    private String nom;
    public Set<String> ordonnance;
    public Patient(String nom) {
        this.nom = nom;
        ordonnance = new HashSet<String>();


    }
    public String getNom() {
        return nom;
    }

    public boolean ordannceVide(){
        return ordonnance.isEmpty();

    }

    public void ajouterMedicament(String m){
        ordonnance.add(m);

    }

    public void affiche(){
        System.out.println("Nom du Patient :"+nom);
        for (String set:ordonnance){
            System.out.println(set);
        }

    }

    public boolean contientMedicament(String m){
        return ordonnance.contains(m);
    }

    public void trieOrdonnance(){
        Set<String> list = new TreeSet<>(ordonnance);


    }






}
