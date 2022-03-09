class Solution {
    public int climbStairs(int n) {
        //climb either 1 or 2 steps
        int a = 0, b = 1, c = 0;
        int in = 1;
        while (in <= n) {
            c = a + b;
            a = b;
            b = c;
            in++;
        }
        return c;
    }
}