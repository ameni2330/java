package tn.tuniprob.gestionmagasin;

import java.util.Date;

public class ProduitFruit extends ProduitAgricole{

    public ProduitFruit(int id, String libelle, Float quantite, String type, String saison) {
        super(id, libelle, quantite, type, saison);
    }

    public ProduitFruit() {
        super();
    }

}
