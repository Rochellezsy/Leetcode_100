import java.lang.reflect.Method;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Leet226 {
    public TreeNode invertTree(TreeNode root) {

        if(root==null)return null;

        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

        invertTree(root.left);
        invertTree(root.right);


        return root;

    }

    public static void main(String[] args) {

        Class leetclass=Leet69.class;
        Method[] methods=leetclass.getMethods();
        for(Method method:methods){
            System.out.println(method);
            String name=method.getName();
            System.out.println(name);

        }


    }

}
