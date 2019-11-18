/*
给出两个 非空 的链表用来表示两个非负的整数。
其中，它们各自的位数是按照 逆序 的方式存储的，
并且它们的每个节点只能存储 一位 数字。
 */

public class Leet02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum =new ListNode(0);
        ListNode k=sum;
        int c=0;

        while(l1!=null || l2!=null){
            int p1=(l1!=null)?l1.val:0;
            int p2=(l2!=null)?l2.val:0;
            int result;
            result=p1+p2+c;

            k.next=new ListNode(result%10);
            c=result/10;

            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
            k=k.next;
        }
        if(c==1){
            k.next=new ListNode(c);
        }


        return sum.next;




    }

    public static void main(String[] args){
        ListNode l1=new ListNode(8);
        l1.next=new ListNode(8);
        l1.next.next=new ListNode(9);
        ListNode l2=new ListNode(3);
        l2.next=new ListNode(2);

        Leet02 test=new Leet02();
        ListNode res=test.addTwoNumbers(l1,l2);

        while(res!=null){
            System.out.println(res.val);
            res=res.next;

        }


    }
}
