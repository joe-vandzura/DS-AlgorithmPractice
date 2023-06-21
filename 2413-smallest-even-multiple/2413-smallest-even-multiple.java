class Solution {
    public int smallestEvenMultiple(int n) {
        int ans = 0;
        while (ans == 0) {
            if (n % 2 == 0 && n % n == 0) {
                ans = n;
            }
            n += n;
        }
        return ans;
    }
}