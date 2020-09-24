package classesTechniques;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author c.nadal
 */
public class BDD {

    private static String nomServeur = "10.0.10.129";
    private static String port = "3306";
    private static String nomBdd = "ppe";
    private static String chaineConnexion;

    private static String nomUtilisateur = "root";
    private static String motDePasse = "root";
    private static Connection connexion;

    private BDD() {
        //chaine de connexion
        BDD.chaineConnexion = "jdbc:mysql://" + BDD.nomServeur + ":" + BDD.port + "/" + BDD.nomBdd;
        try {
            if (BDD.connexion == null || BDD.connexion.isClosed()) //Création de la connexion à la BDD
            {
                try {
                    BDD.connexion = DriverManager.getConnection(BDD.chaineConnexion, BDD.nomUtilisateur, BDD.motDePasse);
                } catch (SQLException ex) {
                    Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static BDD getInstance() {
     

        
            return BDDHolder.INSTANCE;
      
        
    }

    private static class BDDHolder {

        private static final BDD INSTANCE = new BDD();
    }
    
    public  Integer requeteAction(String sql){
        
        
        try {
            Statement req=BDD.getInstance().connexion.createStatement();
            return req.executeUpdate(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return -1;
//        BDD.connexion.
    }
    
    
    
        public  ResultSet requeteSelection(String sql){
        
        
        try {
            Statement req=BDD.getInstance().connexion.createStatement();
            return req.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
//        BDD.connexion.
    }
}
