class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int length = 0;
        for (int num : nums) {
            length++;
        }
        
        int[] countArray = new int[length];
        
        for (int i = 0; i < length; i++) {
            int count = 0;
            for (int j = 0; j < length; j++) {
                if (j != i && nums[j] < nums[i]) {
                    count++;
                }
            }
            countArray[i] = count;
        }
        return countArray;
    }
}