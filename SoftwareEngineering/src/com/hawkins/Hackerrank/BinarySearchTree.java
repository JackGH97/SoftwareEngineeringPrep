package com.hawkins.Hackerrank;

import java.util.HashSet;

public class BinarySearchTree {

    public static void main(String[] args) {
        Node node;
    }


    class Node {
        int data;
        Node left;
        Node right;
    }

    boolean checkBST(Node root) {
        return  helper(root, Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    // side == true (right)
    public boolean helper(Node current, int min, int max){
        if(current == null || current.data < min || current.data > max){
            return false;
        }
        helper(current.left,min,current.data);
        helper(current.right,current.data,max);
        return true;
    }
}
