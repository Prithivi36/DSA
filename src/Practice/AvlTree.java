package Practice;

import DataStructure.Trees.AVLTree;
import DataStructure.Trees.BinarySearchTree;

import java.util.HashMap;
import java.util.Map;

public class AvlTree {
    Node root;
    private class Node{
        int val;
        Node left;
        Node right;
        int height;

        public Node(int val){
            this.val=val;
        }
    }
    public int getHeight(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }

    public void insert(int val){
        if(root==null){
            root=new Node(val);
        }
        insert(root,val);
    }

    private Node insert(Node node,int val){
        if(node==null){
            return new Node(val);
        }
        if(val< node.val){
            node.left=insert(node.left,val);
        }
        if(val> node.val){
            node.right=insert(node.right,val);
        }
        node.height=Math.max(getHeight(node.left),getHeight(node.right));
        return node;

    }

}

