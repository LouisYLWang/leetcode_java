/*
 * @lc app=leetcode id=144 lang=java
 *
 * [144] Binary Tree Preorder Traversal
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
    
    // recursive, a little faster
    List<Integer> res = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root != null){
            res.add(root.val);
            preorderTraversal(root.left); 
            preorderTraversal(root.right); 
        }
        return res;
    }
    
    // interation
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root != null){
        // not Linkedlist but LinkedList
        Stack<TreeNode> s = new Stack<>(); 
        s.add(root);
        while(s.size() != 0){
            TreeNode cur = s.pop();
            res.add(cur.val);
            if(cur.right != null) s.push(cur.right);
            if(cur.left != null) s.push(cur.left);
            }
        }
        return res;
    }
}
// @lc code=end

