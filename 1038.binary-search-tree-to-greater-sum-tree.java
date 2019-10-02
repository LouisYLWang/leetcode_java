/*
 * @lc app=leetcode id=1038 lang=java
 *
 * [1038] Binary Search Tree to Greater Sum Tree
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

    //inverse preorder recursion
    public TreeNode bstToGst(TreeNode root) {
        revInorder(root, 0);
        return root;
    }
    
    public int revInorder(TreeNode root, int a){
        if(root == null){
            return a;
        }
        // add root.right.left.val to root
        root.val += revInorder(root.right, a);
        // add root.val to left
        return revInorder(root.left, root.val);
    }
}   
/*
    //inverse preorder iteration
    public TreeNode bstToGst(TreeNode root) {
        int a = 0;
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        while (stack.empty() != true || cur != null){
            if(cur == null){
                TreeNode temp = stack.pop();
                temp.val = temp.val + a;
                a = temp.val;
                cur = temp.left;
            }
            else{
                stack.push(cur);
                cur = cur.right;
            }
        }
        return root;
    }
}*/
// @lc code=end

