package com.hawkins.AlgoExpert.Medium;

// Average Case: O(log(n)) Time || O(log(n)) Space
// Worse Case: O(n) Time || O(n) Space
public class BSTConstructionRecursive {

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            if(value < this.value){
                if(left == null){
                    BST bst = new BST(value);
                    left = bst;
                } else {
                    left.insert(value);
                }
            }
            else if(value >= this.value){
                if(right == null){
                    BST bst = new BST(value);
                    right = bst;
                } else {
                    right.insert(value);
                }
            }
            return this;
        }

        public boolean contains(int value) {
            if(value == this.value){
                return true;
            }
            else if(value < this.value){
                if(left != null){
                    return left.contains(value);
                } else {
                    return false;
                }
            }
            else if(value > this.value){
                if(right != null){
                    return right.contains(value);
                } else {
                    return false;
                }
            }
            return false;
        }

        public BST remove(int value) {
            remove(value,null);
            return this;
        }


        public void remove(int value, BST parent){
            if(value < this.value){
                if(left != null){
                    left.remove(value,this);
                }
            }
            else if(value > this.value){
                if(right != null){
                    right.remove(value,this);
                }
            }
            else{
                if(left != null && right !=null){
                    this.value = right.getMinValue();
                    right.remove(this.value,this);
                }
                else if(parent == null){
                    if(left !=null){
                        this.value = left.value;
                        right = left.right;
                        left = left.left;
                    }
                    if(right != null){
                        this.value = right.value;
                        left = right.left;
                        right = right.right;
                    }
                }
                else if(parent.left == this){
                    parent.left = left != null ? left : right;
                }
                else if(parent.right == this){
                    parent.right = left != null ? left : right;
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
