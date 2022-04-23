package Atelier2;


import java.util.*;

public class DossierPharmacie{
private String nom;
private HashMap<String,Patient> patients;

public DossierPharmacie(String nom) {
    this.nom = nom;
    patients = new HashMap<String,Patient>();


}

public void nouveauPatient(String nom, String[]ord){
    Patient p = new Patient(nom);
    for (String o : ord) {
        p.ordonnance.add(o);
    }

    patients.put(nom, p);
}

public boolean ajouterMedicament(String nom, String m){

    boolean ok = false;
   for(Map.Entry p : patients.entrySet()){
       if (p.getKey() == nom){
           ok =true;
           ((Patient) p.getValue()).ajouterMedicament(m);
       }
   }
   return ok;
}


public void afficherPatient(String nom){
    boolean ok = false;

    for(Map.Entry p : patients.entrySet()){
        if (p.getKey() == nom) {
            ok = true;

           ((Patient)p.getKey()).affiche();
           break;

        }


    }
    if(!ok){
        System.out.println("Patient n'existe pas");
    }

}

public void affiche(){
    System.out.println("Nom du pharmacie :"+this.nom);

    // for(Map.Entry p : patients.entrySet()){

    //     ((Patient)p.getKey()).affiche();
    // }

    //OR-----------------------------------------------------
    for(Patient p : patients.values()){
        p.affiche();


    }
}


public Collection<String> affichePatientAvecMedicament(String m){
    Collection<String> collection = new ArrayList();


    // for(Map.Entry p:patients.entrySet()){
    //     if (((Patient)p.getValue()).contientMedicament(m)) {
    //         collection.add(((Patient)p.getValue()).getNom());

    //     }

    // }


    // OR ---------------------------------------
    for(Patient p:patients.values()){
        if (p.contientMedicament(m)) {
            collection.add(p.getNom());

        }

    }
    return collection;

}







}