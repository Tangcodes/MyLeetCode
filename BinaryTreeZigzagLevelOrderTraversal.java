package binarytreezigzaglevelordertraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal {
    
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        levelHelper(res, root, 0,0);
        return res;
    }
    
    public static void levelHelper(List<List<Integer>> res, TreeNode root, int height,int dir) {
        if (root == null) return;
        if (height >= res.size()) {
            res.add(new LinkedList<Integer>());
        }
        //res.get(height).add(root.val);
        if (dir%2==0) res.get(height).add(root.val);
        else res.get(height).add(0,root.val);
        levelHelper(res, root.left, height+1,dir+1);
        levelHelper(res, root.right, height+1,dir+1);
    }
    
    public static void main(String[] args) {
        TreeNode p = new TreeNode(3);
        TreeNode p2 = new TreeNode(9);
        TreeNode p3 = new TreeNode(20);
        TreeNode p4 = new TreeNode(15);
        TreeNode p5 = new TreeNode(7);
        //TreeNode p6 = new TreeNode(4);
        //TreeNode p7 = new TreeNode(3);
        p.left=p2;
        p.right=p3;
        //p2.left=p4;
        //p2.right=p5;
        p3.left=p4;
        p3.right=p5;
        List<List<Integer>> ans = zigzagLevelOrder(p);
        System.out.println(ans);
    }
    
}
