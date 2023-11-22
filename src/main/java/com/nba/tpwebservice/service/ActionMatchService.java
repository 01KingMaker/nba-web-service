package com.nba.tpwebservice.service;

import com.nba.tpwebservice.entity.ActionMatchEntity;
import com.nba.tpwebservice.repository.ActionMatchRepository;
import com.nba.tpwebservice.specific.ActionForm;
import com.nba.tpwebservice.specific.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActionMatchService {
    @Autowired
    ActionMatchRepository actionMatchRepository;
    public ApiResponse InsertionActionDeMatch(ActionForm actionForm){
        ApiResponse apiResponse = new ApiResponse();
        ActionMatchEntity actionMatchEntity = new ActionMatchEntity();
        actionMatchEntity.setDateAction(new java.sql.Timestamp(System.currentTimeMillis()));
        actionMatchEntity.setIdAction(actionForm.getIdAction());
        actionMatchEntity.setValeur(Integer.parseInt(actionForm.getValeur()));
        actionMatchEntity.setIdEquipeJoueur(actionForm.getIdEquipeJoueur());
        actionMatchEntity.setIdMatch(actionForm.getIdMatch());
        this.actionMatchRepository.save(actionMatchEntity);
        return apiResponse;
    }
}
