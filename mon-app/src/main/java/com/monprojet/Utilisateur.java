package com.monprojet;

public class Utilisateur {
    private String nom;
    private String email;
    private int id;

    public Utilisateur(String nom, String email, int id) {
        this.nom = nom;
        this.email = email;
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
}
