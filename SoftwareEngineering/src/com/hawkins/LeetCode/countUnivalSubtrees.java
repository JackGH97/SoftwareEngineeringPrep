package com.hawkins.LeetCode;

public class countUnivalSubtrees {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public int max = 0;
    public int countUnivalSubtrees(TreeNode root) {
        dfs(root, root.left, root.right,1);
        return max;
    }

    public void dfs(TreeNode current, TreeNode left, TreeNode right, int currentMax) {
        int runningMax =  currentMax;
        if(left != null && left.val == current.val) {
            runningMax++;
            if(runningMax > max){
                max = runningMax;
            }
            dfs(left,left.left,left.right,runningMax);
        }
        if(right != null && right.val == current.val){
            runningMax++;
            if(runningMax > max){
                max = runningMax;
            }
            dfs(right,right.left,right.right,runningMax);
        }
        else{
            assert left != null;
            dfs(left,left.left,left.right,1);
            assert right != null;
            dfs(right,right.left,right.right,runningMax);
        }
    }





}
