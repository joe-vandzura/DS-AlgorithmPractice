class Solution {
    public int[] buildArray(int[] nums) {
        int sizeOfNumsArray = 0;
        for (int num : nums) {
            sizeOfNumsArray++;
        }
        int[] arranged = new int[sizeOfNumsArray];
        for (int i = 0; i < sizeOfNumsArray; i++) {
            arranged[i] = nums[nums[i]];
        }
        return arranged;
    }
}