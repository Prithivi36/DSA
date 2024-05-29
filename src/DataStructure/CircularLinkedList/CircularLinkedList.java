package DataStructure.CircularLinkedList;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    private int size=0;

    private class Node{
        int val;
        Node next;

        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        if(head==null){
            node.next=node;
            head=node;
            tail=node;
            size++;
            return;
        }

        node.next=head;
        tail.next=node;
        head=node;
        size++;

    }
    public void insertLast(int val){
        Node node=new Node(val);
        if(tail==null){
            node.next=node;
            head=node;
            tail=node;
            size++;
            return;
        }
        node.next=head;
        tail.next=node;
        tail=node;
        size++;
    }
    public void display(){
        Node temp=head;
        if(size!=0){
            do{
                System.out.print(temp.val+"->");
                temp=temp.next;
            }while(temp.val!=head.val);
            System.out.println("START ("+temp.val+")");
        }
    }
    public void insertMiddle(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size-1){
            insertLast(val);
            return;
        }
        Node found=get(index-1);
        Node node=new Node(val,found.next);
        found.next=node;
        size++;
    }
    public Node get(int index){
        if(index>=size)
            return null;

        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }

}
