package com.nba.tpwebservice.service;

import com.nba.tpwebservice.entity.ActionEntity;
import com.nba.tpwebservice.repository.ActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActionService {
    @Autowired
    ActionRepository actionRepository;
    public List<ActionEntity> getAllAction(){
        return this.actionRepository.findAll();
    }
}
