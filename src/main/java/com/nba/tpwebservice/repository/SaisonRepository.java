package com.nba.tpwebservice.repository;
import com.nba.tpwebservice.entity.JoueurEntity;
import com.nba.tpwebservice.entity.SaisonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface SaisonRepository extends JpaRepository<SaisonEntity, String>{
    public SaisonEntity getSaisonEntitiesByFinBetween(Timestamp date1, Timestamp date2);
}
