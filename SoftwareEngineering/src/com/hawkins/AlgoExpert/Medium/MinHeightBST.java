package com.hawkins.AlgoExpert.Medium;

import java.util.List;

public class MinHeightBST {


    public static BST minHeightBst(List<Integer> array) {
        // Write your code here.
        return minHeight(array,null,0, array.size()-1);
    }

    // O(n) time || O(n) space - where n is the length of the array
    public static BST minHeight(List<Integer> array,int startIdx, int endIdx){
        if(endIdx < startIdx){
            return null;
        }
        int midpoint = ( startIdx + endIdx)/2;
        BST bst= new BST(array.get(midpoint));
        bst.left = minHeight(array,startIdx, midpoint-1);
        bst.right = minHeight(array,midpoint+1, endIdx);
        return bst;
    }

    // O(nlog(n)) time || O(n) space - where n is the length of the array
    // insertion takes log(n) and we have to do it N times;
    public static BST minHeight(List<Integer> array, BST bst, int startIdx, int endIdx){
        if(endIdx < startIdx){
            return null;
        }
        int midpoint = ( startIdx + endIdx)/2;
        int value = array.get(midpoint);

        if(bst == null){
            bst = new BST(value);
        }
        else{
            bst.insert(value);
        }

        minHeight(array,bst,startIdx, midpoint-1);
        minHeight(array,bst,midpoint+1, endIdx);
        return bst;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public void insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
        }
    }
}
