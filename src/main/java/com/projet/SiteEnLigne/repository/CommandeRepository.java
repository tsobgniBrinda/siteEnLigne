package com.projet.SiteEnLigne.repository;

import com.projet.SiteEnLigne.modele.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande,Long> {
}
