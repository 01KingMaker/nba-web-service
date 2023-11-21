package com.nba.tpwebservice.repository;

import com.nba.tpwebservice.entity.ActionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionServiceRepository extends JpaRepository<ActionEntity, String> {
}
