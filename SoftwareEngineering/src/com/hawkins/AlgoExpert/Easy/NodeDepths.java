package com.hawkins.AlgoExpert.Easy;

import java.util.ArrayList;

public class NodeDepths {


    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public static int nodeDepths(BinaryTree root) {
        // Write your code here.
        return nodeDepth(root,0);
    }

    public static int nodeDepth(BinaryTree root, int depth){
        if(root == null){
            return 0;
        }
        return depth + nodeDepth(root.left, depth+1) + nodeDepth(root.right, depth +1);
    }
}
