package com.projet.SiteEnLigne.modele;


import jakarta.persistence.*;

@Entity
@Table(name = "Produit")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long produit_id;

    private String nom;
    private String description;
    private double prix;
    private int stock;


}

