/*
 * @lc app=leetcode id=807 lang=java
 *
 * [807] Max Increase to Keep City Skyline
 */

// @lc code=start
class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int m = grid[0].length;
        int n = grid.length;
        
        int[] horizontal = new int[m];
        int[] vertical = new int[n];

        
        for(int i = 0; i < m; i++){
            int a = 0;
            int b = 0; 
            for(int j = 0; j < n; j++){
                if (grid[i][j] > a){
                    a = grid[i][j];
                }
                if (grid[j][i] > b){
                    b = grid[j][i];
                }
            }
            vertical[i] = a;
            horizontal[i] = b;
        }
        int count = 0;
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                count += Math.min(vertical[j], horizontal[i]) - grid[i][j];
            }
        }
        return count;
    }
}
// @lc code=end

