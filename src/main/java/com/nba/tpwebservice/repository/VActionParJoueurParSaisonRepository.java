package com.nba.tpwebservice.repository;

import com.nba.tpwebservice.entity.VActionParJoueurParSaisonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VActionParJoueurParSaisonRepository extends JpaRepository<VActionParJoueurParSaisonEntity, String> {
    public List<VActionParJoueurParSaisonEntity> getVActionParJoueurParSaisonEntitiesByIdSaisonAndIdJoueur(String idsaison, String idjoueur);
    public List<VActionParJoueurParSaisonEntity> getVActionParJoueurParSaisonEntitiesByIdSaison(String idSaison);
}
