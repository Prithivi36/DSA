package DataStructure.Trees;

import java.util.ArrayList;
import java.util.List;

public class AVLTree {
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
        root=insert(root,value);
    }
    public Node rightRotate(Node node){
        Node c =node.left;
        Node t=node.left.right;

        c.right=node;
        node.left=t;
        c.height=Math.max(height(node.left), height(node.right))+1;
        node.height=Math.max(height(node.left), height(node.right))+1;

        return c;

    }
    public Node leftRotate(Node node){
        Node c =node.right;
        Node t=node.right.left;

        c.left=node;
        node.right=t;
        c.height=Math.max(height(node.left), height(node.right))+1;
        node.height=Math.max(height(node.left), height(node.right))+1;

        return c;

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
        return rotate(node);
    }
    public Node rotate(Node node){
        //left weighted
        if(height(node.left)-height(node.right)>1){
            //left -  left case
            //left -right case
            if( height(node.left.left)-height(node.left.right)>0){
                return rightRotate(node);
            }else {
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if(height(node.left)-height(node.right)<-1){
            //right -  right case

            //left -right case
            if(height(node.right.left)-height(node.right.right)<0){
                return leftRotate(node);
            }else {
                node.right=rightRotate(node.right);
                return leftRotate(node);
            }
        }
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
    public void infix(){
        System.out.println("\nInfix Traversal");
        infix(root);
    }
    public void infix(Node node){
        if(node==null){
            return;
        }
        prefix(node.left);
        System.out.print(node.value +" ");
        prefix(node.right);
    }
    public void postfix(){
        System.out.println("\nPostfix Traversal");
        postfix(root);
    }
    public void postfix(Node node){
        if(node ==null){
            return;
        }
        postfix(node.left);
        postfix(node.right);
        System.out.print(node.value+" ");
    }
}
