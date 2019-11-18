public class Leet0021 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res=new ListNode(0);
        ListNode p=res;

        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                p.next=l1;
                l1=l1.next;
                p=p.next;
            }
            else if(l1.val>l2.val){
                p.next=l2;
                l2=l2.next;
                p=p.next;
            }

        }
        if(l1==null){
            p.next=l2;
        }
        if(l2==null){
            p.next=l1;
        }
        return res.next;

    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(4);

        ListNode l2=new ListNode(1);
        l2.next=new ListNode(3);
        l2.next.next=new ListNode(4);

        Leet0021 test=new Leet0021();

        ListNode now=test.mergeTwoLists(l1,l2);
        while (now!=null){
            System.out.print(now.val+" ");
            now=now.next;
        }
    }
}
