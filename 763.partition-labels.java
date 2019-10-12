/*
 * @lc app=leetcode id=763 lang=java
 *
 * [763] Partition Labels
 */

// @lc code=start
class Solution {
    public List<Integer> partitionLabels(String S) {
        int[] charLastPos = new int[26];
        List<Integer> res = new LinkedList<>();
        
        for(int i = 0; i < S.length(); i++){
            charLastPos[S.charAt(i) - 'a'] = i;
        }
        
        //System.out.println(Arrays.toString(charLastPos));
        
        int width = 0;
        //j: update the 'rightest' Last position of char
        int j = charLastPos[S.charAt(0) - 'a'];
        
        for(int i = 0; i < S.length(); i++){
            // always remember to -'a' in order find the hash index of that char
            if (j < charLastPos[S.charAt(i) - 'a']){
                j = charLastPos[S.charAt(i) - 'a'];
                
            }
            // initially I put width inside of if brach
            width++;
            
            if (i == j){
                res.add(width);
                width = 0;
            }
        }
        return res;
    }
}
// @lc code=end

