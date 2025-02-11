package Voituree;

public class Voiture {
    public static String[] colorAutorized;
    public String marque;
    public String modele;
    public String couleur;

    public Voiture() {}

    public Voiture(String string, String string2, String string3) {
        //TODO Auto-generated constructor stub
    }

    // Méthodes
    public void demarrer() {
        System.out.println("La voiture démarre");
    }
	
	public void accelerer() {
        System.out.println("La voiture accelère");
    }

    public void freiner() {
        System.out.println("La voiture freine");
    }

    public String getMarque() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMarque'");
    }

    public String getModele() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getModele'");
    }

    public String getCouleur() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCouleur'");
    }
}
