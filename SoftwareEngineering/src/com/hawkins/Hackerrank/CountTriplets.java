package com.hawkins.Hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class CountTriplets {

    public static void main(String[] args) {

        List<Long> list = new ArrayList<>(Arrays.asList(1L, 1L, 1L, 1L,1L, 1L,
                1L, 1L,1L, 1L,1L, 1L, 1L, 1L,1L, 1L, 1L, 1L,1L, 1L,1L, 1L, 1L,
                1L,1L, 1L, 1L, 1L,1L, 1L,1L, 1L, 1L, 1L,1L, 1L, 1L, 1L,1L, 1L,
                1L, 1L, 1L, 1L,1L, 1L, 1L, 1L,1L, 1L,1L, 1L, 1L, 1L,1L, 1L, 1L,
                1L,1L, 1L,1L, 1L, 1L, 1L,1L, 1L, 1L, 1L,1L, 1L,1L, 1L, 1L, 1L,1L,
                1L, 1L, 1L,1L, 1L,1L, 1L, 1L, 1L,1L, 1L, 1L, 1L,1L, 1L,1L, 1L, 1L,
                1L,1L, 1L, 1L, 1L,1L, 1L));

        System.out.println(countTriplets(list, 1));
    }

    public static long countTriplets(List<Long> arr, long r) {
        long count = 0;

        HashMap<Long,Integer> map = new HashMap<>();
        for (Long aLong : arr) {
            map.put(aLong, map.getOrDefault(aLong, 0) + 1);
        }
        // Copy all data from hashMap into TreeMap
        TreeMap<Long, Integer> sorted = new TreeMap<>(map);
        System.out.println(sorted);


        for(Map.Entry<Long,Integer> entry : sorted.entrySet()) {
            long key = entry.getKey();
            long left = key / r;
            long right = key * r;

            int noLeft = 0 ;
            int noRight = 0;
            if(sorted.get(left) != null){
                noLeft = sorted.get(left);
            }
            if(sorted.get(right) != null){
                noRight = sorted.get(right);
            }

            count += ((long) (noLeft * noRight)) * entry.getValue();

        }
        return count;
    }

}
