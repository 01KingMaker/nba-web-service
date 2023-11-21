package com.nba.tpwebservice.repository;

import com.nba.tpwebservice.entity.ActionMatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionMatchRepository extends JpaRepository<ActionMatchEntity, String> {
}
