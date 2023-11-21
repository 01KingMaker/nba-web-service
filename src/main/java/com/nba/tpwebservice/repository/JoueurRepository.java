package com.nba.tpwebservice.repository;

import com.nba.tpwebservice.entity.JoueurEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoueurRepository extends JpaRepository<JoueurEntity, String>{
}
