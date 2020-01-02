/**
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 */
public class Leet19_1 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res=new ListNode(0);
        res.next=head;
        ListNode pre=res;
        ListNode last=res;
        for(int i=0;i<n;i++){
            pre=pre.next;
        }
        while(pre.next!=null){
            pre=pre.next;
            last=last.next;
        }
        last.next=last.next.next;
        return res.next;


    }

}
