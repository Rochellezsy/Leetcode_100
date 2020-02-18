import java.util.ArrayList;
import java.util.List;

public class Leet129 {
    public int sumNumbers(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        digui(root,list,0);
        int size=list.size();
        int result=0;
        for (Integer integer : list) {
            result+=integer;
        }
        return result;

    }

    public void digui(TreeNode root,List<Integer>list,int ans){
        if(root==null)return;
        if(root.left==null && root.right==null){
            ans=ans*10+root.val;
            list.add(ans);
        }

        digui(root.left,list,ans*10+root.val);
        digui(root.right,list,ans*10+root.val);

    }
}
