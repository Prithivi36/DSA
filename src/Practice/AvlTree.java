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
        root=insert(root,val);
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
        node.height=Math.max(getHeight(node.left),getHeight(node.right))+1;

        return balance(node);

    }

    private Node leftRotate(Node node){
        Node child=node.right;
        Node childLeft=child.left;
        child.left=node;
        node.right=childLeft;
        child.height=Math.max(getHeight(child.left),getHeight(child.right))+1;
        node.height=Math.max(getHeight(node.left),getHeight(node.right))+1;
        return child;
    }
    private Node rightRotate(Node node){
        Node child=node.left;
        Node childRight=child.right;
        child.right=node;
        node.left=childRight;
        child.height=Math.max(getHeight(node.left),getHeight(node.right))+1;
        node.height=Math.max(getHeight(node.left),getHeight(node.right))+1;
        return child;
    }
    private Node balance(Node node){
        //left-weighted
        if(getHeight(node.left)-getHeight(node.right)>1){
            //left-left weighted
            if(getHeight(node.left.left)-getHeight(node.left.right)>=0){
                return rightRotate(node);
            }
            //left-right weighted
            node.left=leftRotate(node.left);
            return rightRotate(node);
        }
        //right weighted
        if(getHeight(node.left)-getHeight(node.right)<-1){
            //right-right weighted
            if(getHeight(node.right.left)-getHeight(node.right.right)<=0){
                return leftRotate(node);
            }
            //right-left weighted
            node.right=rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public void display(){
        display("Root Node :",root);
    }
    public void populate(int[] nums){
        for(int num : nums){
            insert(num);
        }
    }
    private void display(String info, Node node){
        if(node==null){
            return;
        }
        System.out.println(info+node.val);
        display(node.val+"'s left is",node.left);
        display(node.val+"'s right is",node.right);
    }

}
class Main{
    public static void main(String[] args) {
        AvlTree avlTree = new AvlTree();
        avlTree.populate(new int[] {9,8,7,6,5,4,3,2,1});
        avlTree.display();
    }
}
