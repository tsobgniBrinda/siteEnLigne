package com.projet.SiteEnLigne.modele;


import jakarta.persistence.*;

@Entity
@Table(name = "Panier")
public class Panier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long panier_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Utilisateur utilisateur;

}
