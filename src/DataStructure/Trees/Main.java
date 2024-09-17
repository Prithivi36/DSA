package DataStructure.Trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.insert(new Scanner(System.in));
        binaryTree.print();

        BFS bfs = new BFS();
        System.out.println(bfs.levelOrder(binaryTree.root));
        //BST
//        BinarySearchTree bst=new BinarySearchTree();
//        bst.populate(new int[]{10,3,5,2,19,21,22,6});
//        bst.display();
//        bst.printHeight();
//        System.out.println(bst.isBalanced());
//        bst.prefix();
//        bst.infix();
//        bst.postfix();

//        AVLTree avlTree=new AVLTree();
//        avlTree.populate(new int[]{2,3,5,6,10,19,21,22});
//        avlTree.display();
//        System.out.println(avlTree.isBalanced());
    }
}
