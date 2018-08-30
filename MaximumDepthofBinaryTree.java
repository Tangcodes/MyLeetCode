package maximumdepthofbinarytree;

import java.util.List;

public class MaximumDepthofBinaryTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    
    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        return 1+Math.max(maxDepth(root.left),  maxDepth(root.right));
    }
    
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        TreeNode p2 = new TreeNode(2);
        TreeNode p3 = new TreeNode(20);
        TreeNode p4 = new TreeNode(15);
        TreeNode p5 = new TreeNode(7);
        //TreeNode p6 = new TreeNode(4);
        //TreeNode p7 = new TreeNode(3);
        p.left=p2;
        //p.right=p3;
        //p2.left=p4;
        //p2.right=p5;
        //p3.left=p4;
        //p3.right=p5;
        int ans = maxDepth(p);
        System.out.println(ans);
    }
    
}
