import java.util.HashSet;

public class Leet141 {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> HashNode=new HashSet<>();
        while(head!=null){
            if(HashNode.contains(head)){
                HashNode.add(head);
                head=head.next;
            }
            else return true;
        }
        return false;

    }
}
