import java.util.LinkedList;
import java.util.Queue;

public class Leet116 {
    public Node connect(Node root) {
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                Node node=queue.poll();
                if(node!=null){
                    queue.add(node.left);
                    queue.add(node.right);
                    if(i==size-1){
                        node.next=null;
                    }
                    else {
                        node.next=queue.peek();
                    }
                }
            }
        }
        return root;
    }
}
