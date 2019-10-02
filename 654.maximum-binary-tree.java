/*
 * @lc app=leetcode id=654 lang=java
 *
 * [654] Maximum Binary Tree
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        //beware that length should -1
        return constuctHalf(nums, 0, nums.length - 1);
    }
    
    public TreeNode constuctHalf(int[] nums, int l, int r){
        if(r == l){
            return new TreeNode(nums[l]);
        }else if(l < 0 || l > r || r >= nums.length){
            return null;
        }
            
        int m = getMaxIndex(nums, l, r);
        TreeNode root = new TreeNode(nums[m]);

        root.left = constuctHalf(nums, l, m-1);
        root.right = constuctHalf(nums, m+1, r);

        return root;
        
    }

    public int getMaxIndex(int[] nums, int l, int r){
        int m = l;
        // !!! the for loop should start at l, not 0
        for(int i = l; i <= r; i ++){
            if (nums[m] < nums[i]){
                m = i;
            }
        }
        return m;
    }
}
// @lc code=end

