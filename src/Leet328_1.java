public class Leet328_1 {
    public ListNode oddEvenList(ListNode head) {
        if(head==null|| head.next==null ||head.next.next==null)return head;
        ListNode p=head;
        ListNode phead=p;
        ListNode q=head.next;
        ListNode qhead=q;

        while(q!=null && q.next!=null){
            p.next=q.next;
            q.next=q.next.next;
            p=p.next;
            q=q.next;
        }
        p.next=qhead;
        return phead;


    }
}
