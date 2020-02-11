public class Leet23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)return null;
        if(lists.length==1)return lists[0];

        ListNode res=metge2lists(lists[0],lists[1]);
        for(int i=2;i<lists.length;i++){
            res=metge2lists(res,lists[i]);
        }
        return res;
    }

    public ListNode metge2lists(ListNode l1,ListNode l2){
        ListNode res=new ListNode(0);
        ListNode p=res;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                p.next=l1;
                l1=l1.next;
            }
            else if(l1.val>l2.val){
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
