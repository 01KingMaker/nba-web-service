package com.nba.tpwebservice.repository;

import com.nba.tpwebservice.entity.FeuilleMatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeuilleMatchRepository extends JpaRepository<FeuilleMatchEntity, String> {
}
