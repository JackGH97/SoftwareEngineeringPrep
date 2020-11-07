package com.hawkins.AlgoExpert.Medium;


// Average Case: O(log(n)) Time || O(1) Space
// Worse Case: O(n) Time || O(1) Space
public class BSTConstructionIterative {

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            BST currentNode = this;
            while(true) {
                if (value < currentNode.value) {
                    if (currentNode.left == null) {
                        currentNode.left = new BST(value);
                        break;
                    } else {
                        currentNode = currentNode.left;
                    }
                } else {
                    if (currentNode.right == null) {
                        currentNode.right = new BST(value);
                        break;
                    }
                    else {
                        currentNode = currentNode.right;
                    }
                }
            }
            return this;
        }

        public boolean contains(int value) {
            BST currentNode = this;
            while(true) {
                if(value == currentNode.value){
                    return true;
                }
                else if(value < currentNode.value){
                    if(currentNode.left != null){
                        currentNode =  currentNode.left;
                    } else {
                        return false;
                    }
                }
                else if(value > currentNode.value){
                    if(currentNode.right != null){
                        currentNode = currentNode.right;
                    } else {
                        return false;
                    }
                }
            }
        }

        public BST remove(int value) {
            remove(value,null);
            return this;
        }


        public void remove(int value, BST parent) {
            BST currentNode = this;
            while (currentNode != null) {
                if (value < currentNode.value) {
                    parent = currentNode;
                    currentNode = currentNode.left;
                } else if (value > currentNode.value) {
                    parent = currentNode;
                    currentNode = currentNode.right;
                } else {
                    if (currentNode.left != null && currentNode.right != null) {
                        currentNode.value = currentNode.right.getMinValue();
                        currentNode.right.remove(currentNode.value, currentNode);
                    } else if (parent == null) {
                        if (currentNode.left != null) {
                            currentNode.value = currentNode.left.value;
                            currentNode.right = currentNode.left.right;
                            currentNode.left = currentNode.left.left;
                        }
                        if (currentNode.right != null) {
                            currentNode.value = currentNode.right.value;
                            currentNode.left = currentNode.right.left;
                            currentNode.right = currentNode.right.right;
                        }
                    } else if (parent.left == currentNode) {
                        parent.left = currentNode.left != null ? currentNode.left : currentNode.right;
                    } else if (parent.right == currentNode) {
                        parent.right = currentNode.left != null ? currentNode.left : currentNode.right;
                    }
                }
            }
        }


        public int getMinValue(){
            if(left == null){
                return value;
            }
            else{
                return left.getMinValue();
            }
        }

    }
}
