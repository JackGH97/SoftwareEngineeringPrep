package com.hawkins.AlgoExpert.Revisit.Easy;

import java.util.ArrayList;
import java.util.List;

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

    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
        ArrayList<Integer> list = new ArrayList<Integer>();
        traverse(root,0,list);
        return list;
    }

    public static void traverse(BinaryTree root, int currentSum, ArrayList<Integer> totals){
        if(root == null ){
            return;
        }
        int runningSum = currentSum + root.value;
        if(root.left == null && root.right == null){
            totals.add(runningSum);
            return;
        }
        traverse(root.left,runningSum,totals);
        traverse(root.right,runningSum,totals);
    }
}
