/*
 * @lc app=leetcode id=1079 lang=java
 *
 * [1079] Letter Tile Possibilities
 */

// @lc code=start
class Solution {
    public int numTilePossibilities(String tiles) {
        int[] tilesCounter = new int[26];
        for(int i = 0; i < tiles.length(); i++){
            int id = tiles.charAt(i) - 'A';
            tilesCounter[id] ++;
        }
        return countPossibilities(tilesCounter);
    }
    public int countPossibilities(int[] tilesCounter){
        int count = 0;
        for(int i = 0; i < 26; i++){
            if(tilesCounter[i] >0){
                // think the takeoff alphabet as one permutation
                tilesCounter[i] --;
                count += 1 + countPossibilities(tilesCounter);
                tilesCounter[i] ++;
            }
        }
    return count;
    }
}
// @lc code=end

