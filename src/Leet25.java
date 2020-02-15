import java.util.ArrayList;
import java.util.List;

public class Leet25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode fast=head;
        ListNode slow=head;
        int i=k;
        List<ListNode> list=new ArrayList<>();

        while(i>1){
            fast=fast.next;
            if(fast==null)return head;
            i--;
        }
        ListNode newhead=fast;

        int count=k;

        while(fast!=null){
            if(count==k){
                list.add(fast);
                count=0;
                ListNode temp=fast.next;
                fast.next=null;
                reverse(slow);
                fast=temp;
                slow=temp;
                count++;
                continue;
            }
            fast=fast.next;
            if(fast!=null){
                count++;
            }

        }
        if(fast==null && count!=k){
            list.add(slow);
        }

        int size=list.size();
        for (int j=0;j<size-1;j++) {
            merge(list.get(j),list.get(j+1));
        }

        return newhead;
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

    public void merge(ListNode l1,ListNode l2){
        while(l1!=null && l1.next!=null){
            l1=l1.next;
        }
        l1.next=l2;
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
