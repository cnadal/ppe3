
import classesTechniques.BDD;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c.nadal
 */
public class TestDonnees {

    public TestDonnees() {
        
    }
    public static void main(String[] args) {
        
        //Test d'accès à la bdd
        System.out.println(BDD.getInstance().requeteAction("insert into categorie values(null,'categ') "));
        
        
        
        
    }
}
