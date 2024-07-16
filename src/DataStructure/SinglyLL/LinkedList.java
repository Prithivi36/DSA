package DataStructure.SinglyLL;

public class LinkedList {
    public Node head;
    private Node tail;
    private int size;


    public void insertFirst(int val){
        head= new Node(val,head);
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
    public void insertUsingRecursion(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        } else if (index==size) {
            insertEnd(val);
            return;
        }
        insertRecursion(val,index,head);
    }
    private Node insertRecursion(int val,int index,Node currentNode){
        if(index==0){
            Node node=new Node(val,currentNode);
            size++;
            return node;
        }
        index--;
        currentNode.next=(insertRecursion(val,index, currentNode.next));
        return currentNode;
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
        tail=node;
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

    //Merge Two Sorted LinkedList
    public static LinkedList MergeLinkedList(Node head1,Node head2) {
        Node temp1=head1;
        Node temp2=head2;
        LinkedList answerList=new LinkedList();
        while (temp1!=null&&temp2!=null){
            if(temp1.value< temp2.value){
                answerList.insertEnd(temp1.value);
                temp1=temp1.next;
            } else if (temp2.value< temp1.value) {
                answerList.insertEnd(temp2.value);
                temp2=temp2.next;
            }
        }
        while (temp1!=null){
            answerList.insertEnd(temp1.value);
            temp1=temp1.next;

        }while (temp2!=null){
            answerList.insertEnd(temp2.value);
            temp2=temp2.next;

        }

        return answerList;
    }
    //Create Cycle
    public void createCycle(int index){
        this.tail.next=getByIndex(index);
    }

    //Cycle Detection In Linked list

    public boolean detectCycle(Node head){
        Node slwPointer=head;
        Node fstPointer=head;

        while(fstPointer!=null&&fstPointer.next!=null){
            fstPointer=fstPointer.next.next;
            slwPointer=slwPointer.next;

            if(fstPointer==slwPointer){
                return true;
            }
        };

        return false;
    }


}
