package symmetrictree;

public class SymmetricTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    
    public static boolean isSymmetric(TreeNode root) {
        return root==null || isSymmetricHelp(root.left, root.right);
    }

    private static boolean isSymmetricHelp(TreeNode left, TreeNode right){
        if(left==null || right==null) return left==right;
        if(left.val!=right.val) return false;
        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    }
    
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        TreeNode p2 = new TreeNode(2);
        TreeNode p3 = new TreeNode(2);
        TreeNode p4 = new TreeNode(3);
        TreeNode p5 = new TreeNode(4);
        TreeNode p6 = new TreeNode(4);
        TreeNode p7 = new TreeNode(3);
        p.left=p2;
        p.right=p3;
        p2.left=p4;
        p2.right=p5;
        p3.left=p6;
        p3.right=p7;
        boolean ans = isSymmetric(p);
        System.out.println(ans);
    }
}
