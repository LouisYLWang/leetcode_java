/*
 * @lc app=leetcode id=814 lang=java
 *
 * [814] Binary Tree Pruning
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
    public TreeNode pruneTree(TreeNode root) {
        if(getSubtreeSum(root.left) == 0){
            root.left = null;
        }else{
            pruneTree(root.left);
        }
        
        if(getSubtreeSum(root.right) == 0){
            root.right = null;
        }else{
            pruneTree(root.right);
        }
        return root;
    }
    public int getSubtreeSum(TreeNode root){
        int sum = 0;
        if(root != null){
            sum = root.val;
            sum += getSubtreeSum(root.left);
            sum += getSubtreeSum(root.right);
            }
        return sum;
    }
}
// @lc code=end

