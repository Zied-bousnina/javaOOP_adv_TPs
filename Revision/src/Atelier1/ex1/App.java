package Atelier1.ex1;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        Note n1 = new Note("math", 18);
        Note n2 = new Note("ENG", 10);
        Note n3 = new Note("PROG", 19);
        Note n4 = new Note("JAVA", 20);

        Stats s = new Stats();

        Etudiant e1 = new Etudiant("34567", "zied");
        e1.addNotes(n1);
        e1.addNotes(n2);
        e1.addNotes(n3);
        e1.addNotes(n4);
        Collections.sort(e1.getL());

        for (Note s1 : e1.getL()) {
            System.out.println(s1.getIntitule());
            System.out.println(s1.getNote());

        }

        System.out.println("Moyenne ----:");
        System.out.println(e1.getValue());
        System.out.println("-------------------MeilleurNote-----------------------------");

        System.out.println(s.MeilleurNote(e1).getIntitule());
        System.out.println(s.MeilleurNote(e1).getNote());
        System.out.println("-------------------MoinsBonneNote----------------------------");

        System.out.println(s.MoinsBonneNote(e1).getIntitule());
        System.out.println(s.MoinsBonneNote(e1).getNote());



    }
}
