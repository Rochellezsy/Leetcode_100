public class Leet203 {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)return head;
        ListNode res=new ListNode(0);
        res.next=head;
        ListNode p=res;

        while(p!=null){
            while(p.next!=null && p.next.val==val){
                p.next=p.next.next;
            }
            p=p.next;
        }
        return res.next;

    }
}
