package com.nba.tpwebservice.controller;

import com.nba.tpwebservice.entity.VJoueurSaisonEntity;
import com.nba.tpwebservice.service.VJoueurSaisonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/states")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class VJoueurSaisonController {
    @Autowired
    VJoueurSaisonService vJoueurSaisonService;
    @GetMapping("/{id}")
    public List<VJoueurSaisonEntity> getAllStates(@PathVariable("id") String idSaison){
        // List<VJoueurSaisonEntity> joueurSaisonEntities = this.vJoueurSaisonRepository.findAll();
        return this.vJoueurSaisonService.getAllState(idSaison);
    }
}
