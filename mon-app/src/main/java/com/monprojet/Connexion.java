package com.monprojet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
    private Connection connexion;

    public Connexion() {
        try {
            String url = "jdbc:mysql://localhost:3306/ma_base";
            String user = "root";
            String password = "";
            connexion = DriverManager.getConnection(url, user, password);
            System.out.println("Connexion réussie !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnexion() {
        return connexion;
    }

    public void close() {
        try {
            if (connexion != null) {
                connexion.close();
                System.out.println("Connexion fermée.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
