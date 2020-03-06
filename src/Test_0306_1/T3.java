package Test_0306_1;


import java.util.Arrays;

public class T3 {
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length==0){
            return null;
        }
        TreeNode root=new TreeNode(preorder[0]);
        int mid=1;
        while(mid<preorder.length && preorder[mid]<preorder[0]){
            mid++;
        }
        root.left=bstFromPreorder(Arrays.copyOfRange(preorder,1,mid));
        root.right=bstFromPreorder(Arrays.copyOfRange(preorder,mid,preorder.length));
        return root;

    }

    public static void main(String[] args) {
        int[]num={8,5,1,7,10,12};
        T3 t3=new T3();
        System.out.println(t3.bstFromPreorder(num).val);
    }
}
