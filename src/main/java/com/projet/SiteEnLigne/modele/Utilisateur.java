package com.projet.SiteEnLigne.modele;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Utilisateur")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    private String nom;
    private String prenom;
    private String email;
    private String mot_de_passe;
    private String role;

}
