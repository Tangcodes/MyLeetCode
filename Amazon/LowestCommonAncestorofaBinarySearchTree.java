package lowestcommonancestorofabinarysearchtree;

public class LowestCommonAncestorofaBinarySearchTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) return null;
        if(root.val<Math.min(p.val,q.val)) return lowestCommonAncestor(root.right,p,q);
        if(root.val>Math.max(p.val,q.val)) return lowestCommonAncestor(root.left,p,q);
        return root;
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        TreeNode r2 = new TreeNode(2);
        TreeNode r3 = new TreeNode(8);
        TreeNode r4 = new TreeNode(0);
        TreeNode r5 = new TreeNode(4);
        TreeNode r6 = new TreeNode(7);
        TreeNode r7 = new TreeNode(9);
        root.left=r2;root.right=r3;
        r2.left=r4;r2.right=r5;
        r3.left=r6;r3.right=r7;
        r4.left=null;r4.right=null;
        r5.left=null;r5.right=null;
        r6.left=null;r6.right=null;
        r7.left=null;r7.right=null;
        TreeNode p = new TreeNode(0);
        TreeNode q = new TreeNode(9);
        TreeNode ans = lowestCommonAncestor(root,p,q);
        System.out.println(ans.val);
        
    }
    
}
