/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comptebancaire;

/**
 *
 * @author c.nadal
 */
public class CompteEpargne extends CompteBancaire {
 private   Float tauxInterets;
private Float montantPlafond;

/**
 * 
 * @param tauxInterets
 * @param montantPlafond
 * @param numeroCompte
 * @param soldeCompte
 * @param leClient 
 */
    public CompteEpargne(Float tauxInterets,Float montantPlafond, Integer numeroCompte, Float soldeCompte, Client leClient) {
        super(numeroCompte, soldeCompte, leClient);
        this.tauxInterets=tauxInterets;
        this.montantPlafond=montantPlafond;
    }


    
    
    public Float getTauxInterets() {
        return tauxInterets;
    }

    public void setTauxInterets(Float tauxInterets) {
        this.tauxInterets = tauxInterets;
    }
    
}
