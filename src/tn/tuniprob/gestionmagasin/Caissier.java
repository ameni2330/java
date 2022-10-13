package tn.tuniprob.gestionmagasin;

public class Caissier extends Employee {
    int numeroDeCaisse ;

    public Caissier(int id, String nom, String adresse, int nbr_heures, int numeroDeCaisse) {
        super(id, nom, adresse, nbr_heures);
        this.numeroDeCaisse = numeroDeCaisse;
    }
    public float caissalaire() {
        int nb_sup  ;
        float salaire , salairef ;
        salaire = 5 * nbr_heures ;
        if (nbr_heures > 180) {
            return (float) (salaire+((nbr_heures-160)*(salaire*0.15)));
        }
        else
        {
            return salaire;
        }
    }
}
