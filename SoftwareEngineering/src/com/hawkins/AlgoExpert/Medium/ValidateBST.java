package com.hawkins.AlgoExpert.Medium;

public class ValidateBST {

    //O(n) time | o(d) space
    public static boolean validateBst(BST tree) {
        return traverse(tree,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    public static boolean traverse(BST tree, int minValue, int maxValue){
        if(tree.value < minValue || tree.value >= maxValue){
            return false;
        }
        else if(tree.left !=null && !traverse(tree.left,minValue,tree.value)){
            return false;
        }
        else if(tree.right !=null && !traverse(tree.right,tree.value,maxValue)){
            return false;
        }
        else{
            return true;
        }
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }


}
