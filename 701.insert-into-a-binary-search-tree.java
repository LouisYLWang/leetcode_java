/*
 * @lc app=leetcode id=701 lang=java
 *
 * [701] Insert into a Binary Search Tree
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root.val > val){
            if (root.left == null){
                TreeNode node = new TreeNode(val);
                root.left = node;
            }else{
                insertIntoBST(root.left, val);
            }
        }
        else{
            if(root.right == null){
                TreeNode node = new TreeNode(val);
                root.right = node;
            }else{
                insertIntoBST(root.right, val);
            }
        }
        return root;
    }
}
// @lc code=end

