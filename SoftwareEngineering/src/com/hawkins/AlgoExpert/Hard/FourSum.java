package com.hawkins.AlgoExpert.Hard;

import java.util.*;

public class FourSum {

    public static void main(String[] args) {
        System.out.println(methodName(new int[]{7,6,4,-1,1,2},16));
    }

    // O(n^3) Time || O(n^3)) space
    public static List<Integer[]> methodName(int[] array, int target){
        HashSet<List<Integer>> map = new HashSet<>();
        HashSet<List<Integer>> map2 = new HashSet<>();

        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array.length; j++){
                map.add(new ArrayList<>(Arrays.asList(array[i],array[j])));
            }
        }

        List<List<Integer>> unique = new ArrayList<>(map);
        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array.length; j++){
                int sum = target - (array[i] + array[j]);
                for(int k = 0; k < map.size(); k++){
                    if(unique.get(k).stream().mapToInt(Integer::intValue)
                            .sum() == sum){
                        if(array[i] != unique.get(k).get(0) && array[i] != unique.get(k).get(1) && array[i] != array[j] ){
                            if(array[j] != unique.get(k).get(0) && array[j] != unique.get(k).get(1) ){
                                if(unique.get(k).get(0) != unique.get(k).get(1)){
                                    List<Integer> match = new ArrayList<>(Arrays.asList(array[i],array[j],unique.get(k).get(0),unique.get(k).get(1)));
                                    Collections.sort(match);
                                    map2.add(match);
                                }
                            }

                        }

                    }
                }

            }
        }

        List<Integer[]> finalV = new ArrayList<>();

        for(List<Integer> list : map2){
            finalV.add(list.toArray(new Integer[0]));
        }


        return finalV;
    }
}
