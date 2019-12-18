public class Leet141_2 {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode slow=head;
        ListNode fast=head.next;
        while(slow!=fast){
            if(slow==fast) return true;
            slow=slow.next;
            fast=fast.next.next;

        }
        return true;


    }

}
