package com.frankbahar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> topNAmes2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "jack",
                "Charlie",
                "harry",
                "Jacob"
        );
//
//        List<String> sortedCapitalNames = new ArrayList<>();
//
//        topNAmes2015.forEach(name -> {
//            String firstChar= name.substring(0,1).toUpperCase();
//            name = firstChar + name.substring(1);
//            sortedCapitalNames.add(name);
//
//        });
////        sortedCapitalNames.sort((String s1, String s2) -> s1.compareTo(s2));
////        sortedCapitalNames.forEach((String s) -> System.out.println(s));
//
//        sortedCapitalNames.sort(String::compareTo);
//        sortedCapitalNames.forEach(System.out::println);


   //     List<String> sortedCapitalNames = topNAmes2015
   //     System.out.println(topNAmes2015
//        topNAmes2015
//                .stream()
//                //          .map(Main::capitalizeFirstLetter)
//                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
//     //           .distinct()
//                .peek(System.out::println)
//                .sorted(String::compareTo)
//            //    .filter(s -> s.startsWith("A"))
//                //      .forEach(System.out::println);
//                .count();

        topNAmes2015
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
             //   .filter(x->true)
                .collect(Collectors.toList());


        //           .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

//        for(String s: sortedCapitalNames){
//            System.out.println(s);
//        }
//
    }
    public static String capitalizeFirstLetter(String name){
        return name.substring(0,1).toUpperCase()+name.substring(1);
    }
}
