package com.nba.tpwebservice.controller;

import com.nba.tpwebservice.entity.EquipeEntity;
import com.nba.tpwebservice.service.EquipeService;
import com.nba.tpwebservice.specific.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/equipe")
@CrossOrigin(origins = { "* "})
public class EquipeController {
    @Autowired
    EquipeService equipeService;
    @GetMapping
    public ApiResponse getAllEquipe(){
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.addObject("equipes", this.equipeService.getEquipes());
        return apiResponse;
    }
}
