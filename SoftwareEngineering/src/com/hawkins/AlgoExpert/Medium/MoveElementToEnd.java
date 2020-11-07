package com.hawkins.AlgoExpert.Medium;

import java.util.ArrayList;
import java.util.List;

public class MoveElementToEnd {

    
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        int swapI = array.size() -1;
        for(int i = array.size() -2; i > 0; i--){
            if(array.get(i) == toMove && array.get(swapI) != toMove){
                swap(array,i,swapI);
                swapI--;
            }
        }

        return new ArrayList<Integer>();
    }

    public static void swap(List<Integer> array, int i, int j){
        if(i == j){
            return;
        }

        int temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }
}
