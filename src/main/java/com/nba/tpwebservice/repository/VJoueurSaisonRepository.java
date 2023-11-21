package com.nba.tpwebservice.repository;

import com.nba.tpwebservice.entity.VJoueurSaisonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VJoueurSaisonRepository extends JpaRepository<VJoueurSaisonEntity, String> {
}
