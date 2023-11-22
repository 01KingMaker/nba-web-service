package com.nba.tpwebservice.service;

import com.nba.tpwebservice.entity.FeuilleMatchEntity;
import com.nba.tpwebservice.repository.FeuilleMatchRepository;
import com.nba.tpwebservice.specific.ApiResponse;
import com.nba.tpwebservice.specific.FeuilleForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeuilleMatchService {
    @Autowired
    FeuilleMatchRepository feuilleMatchRepository;
    public ApiResponse insert(FeuilleForm f){
        FeuilleMatchEntity feuilleMatchEntity = f.convert();
        feuilleMatchRepository.save(feuilleMatchEntity);
        ApiResponse apiResponse = new ApiResponse();
        return apiResponse;
    }
}
