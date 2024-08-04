package DataStructure.Trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //BinaryTree binaryTree=new BinaryTree();
        //binaryTree.insert(new Scanner(System.in));
        //binaryTree.print();
        //BST
        BinarySearchTree bst=new BinarySearchTree();
        bst.populate(new int[]{10,3,5,2,19,21,15});
        bst.display();
        bst.printHeight();
        System.out.println(bst.isBalanced());
    }
}
