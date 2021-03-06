public class Leetoffer36 {
    static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

    private Node head=null;
    private Node pre=null;
    private Node tail=null;

    public Node treeToDoublyList(Node root) {
        if(root==null)return null;
        inorder(root);
        head.left=tail;
        tail.right=head;
        return head;
    }

    public void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        if(pre==null){
            head=root;
        }
        else {
            pre.right=root;
            root.left=pre;
            pre=root;
            tail=root;
        }
        inorder(root.right);
    }



}
