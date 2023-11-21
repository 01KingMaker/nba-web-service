package com.nba.tpwebservice.service;

import com.nba.tpwebservice.entity.ActionEntity;
import com.nba.tpwebservice.entity.VActionParJoueurParSaisonEntity;
import com.nba.tpwebservice.repository.ActionRepository;
import com.nba.tpwebservice.repository.VActionParJoueurParSaisonRepository;
import com.nba.tpwebservice.repository.VMatchJoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class JoueurService {

    @Autowired
    VActionParJoueurParSaisonService vActionParJoueurParSaisonService;
    @Autowired
    ActionService actionService;
    @Autowired
    ActionRepository actionRepository;
    @Autowired
    VActionParJoueurParSaisonRepository vActionParJoueurParSaisonRepository;
    @Autowired
    VMatchJoueurRepository vMatchJoueurRepository;
    public HashMap<String, Float> getStats(String idSaison, String idJoueur, List<VActionParJoueurParSaisonEntity> actionsSaison, int nombre){
        List<ActionEntity> actions = this.actionRepository.findAll();
        HashMap<String, Float> hashMapAction = new HashMap<>();
        System.out.println("saison "+idSaison+" joueur"+idJoueur);

        hashMapAction.put("match", (float) nombre);
        for (ActionEntity action: actions) {
            hashMapAction.put(action.getNom(), (this.getActionState(idSaison, idJoueur, action.getIdAction(), actionsSaison)/nombre));
        }
        return hashMapAction;
    }

    public int getActionState(){
        return 0;
    }
    public float getActionState(String idSaison, String idJoueur, String idAction, List<VActionParJoueurParSaisonEntity> actions){
        int retour = 0;
        for (VActionParJoueurParSaisonEntity action:
             actions) {
            if(action.getIdJoueur().equals(idJoueur)){
                if(action.getIdAction().equals(idAction)){
                    retour += 1;
                }
            }

        }
        return retour;
    }

}
