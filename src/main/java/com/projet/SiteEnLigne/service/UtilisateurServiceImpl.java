package com.projet.SiteEnLigne.service;

import com.projet.SiteEnLigne.modele.Utilisateur;
import com.projet.SiteEnLigne.repository.UtilisateurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UtilisateurServiceImpl implements UtilisateurService{

    private final UtilisateurRepository utilisateurRepository;


    @Override
    public Utilisateur creer(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public List<Utilisateur> lire() {
        return utilisateurRepository.findAll();
    }

    @Override
    public String supprimerUtilisateur(Long id) {
         utilisateurRepository.deleteById(id);
         return "Produit supprimé";
    }

    @Override
    public Utilisateur modifierUtilisateur(Long id, Utilisateur utilisateur) {
        return utilisateurRepository.findById(id).map(p -> {
            if (utilisateur.getNom() != null) {
                p.setNom(utilisateur.getNom());
            }
            if (utilisateur.getPrenom() != null) {
                p.setPrenom(utilisateur.getPrenom());
            }
            if (utilisateur.getEmail() != null) {
                p.setEmail(utilisateur.getEmail());
            }
            return utilisateurRepository.save(p);
        }).orElseThrow(() -> new RuntimeException("Utilisateur non trouvé avec l'ID : " + id));
    }

}
