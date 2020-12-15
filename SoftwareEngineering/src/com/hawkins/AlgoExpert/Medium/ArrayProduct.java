package com.hawkins.AlgoExpert.Medium;

import java.util.*;

public class ArrayProduct {

    // time O(n) || space O(n) - best solution
    public int[] arrayOfProducts(int[] array) {

        int[] pA = new int[array.length];
        int[] leftPA = new int[array.length];
        int[] rightPA = new int[array.length];

        int leftProduct = 1;
        for(int i = 0; i < array.length; i++){
            leftPA[i] = leftProduct;
            leftProduct = leftProduct * array[i];
        }

        int rightProduct = 1;
        for(int i = array.length-1; i >= 0; i--){
            rightPA[i] = rightProduct;
            rightProduct = rightProduct * array[i];
        }

        for(int i = 0; i < array.length; i++){
            pA[i] = rightPA[i] * leftPA[i];
        }
        return pA;
    }
}
