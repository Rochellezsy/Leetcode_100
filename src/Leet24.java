public class Leet24 {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode fast=head.next;
        ListNode slow=head;

        ListNode temp=fast.next;
        fast.next=null;
        fast.next=slow;
        slow.next=swapPairs(temp);
        return fast;

    }

}
