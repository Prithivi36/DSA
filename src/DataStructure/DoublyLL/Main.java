package DataStructure.DoublyLL;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.insertFirst(5);
        dll.insertFirst(10);
        dll.insertFirst(15);
        dll.display();
        dll.displayReverse();
    }
}
