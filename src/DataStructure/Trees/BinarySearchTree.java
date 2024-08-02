package DataStructure.Trees;

public class BinarySearchTree {
    Node root;
    class Node{
        Node right;
        Node left;
        int height;
        int value;
        public Node(int value){
            this.value=value;
        }
        public int height(){
            return this.height;
        }
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
        return node;
    }
}
