package tn.tuniprob.gestionmagasin;

import java.util.Date;

public class Produit {
    int id, nb;
    String libelle;
    String marque;
    Float prix;
    Date date_expe;


    public Produit() {

    }

    public Produit(int id, String libelle, String marque) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
    }

    public Produit(int id, String libelle, String marque, Float prix) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;

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

    // comparer avec seul parametre
    public boolean comparer(Produit p) {
        return ((this.id == p.id) && (this.libelle == p.libelle) && (this.prix == p.prix));
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

