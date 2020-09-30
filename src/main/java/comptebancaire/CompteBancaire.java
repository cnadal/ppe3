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
public class CompteBancaire {

    protected Integer numeroCompte;
    protected Float soldeCompte;
    protected Client leClient;

    public CompteBancaire() {
    }
/**
 * 
 * @param numeroCompte
 * @param soldeCompte
 * @param leClient 
 */
    public CompteBancaire(Integer numeroCompte, Float soldeCompte, Client leClient) {
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
        this.leClient = leClient;
    }

    public Float getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(Float soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    public Integer getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(Integer numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

}
