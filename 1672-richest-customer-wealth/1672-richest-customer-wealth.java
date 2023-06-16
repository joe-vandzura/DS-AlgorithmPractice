class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        
        for (int row = 0; row < accounts.length; row++) {
            int total = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                total += accounts[row][col];
            }
            if (total > max) {
                max = total;
            }
        }
        return max;
    }
}