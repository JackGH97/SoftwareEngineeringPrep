package com.hawkins.LeetCode;

import java.util.List;

public class DepthSum {


    public static void main(String[] args) {

    }
     // This is the interface that allows for creating nested lists.
    // You should not implement it, or speculate about its implementation
     public interface NestedInteger {
         //Constructor initializes an empty nested list.


         // Constructor initializes a single integer.

         // @return true if this NestedInteger holds a single integer, rather than a nested list.
          public boolean isInteger();

         // @return the single integer that this NestedInteger holds, if it holds a single integer
          // Return null if this NestedInteger holds a nested list
          public Integer getInteger();

         // Set this NestedInteger to hold a single integer.
         public void setInteger(int value);
         // Set this NestedInteger to hold a nested list and adds a nested integer to it.
         public void add(NestedInteger ni);
         // @return the nested list that this NestedInteger holds, if it holds a nested list
     // Return null if this NestedInteger holds a single integer
         public List<NestedInteger> getList();
     }

     //[1,[4,[6]]] = 27 - 1*1 + 4*2 + 3*6 Solved first time!
    //  O(N) Time - The recursive function, dfs(...) is called exactly once for each nested list.
     //     As NN also includes nested integers, we know that the number of recursive calls has to be less than NN.
    // O(N) Space - recursive calls are placed on the stack, where DD is the maximum level of nesting in the input
    public int depthSum(List<NestedInteger> nestedList) {
         int sum = 0;
         int currentDepth = 1;
        for(int i = 0; i <nestedList.size();i++){
            if(nestedList.get(i).isInteger()){
                sum += currentDepth * nestedList.get(i).getInteger();
            } else{
                sum += nest(nestedList.get(i).getList(),currentDepth+1);
            }
        }
        return sum;
    }

    public int nest(List<NestedInteger> nestedList, int currentDepth){
        int sum = 0;
        for(int i = 0; i <nestedList.size();i++){
            if(nestedList.get(i).isInteger()){
                sum += currentDepth * nestedList.get(i).getInteger();
            } else{
                sum += nest(nestedList.get(i).getList(),currentDepth+1);
            }
        }
        return sum;
    }

}
