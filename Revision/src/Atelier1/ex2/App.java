package Atelier1.ex2;

import java.util.Scanner;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {

        Annuaire a1 = new Annuaire();




        Scanner sc = new Scanner(System.in);
        String choix;



        do {
            System.out.println("--Menu-------------------------");
            System.out.println("--> ?nom : recherche et affiche la fiche concernant le nom indiqué :");
            System.out.println("--> +nom :  saisie des autres informations d\'une fiche associée à ce nom  :");
            System.out.println("--> ! :  saisie des autres informations d\'une fiche associée à ce nom");
            System.out.println("--> . : Exit");
             choix = sc.nextLine();

             switch (choix.charAt(0)) {
                 case '?' :
                 a1.recherche(choix.substring(1));


                     break;

                 case '+':{
                     if (!a1.table.containsKey(choix.substring(1))){

                        System.out.println("1 -> ajouter l'adresse :");
                        String adresse = sc.nextLine();
                        System.out.println("1 -> ajouter le numero du tel :");
                        String num = sc.nextLine();
                        a1.insert(choix.substring(1), adresse, num);
                     }
                     else{
                         System.out.println("Nom deja Exist : !");
                     }
                 }
                    break;
                 case '!':{
                      System.out.println("-----------------------Fiche Trier----------------------------------------------");
                    TreeMap<String, Fiche> treemap = new TreeMap<>(a1.table);
                     for (Fiche f1 : treemap.values()) {
                         System.out.println(f1.getNom());
                         System.out.println(f1.getNumero());
                         System.out.println(f1.getAdresse());
                         System.out.println("-------------");

                     }
                     System.out.println("------------------------Fiche Non Trier---------------------------------------------");
                     for (Fiche f1 : a1.table.values()) {
                        System.out.println(f1.getNom());
                        System.out.println(f1.getNumero());
                        System.out.println(f1.getAdresse());

                    }

                 }
                   break;

                   case '.':

                   System.out.println("Good bye !");
                   break;
                 default:
                     break;
             }

        } while (choix.charAt(0) !='.');



    }

}
