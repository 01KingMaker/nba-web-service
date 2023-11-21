package com.nba.tpwebservice.service;

import com.nba.tpwebservice.entity.VMatchJoueurEntity;
import com.nba.tpwebservice.entity.VActionParJoueurParSaisonEntity;
import com.nba.tpwebservice.entity.VJoueurSaisonEntity;
import com.nba.tpwebservice.repository.JoueurRepository;
import com.nba.tpwebservice.repository.VActionParJoueurParSaisonRepository;
import com.nba.tpwebservice.repository.VJoueurSaisonRepository;
import com.nba.tpwebservice.repository.VMatchJoueurRepository;
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
    @Autowired
    VMatchJoueurRepository vMatchJoueurRepository;
    public List<VJoueurSaisonEntity> getAllState(String idSaison){
        List<VJoueurSaisonEntity> joueurSaisonEntities = this.vJoueurSaisonRepository.findAll();
        List<VActionParJoueurParSaisonEntity> actionsSaison = this.vActionParJoueurParSaisonRepository.getVActionParJoueurParSaisonEntitiesByIdSaison(idSaison);
        for (VJoueurSaisonEntity vj: joueurSaisonEntities) {
            vj.setJoueur(this.joueurRepository.getJoueurEntitiesByIdJoueur(vj.getIdJoueur()));
            VMatchJoueurEntity vMatchJoueurEntity = this.vMatchJoueurRepository.getVMatchJoueurEntityByIdJoueurAndIdSaison(vj.getJoueur().getIdJoueur(), idSaison);

            int nombre = Integer.valueOf(String.valueOf(vMatchJoueurEntity.getNombre()));
            vj.getJoueur().setNombreMatch(nombre);
            vj.getJoueur().setHashMapState(this.joueurService.getStats(vj.getIdSaison(), vj.getIdJoueur(), actionsSaison, nombre));
        }
        return joueurSaisonEntities;
    }

    public static void main(String[] args) {

    }
}
