package com.hawkins.Questions;

public class CapitaliseWords {

    public static String capitalise(String str) {
        String words[]=str.split("\\s"); //splits the string based on whitespace
        String capitalizeWord="";
        for(String w:words){
            String first=w.substring(0,1);
            String afterfirst=w.substring(1);
            capitalizeWord+=first.toUpperCase()+afterfirst+" ";
        }
        return capitalizeWord.trim();
    }

}
