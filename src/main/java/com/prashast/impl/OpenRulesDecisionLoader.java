package com.prashast.impl;

import com.openrules.ruleengine.Decision;


public class OpenRulesDecisionLoader {

    public static Decision init(String decisionName, String decisionFileName){
        return new Decision(decisionName,decisionFileName);
    }

    public static void executeDecision(Decision decision){
        decision.saveRunLog(true);
        decision.execute();
        decision.printSavedRunLog("results.txt");
    }

}
