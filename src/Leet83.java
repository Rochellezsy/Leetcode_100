/*
输入: 1->1->2->3->3
输出: 1->2->3
 */
public class Leet83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p=head;
        while(p!=null){
            if(p.next!=null && p.val==p.next.val){
                p.next=p.next.next;
                continue;
            }
            p=p.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(3);
        l1.next=new ListNode(3);
        l1.next.next=new ListNode(3);
        Leet83 test=new Leet83();
        ListNode res=test.deleteDuplicates(l1);
        while (res!=null){
            System.out.println(res.val);
            res=res.next;
        }

    }

}
