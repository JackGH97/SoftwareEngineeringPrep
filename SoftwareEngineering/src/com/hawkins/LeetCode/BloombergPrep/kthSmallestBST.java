package com.hawkins.LeetCode.BloombergPrep;

import java.util.ArrayList;
import java.util.List;

public class kthSmallestBST {



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

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> array = new ArrayList<>();
        inOrderTraverse(root,array);
        return array.get(k-1);
    }

    public static List<Integer> inOrderTraverse(TreeNode tree, List<Integer> array) {
        // Write your code here.
        if(tree.left != null){
            inOrderTraverse(tree.left,array);
        }
        array.add(tree.val);
        if(tree.right != null){
            inOrderTraverse(tree.right,array);
        }
        return array;
    }


    /*
    Better way/ less intensive
     */

    int cnt = 0, res = 0;
    public int kthSmallestB(TreeNode root, int k) {
        if (root == null || cnt > k) return 0;
        kthSmallest(root.left, k);
        if (++cnt == k) res = root.val;
        kthSmallest(root.right, k);
        return res;
    }
}

