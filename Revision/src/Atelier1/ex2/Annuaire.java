package Atelier1.ex2;

import java.util.HashMap;
import java.util.Map;

public class Annuaire {

    Map<String, Fiche> table = new HashMap<>();

    public void recherche(String nom){
        if (table.containsKey(nom)) {
            System.out.println(table.get(nom).getNom());
            System.out.println(table.get(nom).getNumero());
            System.out.println(table.get(nom).getAdresse());


        }
        else{
            System.out.println("Aucune fiche trouver sou le nom  :"+nom);

        }
        }

        public void insert(String nom, String adresse, String num){

            Fiche f1 = new Fiche(nom, adresse, num);
            table.put(nom, f1);

        }





}
