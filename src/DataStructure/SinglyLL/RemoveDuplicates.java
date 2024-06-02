package DataStructure.SinglyLL;

public class RemoveDuplicates {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    //Passed

    public static ListNode deleteDuplicates(ListNode head){
        ListNode temp=head;
        while (temp!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }else {
                temp=temp.next;
            }
        }
        return head;
    }
}
