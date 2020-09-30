/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comptebancaire;

import java.util.ArrayList;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

/**
 *
 * @author c.nadal
 */
public class Client {

    String nom;

    ArrayList<CompteBancaire> lesComptesBancaires;

    public Client() {
        lesComptesBancaires = new ArrayList<CompteBancaire>();
    }

    /**
     *
     * @param nom
     */
    public Client(String nom) {
        lesComptesBancaires = new ArrayList<CompteBancaire>();
        this.nom = nom;
    }

}
