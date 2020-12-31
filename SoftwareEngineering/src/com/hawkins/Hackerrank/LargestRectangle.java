package com.hawkins.Hackerrank;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.Stack;

public class LargestRectangle {


    public static void main(String[] args) {
        int[] test = new int[]{1 ,2 ,3,1};
        System.out.println(largestRectangle(test));
    }

    static long largestRectangle(int[] h) {
        Stack <Integer> Stack = new  Stack <Integer> ();
        int max_area = 0 ;
        int tp ;
        int area_with_top;
        int i = 0;
        while( i < h.length)
        {
            if(Stack.empty() || h[Stack.peek()] < h[i]){
                Stack.push(i);
                i=i+1;
            }
            else{
                tp = Stack.peek();
                Stack.pop();
                area_with_top = h[tp] * (Stack.empty() ? i : i - Stack.peek() - 1);
                max_area = Math.max(max_area,area_with_top);
            }


        }
        while(!Stack.empty())
        {
            tp  = Stack.peek();
            Stack.pop();
            area_with_top = h[tp] * (Stack.empty() ? i : i - Stack.peek() - 1);
            max_area = Math.max(max_area,area_with_top);
        }
        return max_area;
    }
}
