package com.hawkins.LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class RangeSumBST {



    public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
             this.left = left;
              this.right = right;
          }
     }


    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> toSum = new ArrayList<>();
        traverseSum(root,low,high,toSum);
        int sum = 0;
        for(int i =0; i<toSum.size(); i++){
            sum += toSum.get(i);
        }
        return sum;
    }

    public static void traverseSum(TreeNode root, int low, int high, List toSum){
        if(root == null){
            return;
        }
        if(root.val >= low && root.val <= high){
            toSum.add(root.val);
        }
        traverseSum(root.left,low,high,toSum);
        traverseSum(root.right,low,high,toSum);
    }
}
