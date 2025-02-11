package Voituree;

public class Main {
    public static void main(String[] args) {
        Voiture voiture = new Voiture();
        voiture.marque = "benz";
        voiture.modele = "s560";
        voiture.couleur = "noir";

        voiture.demarrer();
    }
}
