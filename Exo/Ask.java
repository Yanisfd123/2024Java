package Exo;
import java.util.Scanner;

public class Ask {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Création de l'objet Scanner

        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine(); // Lecture de la ligne saisie

        System.out.print("Entrez votre age : ");
        int age = 0;
        if (scanner.hasNextInt()) {
            age = scanner.nextInt();
        }
        else {
            System.out.println("Age pas correcte !");
            System.exit(0);
        }

        scanner.close(); // Fermeture du scanner

        System.out.println("Bonjour " + nom + " ! Vous avez " + age + " ans");

        if (age > 18) {
            System.out.println(" majeur !");
        } else {
            System.out.println(" mineur !");
        }

    }
}
