package com.nba.tpwebservice.service;

import com.nba.tpwebservice.entity.EquipeEntity;
import com.nba.tpwebservice.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipeService {
    @Autowired
    EquipeRepository equipeRepository;
    public List<EquipeEntity> getEquipes(){
        return this.equipeRepository.findAll();
    }
}
