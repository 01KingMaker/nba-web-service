package com.nba.tpwebservice.repository;

import com.nba.tpwebservice.entity.MatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository<MatchEntity, String> {
    @Query("Select nextval('seq_match')")
    public int getSequenceValue();
}
