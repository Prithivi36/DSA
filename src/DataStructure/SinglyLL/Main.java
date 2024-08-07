package DataStructure.SinglyLL;

public class Main {
    public static void main(String[] args) {
//        LinkedList ll=new LinkedList();
//        ll.insertFirst(5);
//        ll.insertFirst(10);
//        ll.insertFirst(15);
//        ll.insertFirst(20);
//        ll.insertEnd(55);
//        ll.insertMiddle(51,2);
//        ll.display();
//        ll.deleteFirst();
//        ll.display();
//        ll.getSize();
//        ll.delteLast();
//        ll.display();
//        ll.deleteMiddle(2);
//        ll.display();
//        ll.getSize();
//        ll.insertUsingRecursion(21,3);
//        ll.display();
//
//
//        //Merging Two LL
//        System.out.println("\n\nMerging Two Linked Sorted List \n");
        LinkedList list=new LinkedList();

        list.insertEnd(7);
        list.insertEnd(11);
        list.insertEnd(10);
        list.insertEnd(1);
        list.insertEnd(5);
        list.insertEnd(9);
        list.insertEnd(3);
        list.display();

        LinkedList list2=new LinkedList();

        list2.insertEnd(4);
        list2.insertEnd(12);
        list2.insertEnd(8);
        list2.insertEnd(6);
        list2.insertEnd(2);
        list2.insertEnd(10);
        list2.display();

//        list2.mergeLinkedList(list.head, list2.head);
//        list.display();

        LinkedList.Node recLL= list2.reverseLinkedList(list2.head);
        while(recLL!=null){
            System.out.print(recLL.value +" ->");
            recLL=recLL.next;
        }

        System.out.println("END");

        LinkedList.Node reversed =list.reverseLL(list.head);
        while(reversed!=null){
            System.out.print(reversed.value+ " ->");
            reversed=reversed.next;
        }
        System.out.println("END");



    }
}
