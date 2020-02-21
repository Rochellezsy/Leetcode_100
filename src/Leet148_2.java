public class Leet148_2 {
    public ListNode sortList(ListNode head) {
        if(head==null ||head.next==null)return head;
        ListNode fast=head.next;
        ListNode new1=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode temp=slow.next;
        slow.next=null;
        ListNode left=sortList(new1);
        ListNode right=sortList(temp);
        return merge(left,right);

    }

    public ListNode merge(ListNode l1,ListNode l2){
        ListNode res=new ListNode(0);
        ListNode p=res;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                p.next=l1;
                l1=l1.next;
            }
            else {
                p.next=l2;
                l2=l2.next;
            }
            p=p.next;
        }
        if(l1==null){
            p.next=l2;
        }
        if(l2==null){
            p.next=l1;
        }
        return res.next;
    }
}
