package com.hawkins;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
//	// write your code here
//        Runnable r = () -> {
//            try{
//                String myString = "Lets split this up into an array";
//                String[] parts = myString.split(" ");
//                for (String part : parts){
//                    System.out.println(part);
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        };
//
//        Function<String, String> lambdaFunction = (String string) -> {
//            StringBuilder returnVal = new StringBuilder();
//            for (int i = 0; i < string.length(); i++) {
//                if(i % 2 == 0){
//                    returnVal.append(string.charAt(i));
//                }
//            }
//            return  returnVal.toString();
//        };
//
//        System.out.println(secondCharacter(lambdaFunction,"1234567890"));

        List<String> topNames2015 = Arrays.asList("Amelia", "Olivia", "emily", "Isla", "Ava", "Oliver", "Jack", "Charlie", "harry", "Jacob");
        List<String> upperCase = new ArrayList<>();

//        topNames2015.forEach(name -> upperCase.add(name.substring(0,1).toUpperCase() + name.substring(1)));
//        upperCase.sort(String::compareTo);
//        upperCase.forEach(System.out::println);
        topNames2015.stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1)) 
                        .sorted(String::compareTo)
                        .forEach(System.out::println);



    }

    public static String secondCharacter(Function<String, String> func,String source){
        return func.apply(source);
    }
}
