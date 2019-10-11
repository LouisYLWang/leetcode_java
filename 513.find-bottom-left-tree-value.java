/*
 * @lc app=leetcode id=513 lang=java
 *
 * [513] Find Bottom Left Tree Value
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
    int res = 0;
    int Lv = 0;
    // did not came out a solution using iteration, but possibly using BFS;
    public int findBottomLeftValue(TreeNode root) {
        traverseHelper(root, 1);
        return res;
    }
    
    public void traverseHelper(TreeNode root, int curLV){
        if (root.left == null && root.right == null){
            if (curLV > Lv){
                Lv = curLV;
                res = root.val;
            }
        }
        if (root.left != null) traverseHelper(root.left, curLV + 1);
        if (root.right != null) traverseHelper(root.right, curLV + 1);
    }
}
// @lc code=end

