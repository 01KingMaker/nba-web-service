package com.nba.tpwebservice.controller;

import com.nba.tpwebservice.entity.VJoueurSaisonEntity;
import com.nba.tpwebservice.service.VJoueurSaisonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
public class VJoueurSaisonController {
    @Autowired
    VJoueurSaisonService vJoueurSaisonService;
    @GetMapping
    public List<VJoueurSaisonEntity> getAllStates(){
        return this.vJoueurSaisonService.getAllState();
    }
}
