package tn.tuniprob.gestionmagasin;

public class Magasin {
    private int identifiant;
    private String adresse;
    private int capacite;
    private int test = 0;
    private Produit[] produits;
    Employee[] employees;


    public Magasin(int identifiant, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.capacite = 0;
        this.produits = new Produit[50];
        this.employees = new Employee[20];
    }


    public int getIdentifiant() {
        return identifiant;
    }

    public String getAdresse() {
        return adresse;
    }


    public void ajouterProduit(Produit p) {
        if (this.capacite < 50) {
            //Modifier la méthode « ajouterProduit » afin d’ajouter un produit donné une seule fois
            if (recherche(p)) {
                produits[this.capacite] = p;
                this.capacite++;
            }
        } else {
            System.out.print("tableau  .. ");
        }
    }

//    public void CalculStock() {
//    }

    //supprimer un produit du Magasin
    public void supprimer(Produit p) {
        int index = -1;
        for (int i = 0; i < this.capacite; i++) {
            if (compare(this.produits[i], p)) {
                index = i;
                break;
            }
            if (index == 49) {
                produits[index] = null;
            }
        }
        for (int i = 0; i < this.capacite; i++) {
            produits[i] = produits[i + 1];
        }
        capacite--;
        produits[capacite] = null;

    }
//    //comparer 2 magasin
//    public void compmagasin(Magasin m) {
//        int index = -1;
//        for (int i = 0; i < this.capacite; i++) {
//            if (compare(this.produits[i], p)) {
//                index = i;
//                break;
//            }
//            if (index == 49) {
//                produits[index] = null;
//            }
//        }
//        for (int i = 0; i < this.capacite; i++) {
//            produits[i] = produits[i + 1];
//        }
//        capacite--;
//        produits[capacite] = null;
//
//    }

    // comparer avec 2 paraetre
    public boolean compare(Produit p1, Produit p2) {
        return ((p1.id == p2.id) && (p1.libelle == p2.libelle) && (p1.prix == p2.prix));
    }


    //recherche
    public boolean recherche(Produit p) {
        boolean resultat = false;
        int i = 0;
        while ((resultat) || (i < capacite)) {
            resultat = compare(p, this.produits[i]);
            i++;
        }
        return resultat;
    }

    //ajout employee
    public void ajoutEmployee(Employee e) {
        int i;
        if (this.test < 20)
            this.employees[test] = e;
        test++;
    }


    @Override
    public String toString() {
        String str1 = "";
        str1 += "identifiant : " + this.identifiant + " \n";
        str1 += "adresse : " + this.adresse + " \n";
        str1 += "capacite : " + this.capacite + " \n";

        String str2 = "";
        for (int i = 0; i < this.capacite; i++) {
            str2 += this.produits[i] + " \n";
        }
        String emplye = "";
        for (int i = 0; i < this.test; i++) {
            emplye += this.employees[i] + " \n";
        }
        return str1 + str2 + emplye;
    }

//    @Override
//    public String toString() {
//        return "Magasin{" +
//                "identifiant=" + identifiant +
//                ", adresse='" + adresse + '\'' +
//                ", capacite=" + capacite +
//                ", produits=" + Arrays.toString(produits) +
//                ", employees=" + Arrays.toString(employees) +
//                '}';
//    }

    public void ajoutEmployee(Caissier c21, Vendeur v21, Vendeur v22, Vendeur v23, Responsable r21) {
    }
}
