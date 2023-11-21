package com.nba.tpwebservice.repository;

import com.nba.tpwebservice.entity.VMatchJoueurEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VMatchJoueurRepository extends JpaRepository<VMatchJoueurEntity, String> {
    public VMatchJoueurEntity getVMatchJoueurEntityByIdJoueurAndIdSaison(String idJoueur, String idSaison);
}
