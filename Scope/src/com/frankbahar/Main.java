package com.frankbahar;

public class Main {

    public static void main(String[] args) {
        String varFour = "this is private main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        System.out.println("varThree is not accesible here "+ innerClass);

//        System.out.println("ScopeInstance varOne is  " + scopeInstance.getVarOne());
//        System.out.println(varFour);
//        scopeInstance.timesTwo();
//        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        innerClass.timesTwo();
    }
}
