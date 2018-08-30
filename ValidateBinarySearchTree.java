package validatebinarysearchtree;

import java.util.Stack;

public class ValidateBinarySearchTree {
    
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    
    public static boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(pre != null && root.val <= pre.val) return false;
            pre = root;
            root = root.right;
        }
        return true;
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode r2 = new TreeNode(-1);
        TreeNode r3 = new TreeNode(-1);
        //TreeNode r4 = new TreeNode(null);
        //TreeNode r5 = new TreeNode(null);
        //TreeNode r6 = new TreeNode(3);
        //TreeNode r7 = new TreeNode(7);
        //root.left=r2;
        root.right=r3;
        //r3.left=r6;
        //r3.right=r7;
        boolean ans = isValidBST(root);
        System.out.println(ans);
    }
    
}
