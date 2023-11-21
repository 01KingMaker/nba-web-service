package com.nba.tpwebservice.service;

import com.nba.tpwebservice.entity.VActionParJoueurParSaisonEntity;
import com.nba.tpwebservice.repository.VActionParJoueurParSaisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VActionParJoueurParSaisonService {
    @Autowired
    VActionParJoueurParSaisonRepository vActionParJoueurParSaisonRepository;
    public List<VActionParJoueurParSaisonEntity> getAllActionByIdSaisonAndIsJoueur(String idSaison, String idJoueur){
        return vActionParJoueurParSaisonRepository.getVActionParJoueurParSaisonEntitiesByIdSaison(idSaison);
    }
}
