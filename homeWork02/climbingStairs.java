class Solution {
    int[] cache;
    public int climbStairs(int n) {
        cache = new int[n + 1];
        cache[0] = 1;
        cache[1] = 1;
        helper(n);
        return cache[n];
    }
    private int helper (int n){
        if (cache[n] != 0){
            return cache[n];
        }
        cache[n] = helper(n - 1) + helper (n - 2);
        return cache[n];
    }
}