/*
 * @lc app=leetcode id=559 lang=java
 *
 * [559] Maximum Depth of N-ary Tree
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }
        
        int count = 0;
        for(Node node: root.children){
            count = Math.max(maxDepth(node), count);
        }

        /* if use this alternative, the memory can be a little fewer
            int cur_dep = maxDepth(node);
            if (cur_dep > max_dep)
                max_dep = cur_dep;
        */
        return count + 1;
    }
    
}
// @lc code=end

