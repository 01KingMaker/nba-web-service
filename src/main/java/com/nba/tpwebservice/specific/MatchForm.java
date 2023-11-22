package com.nba.tpwebservice.specific;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class MatchForm {
    @Getter
    @Setter
    String equipe1;
    @Getter
    @Setter
    String equipe2;
    @Getter
    @Setter
    List<FeuilleForm> feuilleFormList;
}
