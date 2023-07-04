class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        int index = 0;
        
        for (int i = 0; i <= n; i++) {
            int current = i;
            int j = 0;
            int[] binaryNumber = new int[1000];
            while (current > 0) {
                binaryNumber[j] = current % 2;
                current = current / 2;
                j++;
            }
            
            int countOfOnes = 0;
            
            for (int digit : binaryNumber) {
                if (digit == 1) {
                    countOfOnes++;
                }
            }
            ans[i] = countOfOnes;
        }
        
        return ans;
    }
}