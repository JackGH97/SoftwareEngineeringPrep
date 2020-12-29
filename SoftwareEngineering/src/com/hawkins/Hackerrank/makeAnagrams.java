package com.hawkins.Hackerrank;

import java.util.HashMap;

import static com.hawkins.AlgoExpert.Medium.RiverSizes.count;

public class makeAnagrams {

    public static void main(String[] args) {
        System.out.println(makeABetter("aabc","aas"));
    }

    public static int makeAnagram(String a, String b) {
        HashMap<Character,Integer> aMap = new HashMap<>();
        int count = 0;
        for(char c : a.toCharArray()){
            aMap.put(c, aMap.getOrDefault(c, 0) + 1);
        }
        HashMap<Character,Integer> bMap = new HashMap<>();

        for(char c : b.toCharArray()){
            bMap.put(c, bMap.getOrDefault(c, 0) + 1);
        }

        for(char alphabet = 'a'; alphabet <='z'; alphabet++ )
        {

            int aT = 0;
            int bT = 0;
            if(aMap.containsKey(alphabet)){
                aT = aMap.get(alphabet);
            }
            if(bMap.containsKey(alphabet)){
                bT = bMap.get(alphabet);
            }

            count += Math.abs(aT - bT);
        }

        return count;
    }


    public static  int makeABetter(String a, String b){
        String firstCopy = a;

        // if it doesn't contain the index returns -1;
        for(char c : a.toCharArray()) {
            if(b.indexOf(c) != -1) {
                firstCopy = firstCopy.replaceFirst(c + "", "");
                b = b.replaceFirst(c + "", "");
            }
        }

        System.out.println(firstCopy.length() + " " + b.length());
        return firstCopy.length() + b.length();
    }
}
