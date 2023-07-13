class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int current = 0;
        
        for (int i = 0; i < k; i++) {
            current += nums[i];
        }
        
        int temp = current;
        for (int i = k; i < nums.length; i++) {
            temp -= nums[i - k];
            temp += nums[i];
            if (temp > current) {
                current = temp;
            }
        }
        
        return (double) current / k;
    }
}