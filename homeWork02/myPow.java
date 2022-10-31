class Solution {
    public double myPow(double x, int n) {
        if (x == 0) return 0;
        if (n == 0) return 1;
        if (n < 0) {
            return 1/x*myPow(1/x,-(n + 1));
        }
        double num = myPow(x, n/2);
        double res = num * num;
        if (n % 2 == 1) res *= x;
        return res;
    }
} 
    
