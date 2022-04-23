package Atelier1.ex1;

import java.util.Collections;


public class Stats {





    
    public Note MeilleurNote(Etudiant e){

        return Collections.max(e.getL());

    }

    public Note MoinsBonneNote(Etudiant e){

        return Collections.min(e.getL());


    }







}
