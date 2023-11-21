package com.nba.tpwebservice.repository;

import com.nba.tpwebservice.entity.ActionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActionRepository extends JpaRepository<ActionEntity, String> {

}
