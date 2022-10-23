package tn.tuniprob.gestionmagasin;

import java.util.Date;

public class Produit {
    int id, nb;
    String libelle;
    String marque;
    Float prix, quantite;
    String type;
    Date date_expe;


    public Produit() {
    }

    public Produit(int id, String libelle, Float quantite, String marque, Float prix, Date date_expe) {
        this.id = id;
        this.type = type;
        this.libelle = libelle;
        this.quantite = quantite;
        this.marque = marque;
        this.prix = prix;
        this.date_expe = date_expe;
    }

    public Produit(int id, String libelle, String marque, Float prix, Date date_expe) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        this.date_expe = date_expe;
        if (prix >= 0) {
            System.out.println(prix + " est un nombre positif");
        }
    }

    public Produit(int id, String libelle, Float quantite) {
        this.id = id;
        this.libelle = libelle;
        this.quantite = quantite;
    }

    // comparer avec seul parametre
    public boolean comparer(Produit p) {
        return ((this.id == p.id) && (this.libelle == p.libelle) && (this.prix == p.prix));
    }

    public String determinerTypeProduit() {
        if (this instanceof ProduitFruit) {
            return "c une fruit";
        }
        if (this instanceof ProduitLegume)
        {
            return "c une legume";
        }
        return "autres";
    }

    public void afficher() {
        System.out.println(" id = " + id + "\n libelle = " + libelle + "\n marque =" + marque + "\n prix =" + prix + "\n  ");
    }


    @Override
    public String toString() {
        return
                "id=" + id +
                        ", libelle='" + libelle + '\'' +
                        ", marque='" + marque + '\'' +
                        ", prix=" + prix +
                        ", date_expe=" + date_expe +
                        '}';
    }


}

