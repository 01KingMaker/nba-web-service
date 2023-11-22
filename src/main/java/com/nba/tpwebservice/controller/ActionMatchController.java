package com.nba.tpwebservice.controller;

import com.nba.tpwebservice.service.ActionMatchService;
import com.nba.tpwebservice.service.MatchService;
import com.nba.tpwebservice.specific.ActionForm;
import com.nba.tpwebservice.specific.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/actionmatch")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ActionMatchController {
    @Autowired
    ActionMatchService actionMatchService;
    @PostMapping
    public ApiResponse InsertionAction(@RequestBody ActionForm actionForm){
        return this.actionMatchService.InsertionActionDeMatch(actionForm);
    }
}
