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
    public void insertEnd(int val){
        if(size==0||head==null) {
            insertFirst(val);
            return;
        }
        Node newNode=new Node(val,null,tail);
        tail.next=newNode;
        tail=newNode;
        size++;
    }

    public void insertMiddle(int val,int index){
        if(index>size) {
            System.out.println("Wrong Index");
            return;
        }
        if(index==size){
            insertEnd(val);
            return;
        }
        if(index==0){
            insertFirst(val);
            return;
        }
        Node newNode=new Node(val);
        Node before=find(index-1);
        Node after=find(index);
        newNode.next=after;
        after.prev=newNode;
        before.next=newNode;
        newNode.prev=before;
        size++;
    }

    public Node find(int index){
        if(head==null)
            return null;
        if(index==0){
            return head;
        }
        if(index==size-1)
            return tail;

        Node temp=head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp;
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
