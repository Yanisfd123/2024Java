package com.monprojet;

public class App {
    public static void main(String[] args) {
        Connexion connexion = new Connexion();
        GestionUtilisateur gestion = new GestionUtilisateur(connexion);

        gestion.addUtilisateur("Alice", "yanisfedd0@gmail.com", 1);
        gestion.addUtilisateur("Bob", "psgrecrut@gmail.com", 2);

        gestion.afficherUtilisateurs();

        connexion.close();
    }
}
