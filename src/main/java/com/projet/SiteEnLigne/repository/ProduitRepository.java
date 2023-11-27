package com.projet.SiteEnLigne.repository;

import com.projet.SiteEnLigne.modele.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
