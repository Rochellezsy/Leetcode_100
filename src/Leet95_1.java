import java.util.ArrayList;
import java.util.List;

public class Leet95_1 {
    public List<TreeNode> generateTrees(int n) {
        if(n==0)return new ArrayList<>();
        return gen(1,n);
    }

    public List<TreeNode> gen(int start,int end){
        List<TreeNode>list=new ArrayList<>();
        if(start>end){
            list.add(null);
            return list;
        }
        for(int i=start;i<=end;i++){
            List<TreeNode>left=gen(start,i-1);
            List<TreeNode>right=gen(i+1,end);

            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode cur=new TreeNode(i);
                    cur.left=l;
                    cur.right=r;
                    list.add(cur);
                }
            }

        }
        return list;
    }
}
