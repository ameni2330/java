package tn.tuniprob.gestionmagasin;

public class Tp0 {
    public static void main(String[] args) {
        // creation d'un produit vide
//        Produit p1 = new Produit();
//        Produit p2 = new Produit(1021, "lait", "delice");
//        Produit p3 = new Produit(2510, "Yaourt", "vitalait");
//        Produit p4 = new Produit(3250, "tomate", "sicam", 1.2f);
        ProduitAgricole p1, p2, p3, p4;
        p1 = new ProduitAgricole(1254, "Fraise", 12.6f, "Fruit", "Mars");
        p2 = new ProduitFruit(1224, "Pasteque", 50f, "Fruit", "Juin");
        p3 = new ProduitFruit(1224, "Mandarine", 25.6f, "Fruit", "December");
        p4 = new ProduitFruit(1224, "Artichats", 14f, "Legumes", "Janvier");

        Magasin prop5 = new Magasin(2, "esprit");
        prop5.ajouterProduit(p1);
        prop5.ajouterProduit(p2);
        prop5.ajouterProduit(p3);
        prop5.ajouterProduit(p4);

        //magasin1
        Caissier c11 = new Caissier(101, "carrefour", "centre ville", 40, 10);
        Caissier c12 = new Caissier(102, "carrefour", "centre ville", 40, 20);
        Vendeur v11 = new Vendeur(103, "carrefour", "centre ville", 40, 30);

        //magasin2
        Caissier c21 = new Caissier(1, "monoprix", "manzah 6", 40, 10);
        Vendeur v21 = new Vendeur(2, "monoprix", "manzah 6", 40, 0.05);
        Vendeur v22 = new Vendeur(3, "monoprix", "manzah 6", 40, 0.03);
        Vendeur v23 = new Vendeur(4, "monoprix", "manzah 6", 40, 0.04);
        Responsable r21 = new Responsable(5, "monoprix", "manzah 6", 40, 1200.500f);
//        p2.prix = 0.7f;
//
//
//
////        p1.afficher();
////
////        System.out.println("*************");
////
////        p2.afficher();
////        System.out.println("*************");
////
////        p3.afficher();
////          System.out.println("*************");
////
////        p4.afficher();
//          System.out.println("*************");
//        System.out.println( p1.toString());
//
//

//        Magasin aziza = new Magasin(3, "ESPRIT ");
//        aziza.ajouterProduit(p4);
//        aziza.ajouterProduit(p3);
//        aziza.ajouterProduit(p2);
//        aziza.ajouterProduit(new Produit(2, "tomate", "tomate"));
//        System.out.println(aziza.toString());


        Magasin carrefour = new Magasin(1, "manzah 6 ");
        carrefour.ajoutEmployee(c11);
        carrefour.ajoutEmployee(c12);
        carrefour.ajoutEmployee(v11);
        System.out.println(carrefour.toString());


        Magasin monoprix = new Magasin(2, "centre ville ");
        monoprix.ajoutEmployee(c21);
        monoprix.ajoutEmployee(v21);
        monoprix.ajoutEmployee(v22);
        monoprix.ajoutEmployee(v23);
        monoprix.ajoutEmployee(r21);
        System.out.println(monoprix);


    }


}