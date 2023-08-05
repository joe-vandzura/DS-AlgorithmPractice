class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ans = 0;
        
        for (int num: hours) {
            if (num >= target) {
                ans++;
            }
        }
        return ans;
    }
}