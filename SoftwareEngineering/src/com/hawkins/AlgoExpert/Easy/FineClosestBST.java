package com.hawkins.AlgoExpert.Easy;

public class FineClosestBST {

    // Average  = O(log(n)) time | O(log(n))Space
    // Worst O(n) time | O(n) Space
    // has space O(1) in both cases
    public static int findClosestValueInBst(BST tree, int target) {
        return traverse(tree, target, tree.value);
    }

    public static int traverse(BST tree, int target, int closest) {
        if (Math.abs(tree.value - target) < Math.abs(closest - target)) {
            closest = tree.value;
        }
        if (target > tree.value && tree.right != null) {
            return traverse(tree.right, target, closest);
        } else if (target < tree.value && tree.left != null) {
            return traverse(tree.left, target, closest);
        } else {
            return closest;
        }
    }

    public static int traverseBetter(BST tree, int target, int closest){
        BST currentNode = tree;
        while(currentNode != null){
            if (Math.abs(currentNode.value - target) < Math.abs(closest - target)) {
                closest = currentNode.value;
            }
            if (target > currentNode.value) {
                currentNode = tree.right;
            } else if (target < currentNode.value) {
                currentNode = tree.left;
            }else {
                break;
            }
        }
        return closest;
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
