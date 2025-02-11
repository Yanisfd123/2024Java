package EXO4;

import java.util.ArrayList;

public class Gestion {
    private ArrayList<Etudiant> etudiants;

    public Gestion() {
        etudiants = new ArrayList<>();
    }

    public void ajouterEtudiant(String nom) {
        Etudiant etudiant = new Etudiant(nom);
        etudiants.add(etudiant);
        System.out.println("Étudiant ajouté avec succès.");
    }

    public void supprimerEtudiant(String nom) {
        Etudiant etudiantASupprimer = null;
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getNom().equals(nom)) {
                etudiantASupprimer = etudiant;
                break;
            }
        }
        if (etudiantASupprimer != null) {
            etudiants.remove(etudiantASupprimer);
            System.out.println("Étudiant supprimé avec succès.");
        } else {
            System.out.println("Étudiant non trouvé.");
        }
    }

    public void afficherEtudiants() {
        if (etudiants.isEmpty()) {
            System.out.println("Aucun étudiant dans la liste.");
        } else {
            for (Etudiant etudiant : etudiants) {
                System.out.println(etudiant);
            }
        }
    }
}