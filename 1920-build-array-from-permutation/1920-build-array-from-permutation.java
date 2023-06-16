class Solution {
    public int[] buildArray(int[] nums) {
        int[] arranged = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arranged[i] = nums[nums[i]];
        }
        return arranged;
    }
}