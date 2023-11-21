package com.nba.tpwebservice.service;

import com.nba.tpwebservice.entity.ActionEntity;
import com.nba.tpwebservice.entity.JoueurEntity;
import com.nba.tpwebservice.entity.VJoueurSaisonEntity;
import com.nba.tpwebservice.repository.JoueurRepository;
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
    public List<VJoueurSaisonEntity> getAllState(){
        List<VJoueurSaisonEntity> joueurSaisonEntities = this.vJoueurSaisonRepository.findAll();
        // obtenir tous les joueurs d'une saison
        for (VJoueurSaisonEntity vj: joueurSaisonEntities) {
            vj.setJoueur(this.joueurRepository.getJoueurEntitiesByIdJoueur(vj.getIdJoueur()));

            vj.getJoueur().setHashMapState(this.joueurService.getStats(vj.getIdSaison(), vj.getIdJoueur()));
        }
        return joueurSaisonEntities;
    }
}
