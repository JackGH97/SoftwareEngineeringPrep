package com.hawkins.Hackerrank;

public class HuffmanDecoding {

    public StringBuilder sb = new StringBuilder();

    public class Node {
        public int frequency; // the frequency of this tree
        public char data;
        public Node left, right;
    }

    void decode(String s, Node root) {
        String result = "";
        Node cur = root;
        for(char ch: s.toCharArray()) {
            if(ch == '0') {
                cur = cur.left;
                if(cur.left == null && cur.right == null) {
                    result = result + cur.data;
                    cur = root;
                }
            }

            if(ch == '1') {
                cur = cur.right;
                if(cur.left == null && cur.right == null) {
                    result = result + cur.data;
                    cur = root;
                }
            }

        }

        System.out.println(result);
    }

}
