// Maximum Level Sum of a Binary Tree

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
        // O(n) DFS recursion, a little faster
        int[] sumHash = new int[1000];
        int maxLv = 0;
        public int maxLevelSum(TreeNode root) {
            DFS(root, 1);
            int maxSumLv = 0;
            for(int i = 1; i <= maxLv; i++){
                if(sumHash[i] > sumHash[maxSumLv]){
                    maxSumLv = i;
                }
            }
            return maxSumLv;
        }
        
        public void DFS(TreeNode root, int level){
            sumHash[level] += root.val;
            if(level > maxLv){
                maxLv = level;
            }
            
            if(root.left != null){
                DFS(root.left, level+1);
            }
            if(root.right != null){
                DFS(root.right, level+1);
            }
        }
    }
    /* 
    // O(n) BFS iteration
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>(); 
        q.add(root);
        int flag;
        int maxLv = 1;
        int maxSum = 0;
        int curLv = 1;
        
        while (q.size() != 0){
            flag = q.size();
            int curSum = 0;

            // flag to remember count of last layer  
            while (flag != 0){
                TreeNode cur = q.poll();
                curSum += cur.val;
                if(cur.left != null) 
                    q.add(cur.left);
                if(cur.right != null) 
                    q.add(cur.right);
                flag--; 
            }
            if(curSum > maxSum){
                maxLv = curLv;
                maxSum = curSum;
            }
            curLv ++;
        }
        return maxLv;
    }
}
*/