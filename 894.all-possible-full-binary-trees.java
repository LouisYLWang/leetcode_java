/*
 * @lc app=leetcode id=894 lang=java
 *
 * [894] All Possible Full Binary Trees
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
    Map<Integer, List<TreeNode>> resHash = new HashMap<> ();
    // recursion, space not very efficient
    public List<TreeNode> allPossibleFBT(int N) {
        if (resHash.containsKey(N)){
            return resHash.get(N);
        }
        
        List<TreeNode> res = new LinkedList<>();
        
        if (N == 1){
            TreeNode node = new TreeNode(0);
            res.add(node);
            return res;
        }
        
        if (N == 3){
            TreeNode node = new TreeNode(0);
            node.left = new TreeNode(0);
            node.right = new TreeNode(0);
            res.add(node);
            return res;
        }
        
        // at first make wrong i initial value, not start from 0
        for(int i = 1; i <= N - 1; i = i + 2){
            // need to claim the object type in list!
            List<TreeNode> preResL = allPossibleFBT(i);
            List<TreeNode> preResR = allPossibleFBT(N - 1 - i);

            for (TreeNode nodeL:preResL){
                for (TreeNode nodeR:preResR){
                    TreeNode node = new TreeNode(0);
                    node.left = nodeL;
                    node.right = nodeR;
                    res.add(node);
                }
            }
            
        }
        resHash.put(N, res);
        return res;
    }       
}

// @lc code=end

