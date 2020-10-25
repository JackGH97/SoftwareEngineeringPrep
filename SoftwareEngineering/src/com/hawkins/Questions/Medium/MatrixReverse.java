package com.hawkins.Questions.Medium;

import java.util.ArrayList;
import java.util.List;

public class MatrixReverse {

    public static void main(String[] args) {
        List<List<Integer>> after = new ArrayList<>();
        List<Integer> test = new ArrayList<>();
        test.add(2);
        test.add(5);
        test.add(7);
        List<Integer> test1 = new ArrayList<>();
        test1.add(12);
        test1.add(24);
        test1.add(56);
        after.add(test);
        after.add(test1);

        List<List<Integer>> before = new ArrayList<List<Integer>>();
        before = findBeforeMatrix(after);

        System.out.println(before.get(1).get(0));

    }

    public static List<List<Integer>> findBeforeMatrix(List<List<Integer>> after) {
        // Write your code here
        List<List<Integer>> before = new ArrayList<List<Integer>>();
        List<Integer> lower = new ArrayList<>();
        int intial = after.get(0).get(0);
        int lastValue = after.get(after.size()-1).get(after.size()-1);

        lower.add(intial);


        for(int j = 0; j < after.size();j++){
            for(int i = 0; i < after.size(); i++) {
                if(j == i){

                }
                else if(j % 2 == 0){
                    if( i % 2 != 0){;
                        lower.add(after.get(j).get(i) - intial);
                    }
                }
                else {
                    lower.add(after.get(j).get(i) - intial);
                }
            }
        }

        for (Integer integer : lower) {
            lastValue -= integer;
        }

        lower.add(lastValue);

        for(int i =0; i<lower.size(); i+=2){
            List<Integer> upper = new ArrayList<>();
            for(int j = 0; j < after.size(); j++){
                upper.add(lower.get(j+i));
            }
            before.add(upper);
        }

        return before;
    }


}
