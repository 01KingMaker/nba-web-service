package com.nba.tpwebservice.controller;

import com.nba.tpwebservice.service.FeuilleMatchService;
import com.nba.tpwebservice.specific.ApiResponse;
import com.nba.tpwebservice.specific.FeuilleForm;
import com.nba.tpwebservice.specific.MatchForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/feuilledematch")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FeuilleMatchController {
    @Autowired
    FeuilleMatchService feuilleMatchService;
    @PostMapping
    public ApiResponse AjouterJoueur(@RequestBody FeuilleForm feuilleForm){
        return this.feuilleMatchService.insert(feuilleForm);
    }
}
