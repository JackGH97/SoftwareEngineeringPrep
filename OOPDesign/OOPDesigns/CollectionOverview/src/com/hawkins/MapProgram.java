package com.hawkins;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String,String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-oriented, platform independent language");
        languages.put("Python", "an interepreted, object oriented high level programming language");
        languages.put("English", "Basic");
        languages.put("BASIC", "Beginners");
//
//        System.out.println(languages.get("Java"));
//        languages.put("Java", "this course is about java");
//        System.out.println(languages.get("Java"));

        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
