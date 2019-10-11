/*
 * @lc app=leetcode id=797 lang=java
 *
 * [797] All Paths From Source to Target
 */

// @lc code=start
class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {   
        List<List<Integer>> res = new LinkedList<>();
        traversePathHelper(res, graph, 0, new LinkedList<>());
        return res;
    }
    void traversePathHelper(List<List<Integer>> res, int[][] graph, int i, List<Integer> curPath){
        curPath.add(i);
        if(i == graph.length - 1){
            // could not fegure out why need to transfer to ArrayList
            res.add(new ArrayList(curPath));
        }
        for(int j: graph[i]){
            traversePathHelper(res, graph, j, curPath);
            curPath.remove(curPath.size() - 1);
            }    
        }
    }

// @lc code=end

