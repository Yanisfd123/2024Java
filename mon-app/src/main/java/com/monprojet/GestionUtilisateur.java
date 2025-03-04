package com.monprojet;

import java.util.ArrayList;

public class GestionUtilisateur {
    private ArrayList<Utilisateur> listeUtilisateurs;
    private Connexion connexion;

    public GestionUtilisateur(Connexion connexion) {
        this.listeUtilisateurs = new ArrayList<>();
        this.connexion = connexion;
    }

    public void addUtilisateur(String nom, String email, int id) {
        Utilisateur utilisateur = new Utilisateur(nom, email, id);
        listeUtilisateurs.add(utilisateur);
        System.out.println("Utilisateur ajouté : " + utilisateur);
    }

    public void afficherUtilisateurs() {
        for (Utilisateur u : listeUtilisateurs) {
            System.out.println(u);
        }
    }
}
