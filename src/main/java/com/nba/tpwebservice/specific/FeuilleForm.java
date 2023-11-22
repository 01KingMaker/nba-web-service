package com.nba.tpwebservice.specific;

import com.nba.tpwebservice.entity.FeuilleMatchEntity;
import lombok.Getter;
import lombok.Setter;

public class FeuilleForm {
    @Getter
    @Setter
    public String id_feuille_match;
    @Getter
    @Setter
    public String id_match;
    @Getter
    @Setter
    public String id_equipe_joueur;
    public FeuilleMatchEntity convert(){
        FeuilleMatchEntity feuilleMatchEntity = new FeuilleMatchEntity();
        feuilleMatchEntity.setIdFeuilleMatch(Integer.parseInt(this.id_feuille_match));
        feuilleMatchEntity.setIdMatch(this.id_match);
        feuilleMatchEntity.setIdEquipeJoueur(this.id_equipe_joueur);
        return feuilleMatchEntity;
    }
}
