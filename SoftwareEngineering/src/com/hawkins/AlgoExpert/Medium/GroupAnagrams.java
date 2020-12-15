package com.hawkins.AlgoExpert.Medium;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("yo");
        list.add("act");
        list.add("flop");
        list.add("tac");
        list.add("foo");
        list.add("cat");
        list.add("oy");
        list.add("olfp");
        list.add("yo");
        System.out.println(groupAnagrams(list));
    }


    // O(w * n * log(n)) time | O(wn) space - w is the number of words, n is the length of the longest word
    public static List<List<String>> groupAnagrams(List<String> words) {

        HashMap<String, List<String>> anagrams = new HashMap<>();



        for(String word : words) {
            char[] sword = word.toCharArray();
            Arrays.sort(sword);
            String sortedWord = Arrays.toString(sword);

            if(anagrams.containsKey(sortedWord)){
                anagrams.get(sortedWord).add(word);
            }
            else{
                anagrams.put(sortedWord,new ArrayList<>(Arrays.asList(word)));
            }
        }

        return new ArrayList<>(anagrams.values());
    }

}
