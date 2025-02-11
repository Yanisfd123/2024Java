package EXO6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Fichier {
    public static void main(String[]args){
        try{
            File fichier = new File("EXO6/liste.txt");
            Scanner lecteur = new Scanner(fichier);
            while (lecteur.hasNextLine()) {
                String ligne = lecteur.nextLine();
                System.out.println(ligne);

                
            } 
            lecteur.close();

        }catch(FileNotFoundException e ){
            System.out.println("Fichier introuvable!§!");
        }

        try{
            FileWriter ecrivain = new FileWriter("EXO6/liste.txt", append:true);
            ecrivain.write("\n yaniss");
            ecrivain.close();
            System.out.println("Ecriture termine");


        }catch(IOException e ){
            System.out.println("Erreure de l ecriture du fichier");
        }
    }
  
    

   
    
}
 