package classesMetiers;

import classesTechniques.BDD;
import entites.Personnel;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class PersonnelDAO {

    public int ajouter(String nom, String prenom,Integer id_profil) {
        return BDD.getInstance().requeteAction("insert into personnel (nom,prenom,id_profil)values('" + nom + "','" + prenom + "',"+id_profil+")");
    }

    public String obtenir() {
         ResultSet rsPersonnel= BDD.getInstance().requeteSelection("select * from personnel");
         String resultat="";
        try {
            while( rsPersonnel.next()){
                resultat += rsPersonnel.getString(1)+rsPersonnel.getString(2)+"\n";             
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonnelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultat;
    }
    public ResultSet obtenir(int idPersonnel) {
        return BDD.getInstance().requeteSelection("select * from personnel where id="+idPersonnel);
    }

    public String obtenirTexte(){
        if(this.obtenir()==null){
            
        }
        return "";
    }
    
    
    public static void main(String[] args) {
        PersonnelDAO pDAO=new PersonnelDAO();
        pDAO.ajouter("nadal", "lili",1);
                pDAO.ajouter("nadal", "lala",1);
        pDAO.ajouter("nadal", "lolo",2);

                System.out.println(pDAO.obtenir());
        
    }
}
