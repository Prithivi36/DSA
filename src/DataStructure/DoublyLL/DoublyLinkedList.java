package DataStructure.DoublyLL;

import DataStructure.SinglyLL.LinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(int val){
        Node newNode=new Node(val,head,null);
        if(size>0)
            head.prev=newNode;
        head=newNode;
        if(tail==null)
            tail=head;
        size++;
    }
    public void display(){
        if(size==0){
            System.out.println("Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ->");
            temp=temp.next;
        }
        System.out.println("End");
    }
    public void displayReverse(){
        if(size==0){
            System.out.println("Empty");
            return;
        }
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.val+" ->");
            temp=temp.prev;
        }
        System.out.println("Start");
    }

    private class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }
}
