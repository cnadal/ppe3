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
public class CompteCourant extends CompteBancaire {

    private Boolean autoriseDecouvert;
    private Float montantDecouvertAutorisé;
    private Float tauxAgios;

    /**
     * Permet de créer un compte courant
     * @param autoriseDecouvert
     * @param montantDecouvertAutorisé
     * @param tauxAgios
     * @param numeroCompte
     * @param soldeCompte
     * @param leClient
     */
    public CompteCourant(Boolean autoriseDecouvert, Float montantDecouvertAutorisé, Float tauxAgios, Integer numeroCompte, Float soldeCompte, Client leClient) {
        super(numeroCompte, soldeCompte, leClient);
        this.autoriseDecouvert = autoriseDecouvert;
        this.montantDecouvertAutorisé = montantDecouvertAutorisé;
        this.tauxAgios = tauxAgios;

    }

    
    
}
