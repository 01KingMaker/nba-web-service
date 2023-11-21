package com.nba.tpwebservice.repository;

import com.nba.tpwebservice.entity.EquipeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipeRepository extends JpaRepository<EquipeEntity, String> {
}
