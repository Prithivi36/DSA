package DataStructure.DoublyLL;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.insertEnd(5);
        dll.insertEnd(50);
        dll.insertEnd(500);
        dll.display();
        dll.displayReverse();
    }
}
