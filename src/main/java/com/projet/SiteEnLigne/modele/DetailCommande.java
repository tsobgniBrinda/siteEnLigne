package com.projet.SiteEnLigne.modele;


import jakarta.persistence.*;

@Entity
@Table(name = "DetailCommande")
public class DetailCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long detail_id;

    @ManyToOne
    @JoinColumn(name = "commande_id")
    private Commande commande;

    @ManyToOne
    @JoinColumn(name = "produit_id")
    private Produit produit;

    private int quantite;
    private double prix_unitaire;

}

