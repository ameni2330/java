package tn.tuniprob.gestionmagasin;

public class Responsable extends Employee {
    Float prime;

    public Responsable(int id, String nom, String adresse, int nbr_heures, Float prime) {
        super(id, nom, adresse, nbr_heures);
        this.prime = prime;
    }

    public float respsalaire() {
        int nb_sup  ;
        float salaire , salairef ;
        salaire = 10 * nbr_heures + this.prime;
        if (nbr_heures > 160) {
            return (float) (salaire+((nbr_heures-160)*(salaire*0.2)));
        }
        else
        {
            return salaire;
        }
    }
}
