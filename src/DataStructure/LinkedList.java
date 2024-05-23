package DataStructure;

public class LinkedList {
    private Node head;
    private Node tail;


    public void insertFirst(int val){
        Node newNode= new Node(val);
        newNode.next=head;
        head=newNode;

        if(tail==null){
            tail=head;
        }
    }
    public void insertEnd(int  val){
        Node newNode=new Node(val);
        if(tail==null){
            insertFirst(val);
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ->");
            temp=temp.next;
        }
        System.out.println("End");
    }


    class Node{
        private int value;
        private Node next;

        public Node(int val){
            this.value=val;
        }
        public Node(int val,Node next){
            this.value=val;
            this.next=next;
        }

    }
}
