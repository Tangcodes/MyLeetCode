package mergetwobinarytrees;

public class MergeTwoBinaryTrees {
    
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1==null && t2==null) return null;
        if (t1==null) return t2;
        if (t2==null) return t1;
        TreeNode ans = new TreeNode(t1.val+t2.val);
        ans.left=mergeTrees(t1.left,t2.left);
        ans.right=mergeTrees(t1.right,t2.right);
        return ans;   
    }
    
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t10 = new TreeNode(3);
        TreeNode t11 = new TreeNode(2);
        TreeNode t12 = new TreeNode(5);
        t1.left=t10;t1.right=t11;t10.left=t12;
        TreeNode t2 = new TreeNode(2);
        TreeNode t20 = new TreeNode(1);
        TreeNode t21 = new TreeNode(3);
        TreeNode t22 = new TreeNode(4);
        TreeNode t23 = new TreeNode(7);
        t2.left=t20;t2.right=t21;t20.right=t22;t21.right=t23;
        TreeNode ans = mergeTrees(t1,t2);
        int a=0;
    }
    
}
