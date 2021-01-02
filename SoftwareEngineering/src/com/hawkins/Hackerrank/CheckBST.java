package com.hawkins.Hackerrank;

import org.w3c.dom.Node;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class CheckBST {
    class Node {
        int data;
        Node left;
        Node right;
    }

    boolean checkBST(Node root) {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    boolean checkBST(Node node, int min, int max) {
        if (node == null) return true;
        return  min < node.data && node.data < max &&
                checkBST(node.left, min, node.data) &&
                checkBST(node.right, node.data, max);
    }
}
