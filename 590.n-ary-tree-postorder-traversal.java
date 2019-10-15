/*
 * @lc app=leetcode id=590 lang=java
 *
 * [590] N-ary Tree Postorder Traversal
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
    // solution with more memory usage;
    List<Integer> res = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if (root == null){
            return res;
        }
        if (root.children != null){
            for(Node node:root.children){
                postorder(node);
            }
        }
        res.add(root.val);
    return res;
    }
}
// @lc code=end

