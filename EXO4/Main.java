package EXO4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gestion gestion = new Gestion();
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("Que voulez-vous faire ?");
            System.out.println("1 : Voir la liste des étudiants");
            System.out.println("2 : Ajouter un étudiant");
            System.out.println("3 : Supprimer un étudiant");
            System.out.println("4 : Quitter le programme");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // Pour consommer la nouvelle ligne après nextInt()

            switch (choix) {
                case 1:
                    gestion.afficherEtudiants();
                    break;
                case 2:
                    System.out.print("Entrez le nom de l'étudiant à ajouter : ");
                    String nom = scanner.nextLine();
                    gestion.ajouterEtudiant(nom);
                    break;
                case 3:
                    System.out.print("Entrez le nom de l'étudiant à supprimer : ");
                    String nomASupprimer = scanner.nextLine();
                    gestion.supprimerEtudiant(nomASupprimer);
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        } while (choix != 4);

        scanner.close();
    }
}

