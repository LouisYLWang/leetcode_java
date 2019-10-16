/*
 * @lc app=leetcode id=783 lang=java
 *
 * [783] Minimum Distance Between BST Nodes
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public int minDiffInBST(TreeNode root) {
        int ans = 101;
        return Helper(root)[2];
        
    }
    
    public int[] Helper(TreeNode root){
        int[] res = {root.val, root.val, 101};
        int[] lres = {root.val, 0, 101};
        int[] rres = {root.val * 2, root.val, 101};
        int min_dis;
        
        if (root.left == null && root.right == null){
            return res;
        }
        
        if(root.left!=null){
            lres = Helper(root.left);
        }
        if(root.right!=null){
            rres = Helper(root.right);
        }
        res[0] = lres[0];
        res[1] = rres[1];
        min_dis = Math.min(root.val - lres[1], rres[0] - root.val);
        res[2] = Math.min(Math.min(min_dis, lres[2]), rres[2]);
            
        return res;
    }
}
// @lc code=end

