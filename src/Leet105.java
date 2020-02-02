import javax.swing.*;
import java.util.Arrays;

public class Leet105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0)return null;
        int val=preorder[0];
        TreeNode root=new TreeNode(val);
        int index=0;
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==val){
                index=i;
            }
        }
        root.left=buildTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));
        root.right=buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));

        return root;
    }
}
