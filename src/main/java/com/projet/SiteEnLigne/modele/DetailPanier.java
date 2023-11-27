package com.projet.SiteEnLigne.modele;
import jakarta.persistence.*;


@Entity
@Table(name = "DetailPanier")
public class DetailPanier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long detail_panier_id;

    @ManyToOne
    @JoinColumn(name = "panier_id")
    private Panier panier;

    @ManyToOne
    @JoinColumn(name = "produit_id")
    private Produit produit;

    private int quantite;


}
