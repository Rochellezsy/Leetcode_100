public class Leet25_1 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur = head;
        int count = 0;
        while (cur != null && count != k) {
            cur = cur.next;
            count++;
        }
        if (count == k) {
            cur = reverseKGroup(cur, k);
            while (count != 0) {
                count--;
                ListNode tmp = head.next;
                head.next = cur;
                cur = head;
                head = tmp;
            }
            head = cur;
        }
        return head;
    }

    public ListNode reverse(ListNode head){
        ListNode cur=null;
        ListNode p=head;
        while(p!=null){
            ListNode temp=p.next;
            p.next=cur;
            cur=p;
            p=temp;
        }
        return cur;

    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode p=head;
        for(int i=1;i<5;i++){
            p.next=new ListNode(i+1);
            p=p.next;
        }
        Leet25 test=new Leet25();
        test.reverseKGroup(head,2);

    }
}
