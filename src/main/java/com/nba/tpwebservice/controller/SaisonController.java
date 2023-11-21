package com.nba.tpwebservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Saision")
public class SaisonController {
    @GetMapping
    public String getSaisonState(){
        return "ok";
    }
}
