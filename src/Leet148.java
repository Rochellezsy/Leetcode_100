import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leet148 {
    public ListNode sortList(ListNode head){
        List<Integer> list=new ArrayList<>();
        while (head!=null){
            list.add(head.val);
            head=head.next;
        }
        Collections.sort(list);
        ListNode res=new ListNode(0);
        ListNode p=res;
        for (int i=0;i<list.size();i++) {
            p.next=new ListNode(list.get(i));
            p=p.next;
        }
        return res.next;
    }

}
