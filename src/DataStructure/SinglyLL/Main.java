package DataStructure.SinglyLL;

public class Main {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insertFirst(5);
        ll.insertFirst(10);
        ll.insertFirst(15);
        ll.insertFirst(20);
        ll.insertEnd(55);
        ll.insertMiddle(51,2);
        ll.display();
        ll.deleteFirst();
        ll.display();
        ll.getSize();
        ll.delteLast();
        ll.display();
        ll.deleteMiddle(2);
        ll.display();


    }
}