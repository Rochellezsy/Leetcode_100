import java.util.ArrayList;
import java.util.List;

public class Leetoffer34 {
    List<List<Integer>>res=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        digui(root,0,sum,new ArrayList<>());
        return res;
    }

    public void digui(TreeNode root,int ans,int sum,List<Integer>list){
        if(root==null ){
            if(ans==sum){
                if(!res.contains(list)&& list.size()!=1){
                    res.add(list);
                }
                return;
            }
            return;
        }else {
            List<Integer>templist=new ArrayList<>(list);
            templist.add(root.val);
            ans=ans+root.val;
            digui(root.left,ans,sum,templist);
            digui(root.right,ans,sum,templist);
        }
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(2);
        root.left.right=new TreeNode(4);
        root.right=new TreeNode(6);

        Leetoffer34 test=new Leetoffer34();
        test.pathSum(root,16);
    }
}
