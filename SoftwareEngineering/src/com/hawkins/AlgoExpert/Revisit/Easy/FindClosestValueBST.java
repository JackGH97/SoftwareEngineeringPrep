package com.hawkins.AlgoExpert.Revisit.Easy;

public class FindClosestValueBST {

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

    //
    public static int findClosestValueInBst(BST tree, int target) {
        return traverse(tree, target, tree.value);
    }
    // O(n) Worst - O(log(n) Average Time complexity (Half set everytime)
    // O(1) space
    public static int traverse(BST tree, int target, int currentClosest){
        BST currentNode = tree;
        while(currentNode != null){
            if(currentNode.value == target){
                return currentNode.value;
            }
            else if(Math.abs(currentNode.value-target) < Math.abs(currentClosest-target) ){
                currentClosest = currentNode.value;
            }
            else if(target < currentNode.value ){
                currentNode = currentNode.left;
            }else if(target > currentNode.value){
                currentNode = currentNode.right;
            }else{
                break;
            }
        }
        return currentClosest;
    }
}
