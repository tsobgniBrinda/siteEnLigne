package com.projet.SiteEnLigne.service;

import com.projet.SiteEnLigne.modele.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    Utilisateur creer(Utilisateur utilisateur);
    List<Utilisateur> lire();
    String supprimerUtilisateur(Long id);
    Utilisateur modifierUtilisateur(Long id, Utilisateur utilisateur);

}

