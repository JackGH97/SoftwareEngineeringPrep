package com.hawkins;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        String challenge1 =  "I want a bike.";
        String challenge2 = "I want a ball.";

        // matches characters
        String regex = "I want a \\w+.";
        System.out.println(challenge1.matches(regex));
        System.out.println(challenge2.matches(regex));

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());


        String challenge4 = "Replace all blanks with undersores.";
        System.out.println(challenge4.replaceAll("\\s", "_"));

        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[a-g]+"));
    }
}
