package com.hawkins.AlgoExpert.Easy;

import java.util.ArrayList;
import java.util.List;

// o(n) time | o(d) space - greatest depth;
public class ProductSum {

    public static int productSum(List<Object> array) {
        return productSumHelper(array,1);
    }


    public static int productSumHelper(List<Object> array, int multiplier){
        int sum = 0;
        for(Object el : array){
            if(el instanceof Integer){
                sum += (int) el;
            }
            else{
                @SuppressWarnings("Unchecked")
                ArrayList<Object> ls = (ArrayList<Object>) el;
                sum += productSumHelper(ls,multiplier+1);
            }
        }
        return sum*multiplier;
    }
}
