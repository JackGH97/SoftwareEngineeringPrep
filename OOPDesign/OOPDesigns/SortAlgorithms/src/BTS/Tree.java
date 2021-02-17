package BTS;

public class Tree {

    private TreeNode root;

    public void insertNode(int value){
        if(root == null){
            root = new TreeNode(value);
        }
        else{
            root.insert(value);
        }
    }

    public void traverseInOrder(){
        if(root!= null){
            root.traverseInOrder();
        }
    }


    public TreeNode get(int value){
        if(root != null){
            return  root.get(value);
        }
        return null;
    }

    public void deleteNode(int value){
        root = delete(root,value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value){
        if(subtreeRoot == null){
            return null;
        }
        if(value < subtreeRoot.getData()){
            // If the value is less than the root of the subtree we're searching
            // move to the subtrees left child and replace with what we're searching for
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(),value));
        }
        else if(value > subtreeRoot.getData()){
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(),value));
        }
        else{
            //cases 0 and 1 : node to delete has zero or 1 children
            if(subtreeRoot.getLeftChild() == null){
                return subtreeRoot.getRightChild();
            }
            else if (subtreeRoot.getRightChild() == null){
                return subtreeRoot.getLeftChild();
            }
            // case 3, node has two children
            // replace the value in the subtreeRoot node with the smallest value from the right subtree
            subtreeRoot.setData(subtreeRoot.getRightChild().getMin());
            // delete the node that hasw the smallest value in the right subtree
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(),subtreeRoot.getData()));
        }
        return subtreeRoot;
    }

    public int getMin(){
        if(root != null){
            return root.getMin();

        }
        return Integer.MIN_VALUE;

    }

    public int getMax(){
        if(root != null){
            return root.getMax();
        }
        return Integer.MAX_VALUE;
    }
}
