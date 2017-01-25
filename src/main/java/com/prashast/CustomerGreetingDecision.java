package com.prashast;

import com.prashast.impl.OpenRulesDecisionLoader;
import com.prashast.model.Customer;
import com.openrules.ruleengine.Decision;


public class CustomerGreetingDecision {

    private final String DECISION_NAME = "CustomerGreeting";
        private final String DECISION_EXCEL_FILE_NAME = "DecisionGreeting.xls";

        public String getGreetingMessage(String name,int currentHour, String gender,String maritalStatus) throws Exception{

            Customer customer = new Customer();
            customer.setName(name);
            customer.setCurrentHour(currentHour);
            customer.setGender(gender);
            customer.setMaritalStatus(maritalStatus);

            String excelFileName = CustomerGreetingDecision.class.getClassLoader().getResource(DECISION_EXCEL_FILE_NAME).toURI().toString();

            Decision decision = OpenRulesDecisionLoader.init(DECISION_NAME, excelFileName);
            decision.put("customer",customer);
            OpenRulesDecisionLoader.executeDecision(decision);
            System.out.println("Greeting message is " + customer.getResult());
            return customer.getResult();
        }


}
