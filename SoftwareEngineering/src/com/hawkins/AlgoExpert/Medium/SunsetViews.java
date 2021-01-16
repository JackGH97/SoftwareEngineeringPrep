package com.hawkins.AlgoExpert.Medium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SunsetViews {

    public static void main(String[] args) {
        System.out.println(sunsetViews(new int[]{3,5,4,4,3,1,3,2},"WEST"));
        System.out.println(sunsetViews(new int[]{3,5,4,4,3,1,3,2},"EAST"));
        System.out.println(sunsetViews(new int[]{20, 2, 3, 1, 5, 6, 9, 1, 9, 9, 11, 10, 9, 12, 8},"EAST"));
    }
    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        // Write your code here.
        ArrayList<Integer> list = new ArrayList<>();
        if(buildings.length == 0){
            return list;
        }
        if(direction.equals("WEST")){
            int currentMax = buildings[0];
            list.add(0);
            for(int i = 1; i < buildings.length; i++){
                if(buildings[i] > currentMax){
                    currentMax = buildings[i];
                    list.add(i);
                }
            }
        }
        else if(direction.equals("EAST")){
            int currentMax = buildings[buildings.length-1];
            list.add(buildings.length-1);
            for(int i = buildings.length-2; i >= 0; i--){
                if(buildings[i] > currentMax){
                    currentMax = buildings[i];
                    list.add(i);
                }
            }
            Collections.reverse(list);
        }

        return list;
    }
}
