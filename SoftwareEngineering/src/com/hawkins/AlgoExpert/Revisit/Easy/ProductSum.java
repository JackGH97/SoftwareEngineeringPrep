package com.hawkins.AlgoExpert.Revisit.Easy;

import java.util.ArrayList;
import java.util.List;

public class ProductSum {

    // good study case here// esentially check object is it an array (add to sum) else call function again and update multiplier
    // O(n) time | O(d) depth - depth of special arrays
    public static int productSumHelper(List<Object> array, int multiplier) {
        int sum = 0;
        for (Object el : array) {
            if (el instanceof Integer) {
                sum += (int) el;
            } else {
                @SuppressWarnings("Unchecked")
                ArrayList<Object> ls = (ArrayList<Object>) el;
                sum += productSumHelper(ls,multiplier+1);
            }
        }
        return sum*multiplier;
    }
}
