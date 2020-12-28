package com.hawkins.Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NiceTeams {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(maxPairs(list,4));
    }
    public static int maxPairs(List<Integer> skillLevel, int minDiff) {
        // Write your code here
        int count= 0;
        int left = 0;
        int right = left+1;
        while(left != right && right < skillLevel.size()){
            if(Math.abs(skillLevel.get(left) - skillLevel.get(right)) == minDiff) {
                count++;
                skillLevel.set(left, 0);
                skillLevel.set(right, 0);
                right = left + 1;
            }
            else if(left == skillLevel.size()-1){
                break;
            }
            else if(right == skillLevel.size()-1){
                left++;
                right = left+1;
            }
            else{
                right++;
            }
        }
        return count;
    }
}
