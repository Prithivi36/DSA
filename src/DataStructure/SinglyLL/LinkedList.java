package DataStructure.SinglyLL;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;


    public void insertFirst(int val){
        Node newNode= new Node(val);
        newNode.next=head;
        head=newNode;
        size++;

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
        size++;
    }

    public void insertMiddle(int val,int index){
        if(index==0) {
            insertFirst(val);
            return;
        }
        if(index==size){
            insertEnd(val);
            return;
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node newNode=new Node(val,temp.next);
        temp.next=newNode;
        size++;

    }

    public void deleteFirst(){
        if(head==null) {
            System.out.println("No element");
            return;
        }
        head=head.next;
        size--;
    }
    public void delteLast(){
        if(size<=1){
            deleteFirst();
            return;
        }

        Node node=getByIndex(size-2);
        node.next=null;
        size--;

    }
    public void deleteMiddle(int index){
        if(index==0){
            deleteFirst();
            return;
        }if(index==size-1){
            delteLast();
            return;
        }
        if(index>size-1){
            System.out.println("Out of Bounds");
            return;
        }
        Node node=getByIndex(index-1);
        node.next=node.next.next;
        size--;

    }
    public Node getByIndex(int index){
        if(index>size-1){
            return null;
        }
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }

        return node;
    }

    public void display(){
        if(size==0){
            System.out.println("Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ->");
            temp=temp.next;
        }
        System.out.println("End");
    }

    public void getSize(){
        System.out.println(size);
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
