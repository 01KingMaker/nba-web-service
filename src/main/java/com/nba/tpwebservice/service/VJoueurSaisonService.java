package com.nba.tpwebservice.service;

import com.nba.tpwebservice.entity.VMatchJoueurEntity;
import com.nba.tpwebservice.entity.VActionParJoueurParSaisonEntity;
import com.nba.tpwebservice.entity.VJoueurSaisonEntity;
import com.nba.tpwebservice.repository.JoueurRepository;
import com.nba.tpwebservice.repository.VActionParJoueurParSaisonRepository;
import com.nba.tpwebservice.repository.VJoueurSaisonRepository;
import com.nba.tpwebservice.repository.VMatchJoueurRepository;
import com.nba.tpwebservice.specific.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
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
    @Autowired
    VMatchJoueurRepository vMatchJoueurRepository;
    public List<VJoueurSaisonEntity> getAllState(String idSaison){
        ApiResponse apiResponse = new ApiResponse();
        List<VJoueurSaisonEntity> joueurSaisonEntities = this.vJoueurSaisonRepository.findAll(); // tous les joueurs ayant joué
        List<VActionParJoueurParSaisonEntity> actionsSaison = this.vActionParJoueurParSaisonRepository
                .getVActionParJoueurParSaisonEntitiesByIdSaison(idSaison); // toutes actions de tous joueur
        for (VJoueurSaisonEntity vj: joueurSaisonEntities) {
            vj.setJoueur(this.joueurRepository.getJoueurEntitiesByIdJoueur(vj.getIdJoueur()));
            // obtenir le nombre de match joué du joueur
            VMatchJoueurEntity vMatchJoueurEntity = this.vMatchJoueurRepository.getVMatchJoueurEntityByIdJoueurAndIdSaison(vj.getJoueur().getIdJoueur(), idSaison);
            int nombre = 0;
            if(vMatchJoueurEntity == null){
                nombre = 0;
            }
            else {
                nombre = Integer.valueOf(String.valueOf(vMatchJoueurEntity.getNombre()));
            }
            vj.getJoueur().setNombreMatch(nombre);
            HashMap<String , Float> statistiques = this.joueurService.setStats(vj.getIdSaison(), vj.getIdJoueur(), actionsSaison, nombre);
            vj.getJoueur().setHashMapState(statistiques);
        }
        return joueurSaisonEntities;
    }

    public static void main(String[] args) {

    }
}
