package com.nba.tpwebservice.service;

import com.nba.tpwebservice.entity.ActionMatchEntity;
import com.nba.tpwebservice.entity.FeuilleMatchEntity;
import com.nba.tpwebservice.entity.MatchEntity;
import com.nba.tpwebservice.repository.ActionMatchRepository;
import com.nba.tpwebservice.repository.FeuilleMatchRepository;
import com.nba.tpwebservice.repository.MatchRepository;
import com.nba.tpwebservice.specific.ActionForm;
import com.nba.tpwebservice.specific.ApiResponse;
import com.nba.tpwebservice.specific.FeuilleForm;
import com.nba.tpwebservice.specific.MatchForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchService {
    @Autowired
    MatchRepository matchRepository;
    @Autowired
    FeuilleMatchRepository feuilleMatchRepository;
    public ApiResponse InsertionMatch(MatchForm matchForm){
        ApiResponse apiResponse = new ApiResponse();
        MatchEntity matchEntity = new MatchEntity();
        matchEntity.setIdEquipe1(matchForm.getEquipe1());
        matchEntity.setIdEquipe2(matchForm.getEquipe2());
        matchEntity.setIdMatch(this.matchRepository.getSequenceValue()+"");
        this.matchRepository.save(matchEntity);
        for (FeuilleForm feuille:
             matchForm.getFeuilleFormList()) {
            FeuilleMatchEntity f = feuille.convert();
            f.setIdMatch(matchEntity.getIdMatch());
            this.feuilleMatchRepository.save(f);
        }
        return apiResponse;
    }
}
