package com.hawkins.AlgoExpert.Easy;

import java.util.ArrayList;
import java.util.List;
// O(n) time | O(n) Space where n is the number of nodes in the binary tree
public class BranchSums {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static void traverse(BinaryTree node, int currentSum , ArrayList<Integer> list) {
        if(node == null){
            return;
        }
        int runningSum = currentSum + node.value;
        if(node.left == null && node.right == null){
            list.add(runningSum);
            return;
        }
        traverse(node.left,runningSum,list);
        traverse(node.right,runningSum,list);
    }

    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
        ArrayList<Integer> list = new ArrayList<Integer>();
        traverse(root,root.value,list);
        return list;
    }


}
