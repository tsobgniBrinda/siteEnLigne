package com.projet.SiteEnLigne.modele;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Commande")
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commande_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Utilisateur utilisateur;

    private Date date_commande;
    private String statut;


}

