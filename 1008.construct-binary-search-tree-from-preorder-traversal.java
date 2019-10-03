/*
 * @lc app=leetcode id=1008 lang=java
 *
 * [1008] Construct Binary Search Tree from Preorder Traversal
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
    public TreeNode bstFromPreorder(int[] preorder) {
        return bisectPreorder(preorder, 0, preorder.length -1);
    }
    
    public TreeNode bisectPreorder(int[] preorder, int l, int r){
        //System.out.println("l: " + preorder[l] + " r: " + preorder[r]);
        if(l == r){
            return new TreeNode(preorder[l]);
        }else if (l < r && l >= 0 && r < preorder.length){
            TreeNode root = new TreeNode(preorder[l]);
            int i = l + 1;
            
            //Java 判断如果有两个并列条件，然后前面的条件居然有更高的优先级吗？？？
            // originally "(preorder[i] < preorder[l] && i <= r)", i may exceed r
            while(i <= r && preorder[i] < preorder[l]){
                i ++ ;
            }
            root.left =  bisectPreorder(preorder, l + 1, i-1);
            root.right =  bisectPreorder(preorder, i, r);
            return root;
        }else{
            return null;
        }
    }
}
// @lc code=end

