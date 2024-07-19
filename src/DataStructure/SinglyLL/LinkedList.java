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
            Node newNode=new Node(val,currentNode);
            return newNode;
        }

        currentNode.next=insertRecursion(val,index-1,currentNode.next);
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
        int value;
        Node next;

        public Node(int val){
            this.value=val;
        }
        public Node(int val,Node next){
            this.value=val;
            this.next=next;
        }

    }

    //Merge Two Sorted LinkedList
    public Node mergeLinkedList(Node head1,Node head2) {
        Node temp1=head1;
        Node temp2=head2;
        Node dummy=new Node(0);
        Node tail=dummy;
        while (temp1!=null&&temp2!=null){
            if(temp1.value< temp2.value){
                tail.next=temp1;
                temp1=temp1.next;
                tail=tail.next;
            } else if (temp2.value< temp1.value) {
                tail.next=temp2;
                temp2=temp2.next;
                tail=tail.next;
            }else{
                tail.next=temp1;
                temp1=temp1.next;
                tail=tail.next;
                tail.next=temp2;
                temp2=temp2.next;
                tail=tail.next;
            }
        }
        while (temp1!=null){
            tail.next=temp1;
            tail=tail.next;
            temp1=temp1.next;

        }while (temp2!=null){
            tail.next=temp2;
            tail=tail.next;
            temp2=temp2.next;

        }

        return dummy.next;
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

    //Cycle Length In Linked list

    public int cycleLength(Node head){
        Node slwPointer=head;
        Node fstPointer=head;

        while(fstPointer!=null&&fstPointer.next!=null){
            fstPointer=fstPointer.next.next;
            slwPointer=slwPointer.next;

            if(fstPointer==slwPointer){
                int len=0;
                do{
                    slwPointer=slwPointer.next;
                    len++;
                }while (fstPointer!=slwPointer);

                return len;
            }
        };

        return 0;
    }

    //Finding the Cycle Node
    public Node cycleNode(Node node){
        Node slwPointer=head;
        Node fstPointer=head;
        while(fstPointer!=null&&fstPointer.next!=null){
            fstPointer=fstPointer.next.next;
            slwPointer=slwPointer.next;
            if(fstPointer==slwPointer){
                int cycLen=cycleLength(head);
                fstPointer=head;
                for (int i=0;i<cycLen;i++){
                    slwPointer=slwPointer.next;
                }
                while (slwPointer!=fstPointer){
                    slwPointer=slwPointer.next;
                    fstPointer=fstPointer.next;
                }
                return fstPointer;
            }
        }
        return null;
    }

    //Finding Middle of the Linked list
    public Node findMiddle(Node head){
        Node fstPointer=head;
        Node slwPointer=head;
        while(fstPointer!=null&&fstPointer.next!=null){
            fstPointer=fstPointer.next.next;
            slwPointer=slwPointer.next;
        }
        return slwPointer;
    }

    //Sorting a Linked list
    public Node sortLinkedList(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node mid=getMiddle(head);
        Node left=sortLinkedList(head);
        Node right=sortLinkedList(mid);

        return mergeLinkedList(left,right);
    }
    public Node getMiddle(Node head){
        Node slw=head;
        Node fst=head;
        Node temp=slw;
        while(fst!=null&&fst.next!=null){
            temp=slw;
            fst=fst.next.next;
            slw=slw.next;
        }
        temp.next=null;
        return slw;
    }

    //Reverse Elements of Linked List
    public Node reverseLinkedList(Node head){

        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseLinkedList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
