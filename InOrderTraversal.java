import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x ){
            val =x;
        }

        public List<Integer> inorderTraversal(TreeNode root){

            Stack<TreeNode> stack = new Stack<>();
            List<Integer> list = new ArrayList<>();

            if(root == null){
                return list;
            }

            TreeNode current = root;

            while(current != null || !stack.isEmpty()){
                while(current!= null){

                    stack.push(current);
                    current = current.left;
                }
                current = stack.pop();
                list.add(current.val);
                current = current.right;
            }

            return list;

        }
    }



}
