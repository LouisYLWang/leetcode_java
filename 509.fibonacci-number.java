/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

// @lc code=start
class Solution {
    public int fib(int N) {
        int a = 0;
        int b = 1;
        int count = 0;
        
        while(N > count){
            int temp = a + b;
            a = b;
            b = temp;
            count ++;
                
        }
        return a;
    }
}
// @lc code=end

