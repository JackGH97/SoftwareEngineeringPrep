package com.hawkins.AlgoExpert.Revisit.Easy;

public class NodeDepth {


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

    public static int nodeDepth(BinaryTree node, int Depth){
        if(node == null) {
            return 0;
        }
        return Depth + nodeDepth(node.left, Depth +1) + nodeDepth(node.right, Depth +1);
    }
}
