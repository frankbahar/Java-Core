package com.frankbahar;

import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String myString = "Let's split this up into an array";
                String[] parts = myString.split(" ");
                for(String part:parts){
                        System.out.println(part);
                }
            }
        };

        Runnable runnable1 = ()->{
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for(String part:parts){
                System.out.println(part);
            }
        };
        runnable1.run();

        Function<String, String> lambdaFunction = (String s)-> {
            StringBuilder returnVal= new StringBuilder();
            for(int i=0; i<s.length(); i++){
                if(i%2 == 1){
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };
        //System.out.println(lambdaFunction.apply("123456780"));
        System.out.println(everySecondCharacter(lambdaFunction,"123456780"));
        Supplier<String> iLoveJava = ()-> {return "I love Java!";};
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);

    }

     private static String everySecondCharacter(Function<String, String> lambdafunction, String s1){
         return lambdafunction.apply(s1);

    }
}
