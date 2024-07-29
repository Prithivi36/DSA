package DataStructure.Trees;

import java.util.Scanner;

public class BinaryTree {

    Node root;

    class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node left,Node right){
            this.value=value;
            this.left=left;
            this.right=right;
        }
    }

    public void insert(Scanner scanner){
        System.out.println("Enter value for root Node");
        int value= scanner.nextInt();
        root=new Node(value);
        populate(scanner,root);
    }
    public void populate(Scanner sc,Node node){
        System.out.println("Do you wish to enter on left of "+node.value+" ?");
        boolean left=sc.nextBoolean();
        if(left){
            System.out.print("Enter left value : ");
            int value=sc.nextInt();
            node.left=new Node(value);
            populate(sc,node.left);
        }
        System.out.println("Do you wish to enter on right "+node.value+" ?");
        boolean right=sc.nextBoolean();
        if(right){
            System.out.print("Enter value for right : ");
            int value=sc.nextInt();
            node.right=new Node(value);
            populate(sc,node.right);
        }
    }
    public void print(){
        printTree(root);
    }
    public void printTree(Node node){

        if(node==null)
            return;

        System.out.println(node.value);
        printTree(node.left);
        printTree(node.right);
    }
}
