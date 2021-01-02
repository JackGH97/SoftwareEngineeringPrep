package com.hawkins.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class CorrespondingTree {


    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
    }

    TreeNode ans, target;


    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        this.target = target;
        inorder(original, cloned);
        return ans;
    }

    public void inorder(TreeNode o, TreeNode c) {
        if (o != null) {
            inorder(o.left, c.left);
            if (o == target) {
                ans = c;
            }
            inorder(o.right, c.right);
        }
    }
}
