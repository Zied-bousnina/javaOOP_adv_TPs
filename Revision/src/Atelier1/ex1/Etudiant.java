package Atelier1.ex1;

import java.util.ArrayList;


public class Etudiant implements Statisticable{

    private  String matricule;
    private String nom;
    private ArrayList<Note> notes;




    public Etudiant(String matricule, String nom) {
        this.matricule = matricule;
        this.nom = nom;
        notes = new ArrayList<>();

    }
    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean addNotes(Note n) {

        return notes.add(n);

    }

    public ArrayList<Note> getL(){
        return notes;
    }
    @Override
    public float getValue() {
        float moy =0;

        for (Note n : notes) {
            moy+=n.getNote();

        }

        return moy/notes.size();

    }











}
