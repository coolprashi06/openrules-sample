package com.prashast;

public class Main {

    public static void main(String args[]) throws Exception{

        PurchaseOrderDecision pod = new PurchaseOrderDecision();
        System.out.println(pod.getEligibility("NL",8));

        CustomerGreetingDecision cgd = new CustomerGreetingDecision();
        System.out.println(cgd.getGreetingMessage("Prashast",9,"Male","Single"));
    }
}
