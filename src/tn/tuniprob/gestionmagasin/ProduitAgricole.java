package tn.tuniprob.gestionmagasin;

import java.util.Date;

public class ProduitAgricole extends Produit {
    String type, saison;

    public ProduitAgricole(String type, String saison) {
        this.type = type;
        this.saison = saison;
    }

    public ProduitAgricole(int id, String libelle, Float quantite, String type, String saison) {
        super(id, libelle, quantite);
        this.type = type;
        this.saison = saison;
    }

    public ProduitAgricole() {
        super();
    }


}
