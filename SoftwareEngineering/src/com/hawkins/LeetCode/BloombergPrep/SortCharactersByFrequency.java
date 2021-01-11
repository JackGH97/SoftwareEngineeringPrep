package com.hawkins.LeetCode.BloombergPrep;

import java.util.*;
import java.util.stream.Stream;

public class SortCharactersByFrequency {


    public static void main(String[] args) {
        frequencySort("hii");
    }
    // O(nlog(n)) time || O(n) space
    // nlog(n) to sort + O(N) entries to add
    public static String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.merge(c, 1, Integer::sum);
        }

        // Make a list of the keys, sorted by frequency.
        List<Character> characters = new ArrayList<>(map.keySet());
        Collections.sort(characters, (a, b) -> map.get(b) - map.get(a));

        // Convert the counts into a string with a sb.
        StringBuilder sb = new StringBuilder();
        for (char c : characters) {
            int copies = map.get(c);
            for (int i = 0; i < copies; i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
