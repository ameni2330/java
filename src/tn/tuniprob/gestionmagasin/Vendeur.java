package tn.tuniprob.gestionmagasin;

public class Vendeur extends Employee {
    double tauxDeVente;

    public Vendeur(int id, String nom, String adresse, int nbr_heures, double tauxDeVente) {
        super(id, nom, adresse, nbr_heures);
        this.tauxDeVente = tauxDeVente;
    }
    public float vendsalaire() {
        int nb_sup  ;
        float salaire , salairef ;
         return (float) (450 * this.tauxDeVente);

    }
}
