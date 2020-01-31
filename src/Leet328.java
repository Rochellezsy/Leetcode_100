public class Leet328 {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null ||head.next.next==null){
            return head;
        }
        ListNode p=new ListNode(0);
        ListNode q=new ListNode(1);
        ListNode phead=p;
        ListNode qhead=q;

        while(head!=null && head.next!=null){
            p.next=head;
            q.next=head.next;
            p=p.next;
            q=q.next;
            head=head.next.next;
        }
        if(head!=null){
            p.next=head;
            q.next=null;
            p=p.next;
        }
        p.next=qhead.next;
        return phead.next;


    }
}
