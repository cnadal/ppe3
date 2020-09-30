/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comptebancaire;

import java.util.ArrayList;

/**
 *
 * @author c.nadal
 */
public class TestAppli {

    public static void main(String[] args) {
        CompteBancaire c1, c2, c3;

        Client client1, client2;
        client1 = new Client("Alan");
        client2 = new Client("Vivian");

        CompteCourant cc1 = new CompteCourant(true, 200f, 4f, 100001, 5f, client1);
        CompteCourant cc2 = new CompteCourant(true, 200f, 4f, 100002, 5f, client1);
        CompteCourant cc3 = new CompteCourant(true, 200f, 4f, 100003, 5f, client1);
        CompteCourant cc4 = new CompteCourant(true, 200f, 4f, 100004, 5f, client2);

        CompteEpargne ce1 = new CompteEpargne(5f, 25000f, 20001, 200f, client2);
        CompteEpargne ce2 = new CompteEpargne(5f, 15000f, 20002, 200f, client2);
        CompteEpargne ce3 = new CompteEpargne(5f, 35000f, 20003, 200f, client2);

        ArrayList<CompteBancaire> listeCompte = new ArrayList<CompteBancaire>();

        listeCompte.add(cc1);
        listeCompte.add(cc2);
        listeCompte.add(cc3);
        listeCompte.add(cc4);
        listeCompte.add(ce1);
        listeCompte.add(ce2);
        listeCompte.add(ce3);
        
        
        

    }
}
