import java.util.ArrayList;
import java.util.List;

public class Leet297 {
    public StringBuilder reserialize(TreeNode root,StringBuilder s){
        if(root==null){
            s.append("null,");
        }
        else {
            s.append(root.val);
            s.append(",");
            reserialize(root.left,s);
            reserialize(root.right,s);
        }
        return s;
    }


    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder s=new StringBuilder();
        reserialize(root,s);
        return s.toString();

    }

    // Decodes your encoded data to tree.
    public TreeNode redeserialize(List<String>list){
        if(list.get(0).equals("null")){
            list.remove(0);
            return null;
        }
        else {
            TreeNode root=new TreeNode(Integer.valueOf(list.get(0)));
            list.remove(0);
            root.left=redeserialize(list);
            root.right=redeserialize(list);
            return root;
        }
    }

    public TreeNode deserialize(String data) {
        String[]datas=data.split(",");
        List<String> list=new ArrayList<>();
        for (String da : datas) {
            list.add(da);
        }
        return redeserialize(list);

    }

}
