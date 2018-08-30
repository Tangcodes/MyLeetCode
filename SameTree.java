package sametree;

public class SameTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p==null&&q!=null)|| (p!=null&&q==null)) return false;
        if (p==null && q==null) return true;
        else if (p.val==q.val) return (isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
        else return false;
    }
    
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        TreeNode p2 = new TreeNode(2);
        //TreeNode p3 = new TreeNode(3);
        TreeNode q = new TreeNode(1);
        TreeNode q1 = new TreeNode(2);
        TreeNode q2 = new TreeNode(2);
        //TreeNode r7 = new TreeNode(7);
        p.left=p2;
        //p.right=p3;
        //q.left=q1;
        q.right=q2;
        boolean ans = isSameTree(p,q);
        System.out.println(ans);
    }
    
}
