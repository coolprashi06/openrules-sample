package com.prashast;

public class Main {

    public static void main(String args[]) throws Exception{
        
        CustomerGreetingDecision cgd = new CustomerGreetingDecision();
        System.out.println(cgd.getGreetingMessage("Prashast",9,"Male","Single"));
    }
}
