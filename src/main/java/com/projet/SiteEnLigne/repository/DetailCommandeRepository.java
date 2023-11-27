package com.projet.SiteEnLigne.repository;

import com.projet.SiteEnLigne.modele.DetailCommande;
import com.projet.SiteEnLigne.modele.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailCommandeRepository extends JpaRepository<DetailCommande,Long> {
}
