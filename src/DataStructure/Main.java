package DataStructure;

public class Main {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insertFirst(5);
        ll.insertFirst(10);
        ll.insertFirst(15);
        ll.insertFirst(20);
        ll.insertEnd(55);
        ll.insertMiddle(51,2);
        ll.deleteFirst();
        ll.display();
    }
}
