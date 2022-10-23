package tn.tuniprob.gestionmagasin;

import java.util.Date;

public class ProduitLegume extends ProduitAgricole {
    public ProduitLegume(){
        super();
    }
    public ProduitLegume(String type, String saison) {
        super(type, saison);
    }

    public ProduitLegume(int id, String libelle, String marque, Float quantite, String type, String saison) {
        super(id, libelle, marque, quantite, type, saison);
    }

}
