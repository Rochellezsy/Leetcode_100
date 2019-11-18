import java.util.List;

public class Leet19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy=new ListNode(0);
        dummy.next=head;
        int count=0;

        while(head!=null){
            count++;
            head=head.next;
        }
        int ans=count-n;

        ListNode p=dummy;

        while(ans>0){
            ans--;
            p=p.next;
        }
        p.next=p.next.next;

        return dummy.next;

    }

}
