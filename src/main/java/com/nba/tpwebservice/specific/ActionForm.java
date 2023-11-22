package com.nba.tpwebservice.specific;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

public class ActionForm {

    @Getter
    @Setter
    String idEquipeJoueur;
    @Getter
    @Setter
    String idAction;
    @Getter
    @Setter
    String valeur;
    @Getter
    @Setter
    String idMatch;

    public ActionForm(String idEquipeJoueur, String idAction, String valeur, String idMatch) {
        this.idEquipeJoueur = idEquipeJoueur;
        this.idAction = idAction;
        this.valeur = valeur;
        this.idMatch = idMatch;
    }
}
