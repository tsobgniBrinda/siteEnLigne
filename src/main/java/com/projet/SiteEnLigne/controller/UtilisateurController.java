package com.projet.SiteEnLigne.controller;


import com.projet.SiteEnLigne.modele.Utilisateur;
import com.projet.SiteEnLigne.service.UtilisateurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utilisateur")
@AllArgsConstructor
public class UtilisateurController {
    private final UtilisateurService utilisateurService;

    @PostMapping("/create")
    public Utilisateur createUtilisateur(@RequestBody Utilisateur utilisateur){
        return utilisateurService.creer(utilisateur);
    }
    @GetMapping("")
    public List<Utilisateur> users(){
        return utilisateurService.lire();
    }

    @PutMapping("/update/{id}")
    public Utilisateur update (@PathVariable Long id, @RequestBody Utilisateur utilisateur){
        return utilisateurService.modifierUtilisateur(id, utilisateur);
    }

    @DeleteMapping("/delete/{id}")
    public String delete (@PathVariable Long id){
        return utilisateurService.supprimerUtilisateur(id);
    }


}
