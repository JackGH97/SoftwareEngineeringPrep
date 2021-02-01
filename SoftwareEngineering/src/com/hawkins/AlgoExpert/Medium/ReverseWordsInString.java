package com.hawkins.AlgoExpert.Medium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReverseWordsInString {

    // "AlgoExpert is the best!" -> "best! the is AlgoExpert"
    public static void main(String[] args) {
        System.out.println(reverseWordsInString("AlgoExpert is the best!"));
    }

    public static String reverseWordsInString(String string) {
        StringBuilder singleton = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        for(int i  =0; i < string.length(); i++){
            char c = string.charAt(i);
            if(Character.isWhitespace(c) || i == string.length()-1){
                if(i == string.length()-1){
                    singleton.append(c);
                }
                list.add(singleton.toString());
                singleton.setLength(0);
            }
            else{
                singleton.append(c);
            }
        }

        Collections.reverse(list);
        return String.join(" ", list);
    }
}
