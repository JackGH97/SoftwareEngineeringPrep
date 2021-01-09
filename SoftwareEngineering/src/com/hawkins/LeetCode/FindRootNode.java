package com.hawkins.LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindRootNode {



// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {
        children = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        children = new ArrayList<Node>();
    }

    public Node(int _val,ArrayList<Node> _children) {
        val = _val;
        children = _children;
    }
}

    public Node findRoot(List<Node> tree) {
        HashSet<Integer> children = new HashSet<>();

        for(Node node : tree){
            for(Node child : node.children){
                if(!(children.contains(child.val))){
                    children.add(child.val);
                }
            }
        }
        for(Node node : tree){
            if(!children.contains(node.val)){
                return node;
            }
        }
        return null;
    }


}
