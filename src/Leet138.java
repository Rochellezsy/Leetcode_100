

public class Leet138 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        Node p=head;
        while(p!=null){
            Node temp=new Node(p.val);
            temp.next=p.next;
            p.next=temp;
            p=p.next.next;
        }

        p=head;

        while(p!=null){
            if(p.random==null){
                p.next.random=null;
            }else {
                p.next.random=p.random.next;
            }
        }


        Node old=head;
        Node newhead=head.next;
        Node ptr=newhead;

        while(old!=null){
            old.next=old.next.next;
            ptr.next=ptr.next!=null?ptr.next.next:null;
            old=old.next;
            ptr=ptr.next;

        }
        return newhead;


    }
}
