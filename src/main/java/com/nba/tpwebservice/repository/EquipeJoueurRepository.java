package com.nba.tpwebservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipeJoueurRepository extends JpaRepository<EquipeRepository, String> {
}
