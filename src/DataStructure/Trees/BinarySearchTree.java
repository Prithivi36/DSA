package DataStructure.Trees;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    Node root;
    class Node{
        Node right;
        Node left;
        int height=0;
        int value;
        public Node(int value){
            this.value=value;
        }

    }
    public int height(Node node){
        if(node==null)
            return -1;
        return node.height;
    }
    public void display(){
        display("Root Node :",root);
    }
    public void populate(int[] nums){
        for(int num : nums){
            insert(num);
        }
    }
    public void display(String info,Node node){
        if(node==null){
            return;
        }
        System.out.println(info+node.value);
        display(node.value+"'s left is",node.left);
        display(node.value+"'s right is",node.right);
    }
    public void insert(int value){
        if(root==null){
            root=new Node(value);
        }
        insert(root,value);
    }
    public Node insert(Node node ,int value){
        if(node==null){
            return new Node(value);
        }
        if(value<node.value){
            node.left=insert(node.left,value);
        } else if (value>node.value) {
            node.right=insert(node.right,value);
        }
        node.height=Math.max(height(node.left), height(node.right))+1;
        return node;
    }
    public void printHeight(){
        printHeight("Height of root is",root);
    }
    public void printHeight(String message,Node node){
        if(node==null){
            return;
        }
        System.out.println(message+node.height);
        if(node.left!=null){
            printHeight(node.left.value+"'s height is",node.left);
        }
        if(node.right!=null){
            printHeight(node.right.value+"'s height is",node.right);
        }
    }
    public boolean isBalanced(){
        return isBalanced(root);
    }
    public boolean isBalanced(Node node){
        if(node==null){
            return true;
        }
        isBalanced(node.left);
        isBalanced(node.right);
        return Math.abs(height(node.left)-height(node.right))<1;
    }
    public void prefix(){
        System.out.println("Prefix Traversal");
        prefix(root);

    }
    public void prefix(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.value + " ");
        prefix(node.left);
        prefix(node.right);

    }

}
