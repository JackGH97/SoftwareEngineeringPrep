package com.hawkins.Questions.Medium;

import java.util.*;


public class MagicSquare {

    //$s = [[5, 3, 4], [1, 5, 8], [6, 4, 2]]
    public static int formingMagicSquare(int[][] s) {
        HashSet<Integer> numbers = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        List<Integer> duplicates = new ArrayList<>();

        int cost = 0;
        for(int i = 0; i<s.length; i++){
            for(int j = 0; j < s.length; j++){
                if(numbers.contains(s[i][j])){
                    numbers.remove(s[i][j]);
                }
                else{
                    duplicates.add(s[i][j]);
                }
            }
        }

        List<Integer> missing = new ArrayList<>(numbers);

        Collections.sort(duplicates);
        Collections.sort(missing);

        for(int i =0; i < duplicates.size(); i++){
            cost += Math.abs(duplicates.get(i)- missing.get(i));
        }
        return cost;
    }
}
