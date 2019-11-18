public class Leet19_2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode start=dummy;
        ListNode end=dummy;

        while(n>0){
            start=start.next;
            n--;
        }

        while(start.next!=null){
            start=start.next;
            end=end.next;
        }
        end.next=end.next.next;

        return dummy.next;


    }
}
