package binarytreelevelordertraversalii;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        levelMaker(wrapList, root, 0);
        return wrapList;
    }
        
    public static void levelMaker(List<List<Integer>> list, TreeNode root, int level) {
        if(root == null) return;
        if(level >= list.size()) {
            list.add(0, new LinkedList<Integer>());
        }
        levelMaker(list, root.left, level+1);
        levelMaker(list, root.right, level+1);
        list.get(list.size()-level-1).add(root.val);
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
        List<List<Integer>> ans = levelOrderBottom(p);
        System.out.println(ans);
    }
    
}
