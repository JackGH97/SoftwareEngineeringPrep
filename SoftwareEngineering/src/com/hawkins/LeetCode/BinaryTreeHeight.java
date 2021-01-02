package com.hawkins.LeetCode;

public class BinaryTreeHeight {


    private static int depth;

    class Node {
        int data;
        Node left;
        Node right;
    }

    public static int height(Node root) {
        depthSearch(root,0);
        return depth;
    }

    public static void depthSearch(Node root, int currentDepth){
        if(root == null){

        }
        else{
            if(currentDepth > depth){
                depth = currentDepth;
            }
            depthSearch(root.left, currentDepth+1);
            depthSearch(root.right, currentDepth+1);
        }
    }

}
