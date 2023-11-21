package com.nba.tpwebservice.service;

import com.nba.tpwebservice.entity.ActionEntity;
import com.nba.tpwebservice.entity.VActionParJoueurParSaisonEntity;
import com.nba.tpwebservice.repository.ActionRepository;
import com.nba.tpwebservice.repository.VActionParJoueurParSaisonRepository;
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
    public HashMap<String, Integer> getStats(String idSaison, String idJoueur, List<VActionParJoueurParSaisonEntity> actionsSaison){
        List<ActionEntity> actions = this.actionRepository.findAll();
        HashMap<String, Integer> hashMapAction = new HashMap<>();
        for (ActionEntity action: actions) {
            hashMapAction.put(action.getNom(), this.getActionState(idSaison, idJoueur, action.getIdAction(), actionsSaison));
        }
        return hashMapAction;
    }

    public int getActionState(){
        return 0;
    }
    public int getActionState(String idSaison, String idJoueur, String idAction, List<VActionParJoueurParSaisonEntity> actions){
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
