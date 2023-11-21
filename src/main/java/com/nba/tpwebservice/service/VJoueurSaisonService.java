package com.nba.tpwebservice.service;

import com.nba.tpwebservice.entity.ActionEntity;
import com.nba.tpwebservice.entity.JoueurEntity;
import com.nba.tpwebservice.entity.VActionParJoueurParSaisonEntity;
import com.nba.tpwebservice.entity.VJoueurSaisonEntity;
import com.nba.tpwebservice.repository.JoueurRepository;
import com.nba.tpwebservice.repository.VActionParJoueurParSaisonRepository;
import com.nba.tpwebservice.repository.VJoueurSaisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VJoueurSaisonService {
    @Autowired
    VJoueurSaisonRepository vJoueurSaisonRepository;
    @Autowired
    ActionService actionService;
    @Autowired
    JoueurRepository joueurRepository;
    @Autowired
    JoueurService joueurService;
    @Autowired
    VActionParJoueurParSaisonRepository vActionParJoueurParSaisonRepository;
    public List<VJoueurSaisonEntity> getAllState(String idSaison){
        List<VJoueurSaisonEntity> joueurSaisonEntities = this.vJoueurSaisonRepository.findAll();

        List<VActionParJoueurParSaisonEntity> actionsSaison = this.vActionParJoueurParSaisonRepository.getVActionParJoueurParSaisonEntitiesByIdSaison(idSaison);
        // obtenir tous les joueurs d'une saison
        for (VJoueurSaisonEntity vj: joueurSaisonEntities) {
            vj.setJoueur(this.joueurRepository.getJoueurEntitiesByIdJoueur(vj.getIdJoueur()));

            vj.getJoueur().setHashMapState(this.joueurService.getStats(vj.getIdSaison(), vj.getIdJoueur(), actionsSaison));
        }
        return joueurSaisonEntities;
    }
}
