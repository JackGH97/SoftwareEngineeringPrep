package com.hawkins.AlgoExpert.Medium;

import java.util.TreeMap;

public class BinaryTreeDiameter {

    // This is an input class. Do not edit.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    /*
        Diameter is the length of the longest path
                    1
                   / \
                  2   3
                 /
                3
               / \
              7   4
             /     \
            8       5
           /         \
          9           6

         longest would be 9 -> 6 = 6
     */
    public int binaryTreeDiameter(BinaryTree tree) {
        return getTreeInfo(tree).diameter;
    }



    public TreeInfo getTreeInfo(BinaryTree tree){
        if(tree == null){
            return new TreeInfo(0,0);
        }
        // keep going down left first
        TreeInfo left = getTreeInfo(tree.left);
        TreeInfo right = getTreeInfo(tree.right);

        int longestPathThroughRoot = left.height + right.height;
        int maxDiameterSoFar = Math.max(left.diameter , right.diameter);
        int currentDiameter = Math.max(longestPathThroughRoot , maxDiameterSoFar);
        int currentHeight = 1 + Math.max(left.height , right.height);

        return new TreeInfo(currentDiameter,currentHeight);
    }

    static class TreeInfo{
        public int diameter;
        public int height;

        public TreeInfo(int diameter, int height){
            this.height = height;
            this.diameter = diameter;
        }
    }

}
